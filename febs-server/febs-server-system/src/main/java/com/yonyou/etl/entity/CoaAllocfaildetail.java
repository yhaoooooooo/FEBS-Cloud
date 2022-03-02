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
    @TableName("coa_allocfaildetail")
    public class CoaAllocfaildetail implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("allocplan")
    private String allocplan;

        @TableField("accentity")
    private String accentity;

        @TableField("accbook")
    private String accbook;

        @TableField("billcode")
    private String billcode;

        @TableField("vouchertype")
    private String vouchertype;

        @TableField("busidate")
    private String busidate;

        @TableField("maketime")
    private String maketime;

        @TableField("srcsystem")
    private String srcsystem;

        @TableField("recordnumber")
    private String recordnumber;

        @TableField("recordid")
    private String recordid;

        @TableField("description")
    private String description;

        @TableField("allocrule")
    private String allocrule;

        @TableField("rootrule")
    private String rootrule;

        @TableField("rootorg")
    private String rootorg;

        @TableField("srcorg")
    private String srcorg;

        @TableField("descorg")
    private String descorg;

        @TableField("syear")
    private String syear;

        @TableField("speriod")
    private String speriod;

        @TableField("rootfactor")
    private String rootfactor;

        @TableField("srcfactor")
    private String srcfactor;

        @TableField("descfactor")
    private String descfactor;

        @TableField("rootcurrtype")
    private String rootcurrtype;

        @TableField("srccurrtype")
    private String srccurrtype;

        @TableField("rootdcorient")
    private String rootdcorient;

        @TableField("srcdcorient")
    private String srcdcorient;

        @TableField("descdcorient")
    private String descdcorient;

        @TableField("rootdimgroups")
    private String rootdimgroups;

        @TableField("srcdimgroups")
    private String srcdimgroups;

        @TableField("descdimgroups")
    private String descdimgroups;

        @TableField("rootcostcenter")
    private String rootcostcenter;

        @TableField("costcenter")
    private String costcenter;

        @TableField("desccostcenter")
    private String desccostcenter;

        @TableField("credit_org")
    private BigDecimal creditOrg;

        @TableField("debit_org")
    private BigDecimal debitOrg;

        @TableField("failreason")
    private String failreason;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("amount")
    private BigDecimal amount;

        @TableField("ytenant_id")
    private String ytenantId;


}