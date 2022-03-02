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
* 利润表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("cw_fact_rpt_costtrend")
    public class CwFactRptCosttrend implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * ID
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 租户ID
            */
        @TableField("tenantid")
    private String tenantid;

            /**
            * 报表项目编码
            */
        @TableField("report_code")
    private String reportCode;

            /**
            * 报表项目名称
            */
        @TableField("report_name")
    private String reportName;

            /**
            * 期间
            */
        @TableField("cperiod")
    private String cperiod;

            /**
            * 账簿ID
            */
        @TableField("accbook_id")
    private String accbookId;

            /**
            * 账簿编码
            */
        @TableField("accbook_code")
    private String accbookCode;

            /**
            * 账簿名称
            */
        @TableField("accbook_name")
    private String accbookName;

            /**
            * 记账标志
            */
        @TableField("tallystatus")
    private Integer tallystatus;

            /**
            * 记账标志名称
            */
        @TableField("tallystatus_name")
    private String tallystatusName;

            /**
            * 本期金额
            */
        @TableField("bqje")
    private BigDecimal bqje;

            /**
            * 上期金额
            */
        @TableField("sqje")
    private BigDecimal sqje;

        @TableField("ytenant_id")
    private String ytenantId;


}