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
    @TableName("fi_voucher")
    public class FiVoucher implements Serializable {

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

        @TableField("attachedbill")
    private Integer attachedbill;

        @TableField("auditor")
    private String auditor;

        @TableField("audittime")
    private String audittime;

        @TableField("billcode")
    private Integer billcode;

        @TableField("def1")
    private String def1;

        @TableField("def10")
    private String def10;

        @TableField("def11")
    private String def11;

        @TableField("def12")
    private String def12;

        @TableField("def13")
    private String def13;

        @TableField("def14")
    private String def14;

        @TableField("def15")
    private String def15;

        @TableField("def16")
    private String def16;

        @TableField("def17")
    private String def17;

        @TableField("def18")
    private String def18;

        @TableField("def19")
    private String def19;

        @TableField("def2")
    private String def2;

        @TableField("def20")
    private String def20;

        @TableField("def21")
    private String def21;

        @TableField("def22")
    private String def22;

        @TableField("def23")
    private String def23;

        @TableField("def24")
    private String def24;

        @TableField("def25")
    private String def25;

        @TableField("def26")
    private String def26;

        @TableField("def27")
    private String def27;

        @TableField("def28")
    private String def28;

        @TableField("def29")
    private String def29;

        @TableField("def3")
    private String def3;

        @TableField("def30")
    private String def30;

        @TableField("def4")
    private String def4;

        @TableField("def5")
    private String def5;

        @TableField("def6")
    private String def6;

        @TableField("def7")
    private String def7;

        @TableField("def8")
    private String def8;

        @TableField("def9")
    private String def9;

        @TableField("maker")
    private String maker;

        @TableField("maketime")
    private String maketime;

        @TableField("period")
    private String period;

        @TableField("signer")
    private String signer;

        @TableField("signtime")
    private String signtime;

        @TableField("srcsystem")
    private String srcsystem;

        @TableField("tallyman")
    private String tallyman;

        @TableField("tallytime")
    private String tallytime;

        @TableField("totalcredit_global")
    private BigDecimal totalcreditGlobal;

        @TableField("totalcredit_group")
    private BigDecimal totalcreditGroup;

        @TableField("totalcredit_org")
    private BigDecimal totalcreditOrg;

        @TableField("totaldebit_global")
    private BigDecimal totaldebitGlobal;

        @TableField("totaldebit_group")
    private BigDecimal totaldebitGroup;

        @TableField("totaldebit_org")
    private BigDecimal totaldebitOrg;

        @TableField("voucherkind")
    private String voucherkind;

        @TableField("vouchertype")
    private String vouchertype;

        @TableField("flag")
    private String flag;

        @TableField("status")
    private String status;

        @TableField("accbody")
    private String accbody;

        @TableField("displayname")
    private String displayname;

        @TableField("displayname2")
    private String displayname2;

        @TableField("displayname3")
    private String displayname3;

        @TableField("displayname4")
    private String displayname4;

        @TableField("displayname5")
    private String displayname5;

        @TableField("displayname6")
    private String displayname6;

        @TableField("voucherstatus")
    private String voucherstatus;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("editrule")
    private String editrule;

        @TableField("srcsystemid")
    private String srcsystemid;

        @TableField("otpsign")
    private String otpsign;

        @TableField("otpinfo")
    private String otpinfo;

        @TableField("periodadjust")
    private String periodadjust;

        @TableField("periodunion")
    private String periodunion;

        @TableField("secondorg")
    private String secondorg;

        @TableField("reqid")
    private String reqid;

        @TableField("ytenant_id")
    private String ytenantId;


}