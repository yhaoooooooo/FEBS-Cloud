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
    @TableName("report_rptitem_auxiliary_dim_formula")
    public class ReportRptitemAuxiliaryDimFormula implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("formula_id")
    private String formulaId;

        @TableField("auxiliary_id")
    private String auxiliaryId;

        @TableField("auxiliary_code")
    private String auxiliaryCode;

        @TableField("auxiliary_item_id")
    private String auxiliaryItemId;

        @TableField("srctplid")
    private String srctplid;

        @TableField("tenantid")
    private String tenantid;

        @TableField("ts")
    private String ts;

        @TableField("auxiliary_item_code")
    private String auxiliaryItemCode;

        @TableField("rpt_item_id")
    private String rptItemId;

        @TableField("rpt_item_code")
    private String rptItemCode;

        @TableField("model_id")
    private String modelId;

        @TableField("ytenant_id")
    private String ytenantId;


}