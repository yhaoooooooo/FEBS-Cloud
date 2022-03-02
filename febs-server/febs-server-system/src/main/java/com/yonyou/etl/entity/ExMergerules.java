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
    @TableName("ex_mergerules")
    public class ExMergerules implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 合并规则编码
            */
        @TableField("code")
    private String code;

            /**
            * 合并规则名称
            */
        @TableField("name")
    private String name;

            /**
            * 合并规则名称
            */
        @TableField("name2")
    private String name2;

            /**
            * 合并规则名称
            */
        @TableField("name3")
    private String name3;

            /**
            * 合并规则名称
            */
        @TableField("name4")
    private String name4;

            /**
            * 合并规则名称
            */
        @TableField("name5")
    private String name5;

            /**
            * 合并规则名称
            */
        @TableField("name6")
    private String name6;

            /**
            * 是否是默认 1 是  0 否
            */
        @TableField("isdefault")
    private Boolean isdefault;

            /**
            * 合并方式：DebitCredit借贷合并 Debit借方合并 Credit贷方合并 
            */
        @TableField("merger_mode")
    private String mergerMode;

            /**
            * 凭证分录显示顺序：firestDebit先借后贷 firestCredit先贷后借  unOrder不排序
            */
        @TableField("line_order")
    private String lineOrder;

            /**
            * 同方向排序：subCode按科目编码排序 happenSort按发生顺序排序
            */
        @TableField("direction_sort")
    private String directionSort;

            /**
            * subjects_auxiliary": "科目与辅助核算相同时合并分录"  "abstract_info": "摘要不同时合并分录"  "debit_credit": "借贷不同时合并分录"  "unit_price": "单价不同时合并分录"
            */
        @TableField("merger_option")
    private String mergerOption;

            /**
            * 例外科目
            */
        @TableField("excepsub")
    private String excepsub;

        @TableField("tenantid")
    private String tenantid;

        @TableField("issocial")
    private Boolean issocial;

        @TableField("permission")
    private Integer permission;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}