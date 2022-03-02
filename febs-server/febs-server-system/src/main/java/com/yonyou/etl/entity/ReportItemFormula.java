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
    @TableName("report_item_formula")
    public class ReportItemFormula implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("model_id")
    private String modelId;

        @TableField("rpt_item_code")
    private String rptItemCode;

        @TableField("rpt_item_id")
    private String rptItemId;

        @TableField("subjectcode")
    private String subjectcode;

        @TableField("symbol")
    private String symbol;

            /**
            * 计算项/数据项
            */
        @TableField("type")
    private String type;

        @TableField("appid")
    private String appid;

        @TableField("tenantid")
    private String tenantid;

        @TableField("accsubjectchart")
    private String accsubjectchart;

        @TableField("ts")
    private String ts;

            /**
            * 公式级别
            */
        @TableField("level_id")
    private String levelId;

        @TableField("rule")
    private String rule;

        @TableField("rpt_item_rule")
    private String rptItemRule;

        @TableField("srctplid")
    private String srctplid;

        @TableField("sort")
    private Integer sort;

            /**
            * 源数据类型：	1：科目	2：现金流量
            */
        @TableField("src_data_type")
    private Integer srcDataType;

        @TableField("auxiliary_hash")
    private String auxiliaryHash;

        @TableField("ytenant_id")
    private String ytenantId;


}