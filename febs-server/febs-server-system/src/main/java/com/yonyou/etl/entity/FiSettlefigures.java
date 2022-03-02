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
    @TableName("fi_settlefigures")
    public class FiSettlefigures implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("accbook")
    private String accbook;

        @TableField("period")
    private String period;

        @TableField("currency")
    private String currency;

        @TableField("secondorg")
    private String secondorg;

        @TableField("accsubject")
    private String accsubject;

        @TableField("credit_org")
    private BigDecimal creditOrg;

        @TableField("debit_org")
    private BigDecimal debitOrg;

        @TableField("credit_original")
    private BigDecimal creditOriginal;

        @TableField("debit_original")
    private BigDecimal debitOriginal;

        @TableField("credit_quantity")
    private BigDecimal creditQuantity;

        @TableField("debit_quantity")
    private BigDecimal debitQuantity;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}