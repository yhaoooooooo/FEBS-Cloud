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
* 日志表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("pub_etl_log")
    public class PubEtlLog implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * ID
            */
            @TableId(value = "pk_job", type = IdType.AUTO)
    private Integer pkJob;

            /**
            * 任务名称
            */
        @TableField("job_name")
    private String jobName;

            /**
            * 任务日期
            */
        @TableField("etl_date")
    private String etlDate;

            /**
            * 状态
            */
        @TableField("etl_status")
    private String etlStatus;

            /**
            * 开始时间
            */
        @TableField("etl_starttime")
    private String etlStarttime;

            /**
            * 截止时间
            */
        @TableField("etl_endtime")
    private String etlEndtime;

            /**
            * 用时_秒
            */
        @TableField("etl_timenum")
    private Integer etlTimenum;

            /**
            * 描述
            */
        @TableField("etl_desc")
    private String etlDesc;


}