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
    @TableName("bd_accbook")
    public class BdAccbook implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 账簿id
            */
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

        @TableField("pk_group")
    private String pkGroup;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("ts")
    private String ts;

        @TableField("classifyid")
    private String classifyid;

        @TableField("code")
    private String code;

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

        @TableField("enable")
    private Boolean enable;

        @TableField("name")
    private String name;

        @TableField("name2")
    private String name2;

        @TableField("name3")
    private String name3;

        @TableField("name4")
    private String name4;

        @TableField("name5")
    private String name5;

        @TableField("name6")
    private String name6;

        @TableField("parentid")
    private String parentid;

        @TableField("accperiod")
    private String accperiod;

        @TableField("accperiodscheme")
    private String accperiodscheme;

        @TableField("accpurposes")
    private String accpurposes;

        @TableField("accstandard")
    private String accstandard;

        @TableField("accsubject")
    private String accsubject;

        @TableField("autoaudit")
    private Boolean autoaudit;

        @TableField("autotally")
    private Boolean autotally;

        @TableField("balanceDisplay")
    private Boolean balancedisplay;

        @TableField("bookType")
    private String booktype;

        @TableField("currency")
    private String currency;

        @TableField("currencySchema")
    private String currencyschema;

        @TableField("incomeSubject")
    private String incomesubject;

        @TableField("loseSubject")
    private String losesubject;

        @TableField("multidimension")
    private String multidimension;

        @TableField("profitMethod")
    private String profitmethod;

        @TableField("shortname")
    private String shortname;

        @TableField("shortname2")
    private String shortname2;

        @TableField("shortname3")
    private String shortname3;

        @TableField("shortname4")
    private String shortname4;

        @TableField("shortname5")
    private String shortname5;

        @TableField("shortname6")
    private String shortname6;

        @TableField("subjectchart")
    private String subjectchart;

        @TableField("accountCheckStragegy")
    private String accountcheckstragegy;

        @TableField("cashFlowType")
    private String cashflowtype;

        @TableField("voucher_print_type")
    private String voucherPrintType;

        @TableField("aotu_supplement_NO")
    private Boolean aotuSupplementNo;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("audit_cancel")
    private Boolean auditCancel;

        @TableField("same_person")
    private Boolean samePerson;

        @TableField("same_modified")
    private Boolean sameModified;

        @TableField("sequential")
    private Boolean sequential;

        @TableField("convertable")
    private Boolean convertable;

        @TableField("modifier")
    private String modifier;

        @TableField("systemgene")
    private Integer systemgene;

        @TableField("is_secondorg")
    private Boolean isSecondorg;

        @TableField("enable_model")
    private String enableModel;

        @TableField("ratetype")
    private String ratetype;

        @TableField("carrydown_ratetype")
    private String carrydownRatetype;

            /**
            * 是否校验现金流量类型
            */
        @TableField("check_cashflow")
    private Boolean checkCashflow;

            /**
            * 是否生成凭证到下个期间
            */
        @TableField("nextperiod")
    private Boolean nextperiod;

        @TableField("ytenant_id")
    private String ytenantId;


}