package com.mall4j.cloud.biz.mapper.cp;

import com.mall4j.cloud.biz.dto.cp.DistributionMomentsDTO;
import com.mall4j.cloud.biz.model.cp.DistributionMoments;
import com.mall4j.cloud.biz.vo.cp.DistributionMomentsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 分销推广-朋友圈
 *
 * @author ZengFanChang
 * @date 2021-12-22 22:05:57
 */
public interface DistributionMomentsMapper {

	/**
	 * 获取分销推广-朋友圈列表
	 * @return 分销推广-朋友圈列表
	 */
	List<DistributionMoments> list(@Param("distributionMoments") DistributionMomentsDTO distributionMomentsDTO);

	List<DistributionMoments> timeOutList();

	/**
	 * 根据分销推广-朋友圈id获取分销推广-朋友圈
	 *
	 * @param id 分销推广-朋友圈id
	 * @return 分销推广-朋友圈
	 */
	DistributionMoments getById(@Param("id") Long id);

	/**
	 * 保存分销推广-朋友圈
	 * @param distributionMoments 分销推广-朋友圈
	 */
	void save(@Param("distributionMoments") DistributionMoments distributionMoments);

	/**
	 * 更新分销推广-朋友圈
	 * @param distributionMoments 分销推广-朋友圈
	 */
	void update(@Param("distributionMoments") DistributionMoments distributionMoments);

	/**
	 * 根据分销推广-朋友圈id删除分销推广-朋友圈
	 * @param id
	 */
	void deleteById(@Param("id") Long id);

	void updateStatusBatch(@Param("ids") List<Long> ids, @Param("status") Integer status);

	int countMomentsTopNum();

	void momentsTop(@Param("id") Long id, @Param("top") Integer top);

	List<DistributionMomentsVO> pageEffect(@Param("distributionMoments") DistributionMomentsDTO dto);

	void updateJobId(@Param("id") Long id, @Param("jobId") String jobId);

	void enable(@Param("id")Long id);

	void disable(@Param("id")Long id);

	void timeOut(@Param("id")Long id,@Param("sendStatus")Integer sendStatus,@Param("updateBy")String updateBy);

    List<DistributionMoments> getMomentTaskResult();

	void updateTaskResult(@Param("id")Long id, @Param("momentId")String momentId,@Param("result")String result);

	List<DistributionMoments> getMomentPublishStatus();
}
