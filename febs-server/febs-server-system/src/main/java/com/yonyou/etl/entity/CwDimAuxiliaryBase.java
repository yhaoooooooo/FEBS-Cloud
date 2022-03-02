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
* 辅助核算基础档案表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("cw_dim_auxiliary_base")
    public class CwDimAuxiliaryBase implements Serializable {

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
            * 辅助核算ID
            */
        @TableField("auxiliary")
    private String auxiliary;

            /**
            * 辅助核算类型PK
            */
        @TableField("fz_type_pk")
    private String fzTypePk;

            /**
            * 辅助核算类型编码
            */
        @TableField("fz_type_code")
    private String fzTypeCode;

            /**
            * 辅助核算类型名称
            */
        @TableField("fz_type_name")
    private String fzTypeName;

            /**
            * 辅助核算表ID
            */
        @TableField("fz_type_table_pk")
    private String fzTypeTablePk;

            /**
            * 辅助核算成员PK
            */
        @TableField("fz_pk")
    private String fzPk;

            /**
            * 辅助核算成员编码
            */
        @TableField("fz_code")
    private String fzCode;

            /**
            * 辅助核算成员名称
            */
        @TableField("fz_name")
    private String fzName;

        @TableField("ytenant_id")
    private String ytenantId;


}