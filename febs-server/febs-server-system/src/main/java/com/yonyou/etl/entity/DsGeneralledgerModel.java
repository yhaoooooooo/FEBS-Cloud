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
    @TableName("ds_generalledger_model")
    public class DsGeneralledgerModel implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("accsubject")
    private String accsubject;

        @TableField("name")
    private String name;

        @TableField("direction")
    private String direction;

        @TableField("accbook")
    private String accbook;

        @TableField("accbookcode")
    private String accbookcode;

        @TableField("accbody")
    private String accbody;

        @TableField("accstandard")
    private String accstandard;

        @TableField("period")
    private String period;

        @TableField("year")
    private String year;

        @TableField("currency")
    private String currency;

        @TableField("perbegin_debbal")
    private BigDecimal perbeginDebbal;

        @TableField("perbegin_crebal")
    private BigDecimal perbeginCrebal;

        @TableField("perbegin_bal")
    private BigDecimal perbeginBal;

        @TableField("deb_accrual")
    private BigDecimal debAccrual;

        @TableField("cre_accrual")
    private BigDecimal creAccrual;

        @TableField("accrual")
    private BigDecimal accrual;

        @TableField("perend_debbal")
    private BigDecimal perendDebbal;

        @TableField("perend_crebal")
    private BigDecimal perendCrebal;

        @TableField("perend_bal")
    private BigDecimal perendBal;

        @TableField("istally")
    private Boolean istally;

        @TableField("src_data_type")
    private Integer srcDataType;

        @TableField("other_bal")
    private BigDecimal otherBal;

        @TableField("project")
    private String project;

        @TableField("materialclass")
    private String materialclass;

        @TableField("customer")
    private String customer;

        @TableField("at_fixedassetchangetypelistref")
    private String atFixedassetchangetypelistref;

        @TableField("supplier")
    private String supplier;

        @TableField("accentityMutiBD")
    private String accentitymutibd;

        @TableField("warehouse_sdk")
    private String warehouseSdk;

        @TableField("customerclass")
    private String customerclass;

        @TableField("dept")
    private String dept;

        @TableField("warehouse")
    private String warehouse;

        @TableField("accbooktype")
    private String accbooktype;

        @TableField("accperiodscheme")
    private String accperiodscheme;

        @TableField("accproperty")
    private String accproperty;

        @TableField("microserviceparameter")
    private String microserviceparameter;

        @TableField("autosubtask")
    private String autosubtask;

        @TableField("accbooktype_sdk")
    private String accbooktypeSdk;

        @TableField("org_fin_cashacct")
    private String orgFinCashacct;

        @TableField("supplierbankacct")
    private String supplierbankacct;

        @TableField("personnel")
    private String personnel;

        @TableField("accperiodyear")
    private String accperiodyear;

        @TableField("accsubjectchart")
    private String accsubjectchart;

        @TableField("accpurposes_sdk")
    private String accpurposesSdk;

        @TableField("finorgbankacct")
    private String finorgbankacct;

        @TableField("accpurposes")
    private String accpurposes;

        @TableField("customebankacct")
    private String customebankacct;

        @TableField("accperiod")
    private String accperiod;

        @TableField("autotask")
    private String autotask;

        @TableField("feeitem")
    private String feeitem;

        @TableField("at_usagestateref")
    private String atUsagestateref;

        @TableField("accelement")
    private String accelement;

        @TableField("tenantid")
    private String tenantid;

        @TableField("ts")
    private String ts;

        @TableField("material")
    private String material;

        @TableField("ucfdef_ymh01")
    private String ucfdefYmh01;

        @TableField("ucfdef_去玩儿_del")
    private String ucfdef去玩儿Del;

        @TableField("ucfdef_颜色")
    private String ucfdef颜色;

        @TableField("ucfdef_ys1111")
    private String ucfdefYs1111;

        @TableField("ucfdef_yanse")
    private String ucfdefYanse;

        @TableField("ucfdef_ys")
    private String ucfdefYs;

        @TableField("fa_fixedassetcategory")
    private String faFixedassetcategory;

        @TableField("ucfdef_an01")
    private String ucfdefAn01;

        @TableField("bankclass")
    private String bankclass;

        @TableField("ytenant_id")
    private String ytenantId;


}