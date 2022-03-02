package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Blob;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("report_model_calc")
    public class ReportModelCalc implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 计算模型实现类型
            */
        @TableField("src_type")
    private Integer srcType;

            /**
            * 计算模型类型
            */
        @TableField("calc_type")
    private Integer calcType;

        @TableField("script")
    private String script;

            /**
            * 脚本文件
            */
        @TableField("scriptfile")
    private Blob scriptfile;

        @TableField("api")
    private String api;

        @TableField("steps")
    private Integer steps;

        @TableField("params")
    private String params;

        @TableField("src_model_id")
    private String srcModelId;

        @TableField("target_model_id")
    private String targetModelId;

        @TableField("sort")
    private Integer sort;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("model_id")
    private String modelId;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}