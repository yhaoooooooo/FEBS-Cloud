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
    @TableName("fi_extend_func_form")
    public class FiExtendFuncForm implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("funcid")
    private String funcid;

        @TableField("datatype")
    private Integer datatype;

        @TableField("operation")
    private String operation;

        @TableField("refcode")
    private String refcode;

        @TableField("LENGTH")
    private Integer length;

        @TableField("sequence")
    private Integer sequence;

        @TableField("defaultvalue")
    private String defaultvalue;

        @TableField("enumid")
    private String enumid;

        @TableField("enumpath")
    private String enumpath;

        @TableField("required")
    private Boolean required;

        @TableField("multiple")
    private Boolean multiple;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("code")
    private String code;

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

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("returntype")
    private String returntype;

        @TableField("ytenant_id")
    private String ytenantId;


}