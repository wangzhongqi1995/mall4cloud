package com.mall4j.cloud.biz.model;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 任务回访信息信息
 */
@Data
@TableName("cp_task_visit_result_info")
public class TaskVisitResultInfo {
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
     * 调度详情id
     */
    private Long executeDetailId;
    /**
     * 回访信息
     */
    private String resultInfo;
    /**
     * 附件信息
     */
    private String fileInfo;
}

