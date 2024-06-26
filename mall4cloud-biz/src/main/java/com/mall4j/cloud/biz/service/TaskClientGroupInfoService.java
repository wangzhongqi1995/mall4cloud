package com.mall4j.cloud.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall4j.cloud.biz.dto.TaskInfoDTO;
import com.mall4j.cloud.biz.model.TaskClientGroupInfo;
import com.mall4j.cloud.biz.vo.cp.taskInfo.ShoppingGuideTaskClientGroupVO;

import java.util.List;

/**
 * 任务客户群表
 */
public interface TaskClientGroupInfoService extends IService<TaskClientGroupInfo> {
    void saveTaskClientGroupInfo(TaskInfoDTO taskInfoDTO);

    void deleteByTaskId(Long taskId);

    void copyTaskClientGroupInfo(Long taskId);

    List<ShoppingGuideTaskClientGroupVO> buildShoppingGuideTaskClientGroup(Long taskId);

}