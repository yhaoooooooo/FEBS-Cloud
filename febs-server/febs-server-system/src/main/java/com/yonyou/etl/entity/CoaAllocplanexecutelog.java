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
    @TableName("coa_allocplanexecutelog")
    public class CoaAllocplanexecutelog implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("allocplan")
    private String allocplan;

        @TableField("logid")
    private String logid;

        @TableField("period")
    private String period;

        @TableField("timetask")
    private String timetask;

        @TableField("status")
    private String status;

        @TableField("jobbegintime")
    private String jobbegintime;

        @TableField("jobendtime")
    private String jobendtime;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("confirmstatus")
    private String confirmstatus;

        @TableField("exetype")
    private String exetype;

        @TableField("databegintime")
    private String databegintime;

        @TableField("dataendtime")
    private String dataendtime;

        @TableField("message")
    private String message;

        @TableField("ytenant_id")
    private String ytenantId;


}