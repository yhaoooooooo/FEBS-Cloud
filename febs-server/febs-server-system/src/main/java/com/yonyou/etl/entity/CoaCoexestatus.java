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
    @TableName("coa_coexestatus")
    public class CoaCoexestatus implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("allocplan")
    private String allocplan;

        @TableField("allocrule")
    private String allocrule;

        @TableField("period")
    private String period;

        @TableField("checkstatus")
    private String checkstatus;

        @TableField("checktime")
    private String checktime;

        @TableField("checkuser")
    private String checkuser;

        @TableField("preparestatus")
    private String preparestatus;

        @TableField("prepareuser")
    private String prepareuser;

        @TableField("exestatus")
    private String exestatus;

        @TableField("exeuser")
    private String exeuser;

        @TableField("exetime")
    private String exetime;

        @TableField("confirmstatus")
    private String confirmstatus;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("exeFinishTime")
    private String exefinishtime;

        @TableField("dataStartTime")
    private String datastarttime;

        @TableField("dataEndTime")
    private String dataendtime;

        @TableField("process")
    private String process;

        @TableField("message")
    private String message;

        @TableField("timetask")
    private String timetask;

        @TableField("logid")
    private String logid;

        @TableField("exetype")
    private String exetype;

        @TableField("confirmtime")
    private String confirmtime;

        @TableField("ytenant_id")
    private String ytenantId;


}