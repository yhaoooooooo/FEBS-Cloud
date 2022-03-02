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
* 辅助余额表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("cw_fact_balance_auxiliary")
    public class CwFactBalanceAuxiliary implements Serializable {

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
            * 账簿启用状态
            */
        @TableField("accbook_enable")
    private String accbookEnable;

            /**
            * 科目ID
            */
        @TableField("accsubject_id")
    private String accsubjectId;

            /**
            * 科目编码
            */
        @TableField("accsubject_code")
    private String accsubjectCode;

            /**
            * 科目名称
            */
        @TableField("accsubject_name")
    private String accsubjectName;

            /**
            * 上级科目ID
            */
        @TableField("accsubject_pid")
    private String accsubjectPid;

            /**
            * 币种ID
            */
        @TableField("currency_id")
    private String currencyId;

            /**
            * 币种编码
            */
        @TableField("currency_code")
    private String currencyCode;

            /**
            * 币种名称
            */
        @TableField("currency_name")
    private String currencyName;

            /**
            * 币种符号
            */
        @TableField("currency_sign")
    private String currencySign;

            /**
            * 币种启用状态
            */
        @TableField("currency_enable")
    private String currencyEnable;

            /**
            * 标记
            */
        @TableField("flag")
    private String flag;

            /**
            * 期间
            */
        @TableField("cperiod")
    private String cperiod;

            /**
            * 金额类型
            */
        @TableField("je_type")
    private String jeType;

            /**
            *  本币借方
            */
        @TableField("localdebitamount")
    private BigDecimal localdebitamount;

            /**
            * 本币贷方
            */
        @TableField("localcreditamount")
    private BigDecimal localcreditamount;

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
            * 辅助核算类型PK
            */
        @TableField("fz_type_pk")
    private String fzTypePk;

            /**
            * 辅助核算类型编码
            */
        @TableField("fz_type_code")
    private String fzTypeCode;

            /**
            * 辅助核算类型名称
            */
        @TableField("fz_type_name")
    private String fzTypeName;

            /**
            * 辅助核算表ID
            */
        @TableField("fz_type_table_pk")
    private String fzTypeTablePk;

            /**
            * 辅助核算成员PK
            */
        @TableField("fz_pk")
    private String fzPk;

            /**
            * 辅助核算成员编码
            */
        @TableField("fz_code")
    private String fzCode;

            /**
            * 辅助核算成员名称
            */
        @TableField("fz_name")
    private String fzName;

        @TableField("ytenant_id")
    private String ytenantId;


}