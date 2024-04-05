package com.mall4j.cloud.biz.config;

import com.google.common.collect.Maps;
import com.mall4j.cloud.biz.model.cp.Config;
import com.mall4j.cloud.biz.service.cp.ConfigService;
import com.mall4j.cloud.biz.service.cp.handler.WxCpExtConsts;
import com.mall4j.cloud.biz.service.cp.handler.simple.ChatChangeHandler;
import com.mall4j.cloud.biz.service.cp.handler.simple.ContactChangeHandler;
import com.mall4j.cloud.biz.service.cp.handler.simple.ExternalContactChangeHandler;
import com.mall4j.cloud.biz.service.cp.handler.simple.MsgHandler;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.cp.api.WxCpService;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.config.impl.WxCpRedissonConfigImpl;
import me.chanjar.weixin.cp.constant.WxCpConsts;
import me.chanjar.weixin.cp.message.WxCpMessageRouter;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * 员工活码基础版
 * @Author: hwy
 * @Description:
 * @Date: 2022-02-09 15:30
 * @Version: 1.0
 */
@Slf4j
//@Configuration
public class WxCpConfiguration {
    private static final String CP_CONNECT_KEY_PREFIX = "mall4cloud:cp_connect_key_prefix";
    private static final String CP_EXTERNAL_KEY_PREFIX = "mall4cloud:cp_external_key_prefix";
    public static final int CP_CONNECT_AGENT_ID = 10001;
//    public static final int CP_EXTERNAL_AGENT_ID = 1000003;
    private ConfigService configService;
    private  RedissonClient redissonClient;
    private ContactChangeHandler contactChangeHandler;
    private ExternalContactChangeHandler externalContactChangeHandler;
    private ChatChangeHandler chatChangeHandler;
    private MsgHandler msgHandler;
    private  static Config config ;

    public static String getCompanyName(){return config.getCompanyName();}

    public static String getPicUrl(){return config.getPicUrl();}

    public static int getAgentId(){return config.getAgentId();}
    public static String getCpId(){return config.getCpId();}
    @Getter
    private static Map<Integer, WxCpMessageRouter> routers = Maps.newHashMap();

    private static Map<Integer, WxCpService> wxCpServices = Maps.newHashMap();

    public static WxCpService getWxCpService(int key){
        return wxCpServices.get(key);
    }

    @Autowired
    public WxCpConfiguration(ConfigService configService, RedissonClient redissonClient, ContactChangeHandler contactChangeHandler,
                             ExternalContactChangeHandler externalContactChangeHandler, ChatChangeHandler chatChangeHandler, MsgHandler msgHandler) {
         this.configService = configService;
         this.redissonClient = redissonClient;
         this.chatChangeHandler = chatChangeHandler;
         this.contactChangeHandler = contactChangeHandler;
         this.externalContactChangeHandler = externalContactChangeHandler;
         this.msgHandler = msgHandler;
    }
    /**
     * 从数据库获取配置构造wxCpService
     */
    @PostConstruct
    public void initServices() {
        config = configService.getConfig();
        registerConnectCpService();
        registerExternalCpService();
    }



    public  void  registerConnectCpService(){
        WxCpRedissonConfigImpl wxCpRedisConfig = new WxCpRedissonConfigImpl(redissonClient, CP_CONNECT_KEY_PREFIX);
        wxCpRedisConfig.setCorpId(config.getCpId());
        wxCpRedisConfig.setAgentId(CP_CONNECT_AGENT_ID);
        wxCpRedisConfig.setCorpSecret(config.getSecret());
        wxCpRedisConfig.setToken(config.getToken());
        wxCpRedisConfig.setAesKey(config.getEncodingAesKey());
        WxCpService wxConnectCpService = new WxCpServiceImpl();
        wxConnectCpService.setWxCpConfigStorage(wxCpRedisConfig);
        wxCpServices.put(wxCpRedisConfig.getAgentId(),wxConnectCpService);
        routers.put(wxCpRedisConfig.getAgentId(),newRouter(wxConnectCpService));
    }

    private void  registerExternalCpService(){
        WxCpRedissonConfigImpl wxCpRedisConfig = new WxCpRedissonConfigImpl(redissonClient, CP_EXTERNAL_KEY_PREFIX);
        wxCpRedisConfig.setCorpId(config.getCpId());
        wxCpRedisConfig.setAgentId(config.getAgentId());
        wxCpRedisConfig.setCorpSecret(config.getExternalSecret());
        wxCpRedisConfig.setToken(config.getExternalToken());
        wxCpRedisConfig.setAesKey(config.getExternalAesKey());
        WxCpService wxConnectCpService = new WxCpServiceImpl();
        wxConnectCpService.setWxCpConfigStorage(wxCpRedisConfig);
        wxCpServices.put(wxCpRedisConfig.getAgentId(),wxConnectCpService);
        routers.put(wxCpRedisConfig.getAgentId(),newRouter(wxConnectCpService));
    }
    /**
     * 构造消息路由
     * @param wxCpService wxCpService
     * @return WxCpMessageRouter
     */
    private WxCpMessageRouter newRouter(WxCpService wxCpService) {
        WxCpMessageRouter newRouter = new WxCpMessageRouter(wxCpService);
        //通讯录成员
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxCpConsts.EventType.CHANGE_CONTACT).handler(this.contactChangeHandler).end();

        //客户事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxCpConsts.EventType.CHANGE_EXTERNAL_CONTACT).handler(this.externalContactChangeHandler).end();

        //客户事件
        newRouter.rule().async(false).msgType(WxConsts.XmlMsgType.EVENT)
                .event(WxCpExtConsts.EventType.CHANGE_EXTERNAL_CHAT).handler(this.chatChangeHandler).end();

        // 默认
        newRouter.rule().async(false).handler(this.msgHandler).end();

        return newRouter;
    }
}
