package com.mall4j.cloud.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class AddPushSonTaskDTO {

    @NotBlank(message = "子任务名称为必传项")
    @ApiModelProperty(value = "推送名称（子任务名称）")
    private String sonTaskName;

    @NotNull(message = "开始时间为必传项")
    @ApiModelProperty(value = "开始时间")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @NotNull(message = "结束时间为必传项")
    @ApiModelProperty(value = "结束时间")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @NotBlank(message = "推送内容为必传项")
    @ApiModelProperty(value = "推送内容")
    private String pushContent;

    @Size(max = 9, message = "最多支持9个素材内容")
    @ApiModelProperty(value = "推送素材列表")
    private List<AddPushSonTaskMediaDTO> mediaList;
}
