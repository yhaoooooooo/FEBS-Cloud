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
* 报表项目聚合公式计算表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("report_item_aggr_formula")
    public class ReportItemAggrFormula implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("aggr_rptitem_id")
    private String aggrRptitemId;

        @TableField("rptitem_id")
    private String rptitemId;

        @TableField("symbol")
    private String symbol;

        @TableField("type")
    private String type;

        @TableField("appid")
    private String appid;

        @TableField("tenantid")
    private String tenantid;

        @TableField("ts")
    private String ts;

        @TableField("aggregation_weight")
    private Double aggregationWeight;

            /**
            * 公式级别
            */
        @TableField("level_id")
    private String levelId;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}