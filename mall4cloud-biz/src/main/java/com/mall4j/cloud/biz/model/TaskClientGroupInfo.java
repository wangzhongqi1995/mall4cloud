package com.mall4j.cloud.biz.model;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 任务客户群表
 */
@Data
@TableName("cp_task_client_group_info")
public class TaskClientGroupInfo {
    /**
     * 主键
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 逻辑删除
     */
    private Integer delFlag;
    /**
     * 任务id
     */
    private Long taskId;
    /**
     * 客户群id
     */
    private String clientGroupId;

    /**
     * 客户群名称
     */
    private String clientGroupName;
}

