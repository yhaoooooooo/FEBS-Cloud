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
    @TableName("ex_classmapping_b")
    public class ExClassmappingB implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("creationtime")
    private String creationtime;

        @TableField("creator")
    private String creator;

        @TableField("description")
    private String description;

        @TableField("dr")
    private Integer dr;

        @TableField("modifiedtime")
    private String modifiedtime;

        @TableField("modifier")
    private String modifier;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("ts")
    private String ts;

        @TableField("classvalue1")
    private String classvalue1;

        @TableField("classvalue10")
    private String classvalue10;

        @TableField("classvalue11")
    private String classvalue11;

        @TableField("classvalue12")
    private String classvalue12;

        @TableField("classvalue13")
    private String classvalue13;

        @TableField("classvalue14")
    private String classvalue14;

        @TableField("classvalue15")
    private String classvalue15;

        @TableField("classvalue16")
    private String classvalue16;

        @TableField("classvalue17")
    private String classvalue17;

        @TableField("classvalue18")
    private String classvalue18;

        @TableField("classvalue19")
    private String classvalue19;

        @TableField("classvalue2")
    private String classvalue2;

        @TableField("classvalue20")
    private String classvalue20;

        @TableField("classvalue3")
    private String classvalue3;

        @TableField("classvalue4")
    private String classvalue4;

        @TableField("classvalue5")
    private String classvalue5;

        @TableField("classvalue6")
    private String classvalue6;

        @TableField("classvalue7")
    private String classvalue7;

        @TableField("classvalue8")
    private String classvalue8;

        @TableField("classvalue9")
    private String classvalue9;

        @TableField("rownumber")
    private Integer rownumber;

        @TableField("targetvalue")
    private String targetvalue;

        @TableField("classmappingid")
    private String classmappingid;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}