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
    @TableName("sys_bd_def")
    public class SysBdDef implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("cls")
    private String cls;

        @TableField("dataType")
    private Integer datatype;

        @TableField("dataTypeInfo")
    private String datatypeinfo;

        @TableField("defaultValue")
    private String defaultvalue;

        @TableField("dispName")
    private String dispname;

        @TableField("fieldName")
    private String fieldname;

        @TableField("maxlength")
    private Integer maxlength;

        @TableField("required")
    private Boolean required;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}