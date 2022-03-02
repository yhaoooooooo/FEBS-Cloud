package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("fi_balance")
    public class FiBalance implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("creationtime")
    private String creationtime;

        @TableField("creator")
    private String creator;

        @TableField("description")
    private String description;

        @TableField("dr")
    private Integer dr;

        @TableField("modifiedtime")
    private String modifiedtime;

        @TableField("modifier")
    private String modifier;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("ts")
    private String ts;

        @TableField("accbook")
    private String accbook;

        @TableField("accsubject")
    private String accsubject;

        @TableField("auxiliary")
    private String auxiliary;

        @TableField("creditamount")
    private BigDecimal creditamount;

        @TableField("creditquantity")
    private BigDecimal creditquantity;

        @TableField("currency")
    private String currency;

        @TableField("debitamount")
    private BigDecimal debitamount;

        @TableField("debitquantity")
    private BigDecimal debitquantity;

        @TableField("def1")
    private String def1;

        @TableField("def2")
    private String def2;

        @TableField("def3")
    private String def3;

        @TableField("def4")
    private String def4;

        @TableField("def5")
    private String def5;

        @TableField("def6")
    private String def6;

        @TableField("flag")
    private String flag;

        @TableField("localcreditamount")
    private BigDecimal localcreditamount;

        @TableField("localdebitamount")
    private BigDecimal localdebitamount;

        @TableField("period")
    private String period;

        @TableField("accbody")
    private String accbody;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("periodadjust")
    private String periodadjust;

        @TableField("secondorg")
    private String secondorg;

        @TableField("ytenant_id")
    private String ytenantId;


}