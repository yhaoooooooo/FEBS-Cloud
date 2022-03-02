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
    @TableName("coa_coexestatus_bak1")
    public class CoaCoexestatusBak1 implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("allocplan")
    private String allocplan;

        @TableField("allocrule")
    private String allocrule;

        @TableField("year")
    private String year;

        @TableField("period")
    private String period;

        @TableField("checkstatus")
    private String checkstatus;

        @TableField("checktime")
    private String checktime;

        @TableField("checkuser")
    private String checkuser;

        @TableField("exestatus")
    private String exestatus;

        @TableField("exeuser")
    private String exeuser;

        @TableField("exetime")
    private String exetime;

        @TableField("confirmstatus")
    private String confirmstatus;

        @TableField("batchno")
    private String batchno;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("ytenant_id")
    private String ytenantId;


}