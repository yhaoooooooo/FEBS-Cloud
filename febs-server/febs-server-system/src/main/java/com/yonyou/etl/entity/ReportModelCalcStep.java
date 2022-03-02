package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("report_model_calc_step")
    public class ReportModelCalcStep implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("calc_model_id")
    private String calcModelId;

        @TableField("step")
    private Integer step;

        @TableField("step_name")
    private String stepName;

        @TableField("step_desc")
    private String stepDesc;

        @TableField("order")
    private Integer order;

        @TableField("step_name2")
    private String stepName2;

        @TableField("step_name3")
    private String stepName3;

        @TableField("step_name4")
    private String stepName4;

        @TableField("step_name5")
    private String stepName5;

        @TableField("step_name6")
    private String stepName6;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}