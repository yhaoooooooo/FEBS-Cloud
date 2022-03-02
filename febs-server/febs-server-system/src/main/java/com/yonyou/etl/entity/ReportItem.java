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
    @TableName("report_item")
    public class ReportItem implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("pid")
    private String pid;

        @TableField("code")
    private String code;

        @TableField("aggregation")
    private String aggregation;

        @TableField("aggregation_weight")
    private Double aggregationWeight;

        @TableField("level")
    private Integer level;

        @TableField("is_leaf")
    private Integer isLeaf;

        @TableField("rpt_item_id")
    private String rptItemId;

        @TableField("model_id")
    private String modelId;

        @TableField("sort")
    private Integer sort;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}