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
import java.time.LocalDateTime;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("cf_cashflow")
    public class CfCashflow implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("accbook")
    private String accbook;

        @TableField("period")
    private String period;

        @TableField("voucher")
    private String voucher;

        @TableField("cashflowitem")
    private String cashflowitem;

        @TableField("direction")
    private String direction;

        @TableField("accsubject")
    private String accsubject;

        @TableField("oppsubject")
    private String oppsubject;

        @TableField("currency")
    private String currency;

        @TableField("amountoriginal")
    private BigDecimal amountoriginal;

        @TableField("amountorg")
    private BigDecimal amountorg;

        @TableField("manual")
    private Boolean manual;

        @TableField("rule")
    private String rule;

        @TableField("voucherrecord")
    private String voucherrecord;

        @TableField("description")
    private String description;

        @TableField("ts")
    private LocalDateTime ts;

        @TableField("creator")
    private String creator;

        @TableField("creationtime")
    private String creationtime;

        @TableField("modifier")
    private String modifier;

        @TableField("modifiedtime")
    private String modifiedtime;

        @TableField("name")
    private String name;

        @TableField("dr")
    private Integer dr;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("version")
    private LocalDateTime version;

        @TableField("voucherbillcode")
    private Integer voucherbillcode;

        @TableField("vouchermaketime")
    private String vouchermaketime;

        @TableField("vouchertype")
    private String vouchertype;

        @TableField("voucherdescription")
    private String voucherdescription;

        @TableField("def2")
    private String def2;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("flag")
    private String flag;

        @TableField("voucherrecordnumber")
    private Integer voucherrecordnumber;

        @TableField("periodadjust")
    private String periodadjust;

        @TableField("periodunion")
    private String periodunion;

        @TableField("innerorg")
    private String innerorg;

        @TableField("voucherstatus")
    private String voucherstatus;

        @TableField("ytenant_id")
    private String ytenantId;


}