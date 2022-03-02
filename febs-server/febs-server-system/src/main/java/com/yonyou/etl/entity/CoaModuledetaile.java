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
    @TableName("coa_moduledetaile")
    public class CoaModuledetaile implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 方案关联的字段名称
            */
        @TableField("field_name")
    private String fieldName;

            /**
            * 操作符
            */
        @TableField("operation")
    private String operation;

            /**
            * 字段编码
            */
        @TableField("field_code")
    private String fieldCode;

            /**
            * 查询字段的值
            */
        @TableField("value")
    private String value;

            /**
            * 关联查询方案id
            */
        @TableField("moduleid")
    private String moduleid;

            /**
            * 租户
            */
        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("ytenant_id")
    private String ytenantId;


}