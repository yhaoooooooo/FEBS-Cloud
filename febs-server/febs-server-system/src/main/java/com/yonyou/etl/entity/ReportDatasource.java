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
* u8c特指总账模型
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("report_datasource")
    public class ReportDatasource implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("accsubject")
    private String accsubject;

        @TableField("direction")
    private String direction;

        @TableField("accbookcode")
    private String accbookcode;

        @TableField("accbook")
    private String accbook;

        @TableField("istally")
    private String istally;

        @TableField("period")
    private String period;

        @TableField("accbody")
    private String accbody;

        @TableField("year")
    private String year;

        @TableField("currency")
    private String currency;

        @TableField("ts")
    private String ts;

        @TableField("accstandard")
    private String accstandard;

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


}