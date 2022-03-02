package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
    @TableName("tmp_voucherflow")
    public class Voucherflow implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("sessionid")
    private String sessionid;

        @TableField("accbook")
    private String accbook;

        @TableField("accsubject")
    private String accsubject;

        @TableField("period")
    private String period;

        @TableField("auxiliary")
    private String auxiliary;

        @TableField("accbody")
    private String accbody;

        @TableField("currency")
    private String currency;

        @TableField("debitamount")
    private BigDecimal debitamount;

        @TableField("localdebitamount")
    private BigDecimal localdebitamount;

        @TableField("creditamount")
    private BigDecimal creditamount;

        @TableField("localcreditamount")
    private BigDecimal localcreditamount;

        @TableField("uflag")
    private Boolean uflag;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("periodadjust")
    private String periodadjust;

        @TableField("secondorg")
    private String secondorg;

        @TableField("debitquantity")
    private BigDecimal debitquantity;

        @TableField("creditquantity")
    private BigDecimal creditquantity;

        @TableField("ytenant_id")
    private String ytenantId;


}