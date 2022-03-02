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
    @TableName("coa_coexception")
    public class CoaCoexception implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("allocplan")
    private String allocplan;

        @TableField("allocrule")
    private String allocrule;

        @TableField("parentAllocrule")
    private String parentallocrule;

        @TableField("syear")
    private String syear;

        @TableField("speriod")
    private String speriod;

        @TableField("exetype")
    private String exetype;

        @TableField("exception")
    private String exception;

        @TableField("exeuser")
    private String exeuser;

        @TableField("exedatetime")
    private String exedatetime;

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