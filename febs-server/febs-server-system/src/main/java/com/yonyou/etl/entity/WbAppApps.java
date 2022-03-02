package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("wb_app_apps")
    public class WbAppApps implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("Id")
    private String id;

        @TableField("app_name")
    private String appName;

        @TableField("app_index")
    private String appIndex;

        @TableField("group_id")
    private String groupId;

        @TableField("domain_id")
    private String domainId;

        @TableField("url")
    private String url;

        @TableField("app_chinese")
    private String appChinese;

        @TableField("app_desc")
    private String appDesc;

        @TableField("app_icon")
    private String appIcon;

        @TableField("app_groupcode")
    private String appGroupcode;

            @TableId(value = "app_code", type = IdType.UUID)
    private String appCode;

        @TableField("dyna_url")
    private String dynaUrl;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("urltype")
    private String urltype;

        @TableField("version")
    private Integer version;

        @TableField("system")
    private String system;

        @TableField("label")
    private String label;

        @TableField("create_date")
    private LocalDateTime createDate;

        @TableField("modify_date")
    private LocalDateTime modifyDate;

        @TableField("creator")
    private String creator;

        @TableField("reviser")
    private String reviser;

        @TableField("showway")
    private String showway;

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

        @TableField("ytenant_id")
    private String ytenantId;


}