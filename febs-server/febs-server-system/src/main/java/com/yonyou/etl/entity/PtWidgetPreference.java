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
    @TableName("pt_widget_preference")
    public class PtWidgetPreference implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("widgetid")
    private String widgetid;

            /**
            * perference的编码
            */
        @TableField("viewid")
    private String viewid;

        @TableField("id")
    private String id;

        @TableField("name")
    private String name;

        @TableField("value")
    private String value;

        @TableField("ctime")
    private LocalDateTime ctime;

            @TableId(value = "pk_widget_preference", type = IdType.UUID)
    private String pkWidgetPreference;

        @TableField("userid")
    private String userid;

            /**
            * 系统
            */
        @TableField("system")
    private String system;

            /**
            * 租户
            */
        @TableField("tenant")
    private String tenant;

        @TableField("ts")
    private LocalDateTime ts;

        @TableField("dr")
    private Integer dr;

        @TableField("wstatus")
    private Integer wstatus;

        @TableField("ytenant_id")
    private String ytenantId;


}