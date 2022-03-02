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
    @TableName("pub_billitem")
    public class PubBillitem implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("billtable")
    private String billtable;

        @TableField("billtemplet")
    private String billtemplet;

        @TableField("cardshow")
    private String cardshow;

        @TableField("style")
    private String style;

        @TableField("componenttype")
    private String componenttype;

        @TableField("groupinfo")
    private String groupinfo;

        @TableField("grouporder")
    private Integer grouporder;

        @TableField("complexname")
    private String complexname;

        @TableField("complexname2")
    private String complexname2;

        @TableField("complexname3")
    private String complexname3;

        @TableField("complexname4")
    private String complexname4;

        @TableField("complexname5")
    private String complexname5;

        @TableField("complexname6")
    private String complexname6;

        @TableField("complextype")
    private String complextype;

        @TableField("cardshoworder")
    private Integer cardshoworder;

        @TableField("cardwidth")
    private String cardwidth;

        @TableField("code")
    private String code;

        @TableField("datatype")
    private Integer datatype;

        @TableField("defaultvalue")
    private String defaultvalue;

        @TableField("digit")
    private Integer digit;

        @TableField("roundtype")
    private Integer roundtype;

        @TableField("editformula")
    private String editformula;

        @TableField("fieldcode")
    private String fieldcode;

        @TableField("font")
    private String font;

        @TableField("hyperlink")
    private String hyperlink;

        @TableField("lable")
    private String lable;

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

        @TableField("lablefont")
    private String lablefont;

        @TableField("length")
    private Integer length;

        @TableField("minlength")
    private Integer minlength;

        @TableField("listshow")
    private String listshow;

        @TableField("listshoworder")
    private Integer listshoworder;

        @TableField("listwidth")
    private String listwidth;

        @TableField("loadformula")
    private String loadformula;

        @TableField("nullable")
    private Boolean nullable;

        @TableField("position")
    private String position;

        @TableField("readonly")
    private Boolean readonly;

        @TableField("reftype")
    private String reftype;

        @TableField("validateformula")
    private String validateformula;

        @TableField("aftereditformula")
    private String aftereditformula;

        @TableField("beforeeditformula")
    private String beforeeditformula;

        @TableField("validatefrontformula")
    private String validatefrontformula;

        @TableField("aftereditfrontformula")
    private String aftereditfrontformula;

        @TableField("beforeeditfrontformula")
    private String beforeeditfrontformula;

        @TableField("validatetype")
    private String validatetype;

        @TableField("parameter")
    private String parameter;

        @TableField("showformat")
    private String showformat;

        @TableField("placeholder")
    private String placeholder;

        @TableField("placeholder2")
    private String placeholder2;

        @TableField("placeholder3")
    private String placeholder3;

        @TableField("placeholder4")
    private String placeholder4;

        @TableField("placeholder5")
    private String placeholder5;

        @TableField("placeholder6")
    private String placeholder6;

        @TableField("datasort")
    private Boolean datasort;

        @TableField("istotalcol")
    private Boolean istotalcol;

        @TableField("locktype")
    private String locktype;

        @TableField("sortapp")
    private String sortapp;

        @TableField("issort")
    private Boolean issort;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}