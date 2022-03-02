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
import java.sql.Blob;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("resp_vouchertemp")
    public class RespVouchertemp implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("accbook")
    private String accbook;

        @TableField("vouchertype")
    private String vouchertype;

        @TableField("billcode")
    private Integer billcode;

        @TableField("maketime")
    private String maketime;

        @TableField("maker")
    private String maker;

        @TableField("busidate")
    private String busidate;

        @TableField("period")
    private String period;

        @TableField("attachedbill")
    private Integer attachedbill;

        @TableField("auditor")
    private String auditor;

        @TableField("audittime")
    private String audittime;

        @TableField("srcsystem")
    private String srcsystem;

        @TableField("srcsystemid")
    private String srcsystemid;

        @TableField("totalcredit_global")
    private BigDecimal totalcreditGlobal;

        @TableField("totalcredit_org")
    private BigDecimal totalcreditOrg;

        @TableField("totaldebit_global")
    private BigDecimal totaldebitGlobal;

        @TableField("totaldebit_org")
    private BigDecimal totaldebitOrg;

        @TableField("voucherstatus")
    private String voucherstatus;

        @TableField("accentity")
    private String accentity;

        @TableField("accentity_v")
    private String accentityV;

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

        @TableField("editrule")
    private String editrule;

        @TableField("secondorg")
    private String secondorg;

        @TableField("secondorg_v")
    private String secondorgV;

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

        @TableField("def7")
    private String def7;

        @TableField("def8")
    private String def8;

        @TableField("def9")
    private String def9;

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

        @TableField("def30")
    private String def30;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("coatag")
    private String coatag;

        @TableField("coavbid")
    private String coavbid;

        @TableField("coa_planid")
    private String coaPlanid;

        @TableField("coa_type")
    private String coaType;

        @TableField("otpsign")
    private String otpsign;

        @TableField("merge_rule")
    private String mergeRule;

        @TableField("modify_rule")
    private Blob modifyRule;

        @TableField("billid")
    private String billid;

        @TableField("ytenant_id")
    private String ytenantId;


}