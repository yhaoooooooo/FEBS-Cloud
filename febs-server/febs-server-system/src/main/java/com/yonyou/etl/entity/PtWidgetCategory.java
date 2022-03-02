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
    @TableName("pt_widget_category")
    public class PtWidgetCategory implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 编码
            */
        @TableField("id")
    private String id;

            /**
            * 主键
            */
            @TableId(value = "pk_category", type = IdType.UUID)
    private String pkCategory;

        @TableField("name")
    private String name;

        @TableField("i18n")
    private String i18n;

            /**
            * 是否启用
            */
        @TableField("isenable")
    private String isenable;

            /**
            * 序号
            */
        @TableField("sort")
    private Integer sort;

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

        @TableField("ytenant_id")
    private String ytenantId;


}