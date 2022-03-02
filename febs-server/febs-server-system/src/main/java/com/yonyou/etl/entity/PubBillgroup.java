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
    @TableName("pub_billgroup")
    public class PubBillgroup implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("billtemplet")
    private String billtemplet;

        @TableField("billtable")
    private String billtable;

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

        @TableField("position")
    private String position;

        @TableField("showtype")
    private String showtype;

        @TableField("showorder")
    private Integer showorder;

        @TableField("readonly")
    private Boolean readonly;

        @TableField("showgroupname")
    private Boolean showgroupname;

        @TableField("validateformula")
    private String validateformula;

        @TableField("validatefrontformula")
    private String validatefrontformula;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}