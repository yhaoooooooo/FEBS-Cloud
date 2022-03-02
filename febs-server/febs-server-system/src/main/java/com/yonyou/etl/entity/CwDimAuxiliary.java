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
* 辅助项目宽表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("cw_dim_auxiliary")
    public class CwDimAuxiliary implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * ID
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 租户ID
            */
        @TableField("tenantid")
    private String tenantid;

            /**
            * 辅助ID
            */
        @TableField("auxiliary")
    private String auxiliary;

            /**
            * 部门pk
            */
        @TableField("def1_pk")
    private String def1Pk;

            /**
            * 部门编码
            */
        @TableField("def1_code")
    private String def1Code;

            /**
            * 部门名称
            */
        @TableField("def1_name")
    private String def1Name;

            /**
            * 客户pk
            */
        @TableField("def2_pk")
    private String def2Pk;

            /**
            * 客户编码
            */
        @TableField("def2_code")
    private String def2Code;

            /**
            * 客户名称
            */
        @TableField("def2_name")
    private String def2Name;

        @TableField("ytenant_id")
    private String ytenantId;


}