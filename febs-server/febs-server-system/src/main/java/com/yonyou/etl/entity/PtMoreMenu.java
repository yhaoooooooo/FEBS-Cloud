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
    @TableName("pt_more_menu")
    public class PtMoreMenu implements Serializable {

private static final long serialVersionUID = 1L;

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

        @TableField("url")
    private String url;

        @TableField("url_type")
    private String urlType;

        @TableField("icon")
    private String icon;

        @TableField("sort")
    private Integer sort;

        @TableField("tag")
    private String tag;

            @TableId(value = "pk_more_menu", type = IdType.UUID)
    private String pkMoreMenu;

        @TableField("isenable")
    private String isenable;

        @TableField("system")
    private String system;

        @TableField("tenant")
    private String tenant;

        @TableField("ts")
    private LocalDateTime ts;

        @TableField("dr")
    private Integer dr;

        @TableField("ytenant_id")
    private String ytenantId;


}