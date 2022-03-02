package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("report_model_exec_strategy")
    public class ReportModelExecStrategy implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("run_mode")
    private String runMode;

        @TableField("cron")
    private String cron;

        @TableField("lasttime")
    private LocalDateTime lasttime;

        @TableField("trigger_script")
    private String triggerScript;

        @TableField("trigger_api")
    private String triggerApi;

        @TableField("calc_model_id")
    private String calcModelId;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            /**
            * 开始位置
            */
        @TableField("step")
    private Integer step;

        @TableField("ytenant_id")
    private String ytenantId;


}