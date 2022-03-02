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
    @TableName("md_entity")
    public class MdEntity implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("accessorClass")
    private String accessorclass;

        @TableField("displayName")
    private String displayname;

        @TableField("displayName2")
    private String displayname2;

        @TableField("displayName3")
    private String displayname3;

        @TableField("displayName4")
    private String displayname4;

        @TableField("displayName5")
    private String displayname5;

        @TableField("displayName6")
    private String displayname6;

        @TableField("entityName")
    private String entityname;

        @TableField("entityType")
    private String entitytype;

        @TableField("fullClassName")
    private String fullclassname;

        @TableField("mainTableName")
    private String maintablename;

        @TableField("isinner")
    private Boolean isinner;

        @TableField("srcsystem")
    private String srcsystem;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}