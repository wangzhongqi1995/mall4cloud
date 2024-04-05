package com.mall4j.cloud.biz.vo;

import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * 微信消息自动回复VO
 *
 * @author FrozenWatermelon
 * @date 2022-01-17 17:52:24
 */
@Data
public class WeixinAutoMsgVO {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty("")
	private String id;

	@ApiModelProperty("公众号原始id")
	private String appId;

	/**
	 * 消息类型(text:文本消息,news:图文消息,voice:音频消息,video:视频消息,image:图片消息,wxma:小程序)
	 */
	@NotEmpty
	@ApiModelProperty("消息类型(text:文本消息,news:图文消息,voice:音频消息,video:视频消息,image:图片消息,wxma:小程序)")
	private String msgType;

	@ApiModelProperty("文字内容")
	private WeixinTextTemplateVO textTemplate;

	@ApiModelProperty("图片内容")
	private WeixinImgTemplateVO imgTemplate;

	@ApiModelProperty("小程序内容")
	private WeixinMaTemplateVO maTemplate;

	@ApiModelProperty("图文内容")
	private WeixinNewsTemplateContentVO newsTemplate;
}
