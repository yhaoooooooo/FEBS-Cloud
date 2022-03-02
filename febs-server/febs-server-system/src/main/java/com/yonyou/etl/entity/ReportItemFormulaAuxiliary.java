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
    @TableName("report_item_formula_auxiliary")
    public class ReportItemFormulaAuxiliary implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("formula_id")
    private String formulaId;

        @TableField("auxiliary_dim_code")
    private String auxiliaryDimCode;

        @TableField("auxiliary_item_id")
    private String auxiliaryItemId;

        @TableField("auxiliary_item_code")
    private String auxiliaryItemCode;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ts")
    private String ts;

        @TableField("ytenant_id")
    private String ytenantId;


}