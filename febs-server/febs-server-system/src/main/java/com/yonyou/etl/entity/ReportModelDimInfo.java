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
    @TableName("report_model_dim_info")
    public class ReportModelDimInfo implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("dim_id")
    private String dimId;

        @TableField("code")
    private String code;

        @TableField("name")
    private String name;

        @TableField("datasource")
    private String datasource;

        @TableField("data_type")
    private Integer dataType;

        @TableField("default_value")
    private String defaultValue;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("relation")
    private String relation;

        @TableField("ytenant_id")
    private String ytenantId;


}