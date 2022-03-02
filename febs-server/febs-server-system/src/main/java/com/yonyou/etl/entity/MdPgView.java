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
    @TableName("md_pg_view")
    public class MdPgView implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("field")
    private String field;

        @TableField("name")
    private String name;

        @TableField("enabled")
    private Boolean enabled;

        @TableField("sort")
    private Integer sort;

        @TableField("edit")
    private Boolean edit;

        @TableField("format")
    private String format;

        @TableField("width")
    private String width;

        @TableField("classname")
    private String classname;

        @TableField("align")
    private String align;

        @TableField("iskey")
    private Boolean iskey;

        @TableField("code")
    private String code;

        @TableField("datatype")
    private Integer datatype;

        @TableField("sortable")
    private Boolean sortable;

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

        @TableField("ytenant_id")
    private String ytenantId;


}