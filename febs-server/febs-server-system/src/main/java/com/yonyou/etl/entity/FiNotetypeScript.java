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
    @TableName("fi_notetype_script")
    public class FiNotetypeScript implements Serializable {

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

        @TableField("actiontype")
    private String actiontype;

        @TableField("actioncls")
    private String actioncls;

        @TableField("code")
    private String code;

        @TableField("dyscript")
    private String dyscript;

        @TableField("enable")
    private Boolean enable;

        @TableField("formula")
    private String formula;

        @TableField("name")
    private String name;

        @TableField("notetype")
    private String notetype;

        @TableField("showorder")
    private Integer showorder;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}