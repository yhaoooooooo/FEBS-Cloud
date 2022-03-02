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
* 模型的事实表、维度表等标定义
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("report_model_table")
    public class ReportModelTable implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("model_id")
    private String modelId;

        @TableField("table_name")
    private String tableName;

        @TableField("table_desc")
    private String tableDesc;

        @TableField("dim_id")
    private String dimId;

        @TableField("pkcolumn")
    private String pkcolumn;

        @TableField("ts")
    private String ts;

        @TableField("type")
    private Integer type;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}