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
* 辅助类型档案
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("cw_dim_multidim_list")
    public class CwDimMultidimList implements Serializable {

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

        @TableField("ytenant_id")
    private String ytenantId;


}