package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("ac_condition")
    public class AcCondition implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("permission")
    private String permission;

        @TableField("scene")
    private String scene;

        @TableField("srcdata")
    private String srcdata;

        @TableField("attribute")
    private String attribute;

        @TableField("value")
    private String value;

        @TableField("formula")
    private String formula;

        @TableField("haschild")
    private Boolean haschild;

        @TableField("operator")
    private String operator;

        @TableField("creator")
    private String creator;

        @TableField("creationtime")
    private LocalDate creationtime;

        @TableField("modifier")
    private String modifier;

        @TableField("modifiedtime")
    private LocalDateTime modifiedtime;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("description")
    private String description;

        @TableField("ts")
    private LocalDate ts;

        @TableField("dr")
    private Integer dr;

        @TableField("state")
    private Integer state;

        @TableField("formulatype")
    private String formulatype;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}