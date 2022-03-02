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
    @TableName("coa_computationcheck")
    public class CoaComputationcheck implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("creationtime")
    private String creationtime;

            /**
            * 检查项编码
            */
        @TableField("code")
    private String code;

            /**
            * 来源模块
            */
        @TableField("sourcemodule")
    private String sourcemodule;

            /**
            * 检查项名称
            */
        @TableField("name")
    private String name;

        @TableField("name2")
    private String name2;

        @TableField("name3")
    private String name3;

        @TableField("name4")
    private String name4;

        @TableField("name5")
    private String name5;

        @TableField("name6")
    private String name6;

            /**
            * 是否启用（1代表启用，0代表未启用）
            */
        @TableField("is_start")
    private Integer isStart;

            /**
            * 预警类型（1代表预警，0代表控制）
            */
        @TableField("warning_type")
    private Integer warningType;

            /**
            * 备注
            */
        @TableField("remarks")
    private String remarks;

            /**
            * 分摊方案id
            */
        @TableField("planid")
    private String planid;

            /**
            * 关联的默认的检查项id
            */
        @TableField("par_id")
    private String parId;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("result")
    private String result;

        @TableField("result_id")
    private String resultId;

        @TableField("ytenant_id")
    private String ytenantId;


}