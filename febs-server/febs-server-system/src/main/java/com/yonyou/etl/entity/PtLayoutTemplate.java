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
    @TableName("pt_layout_template")
    public class PtLayoutTemplate implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 布局模板编码
            */
        @TableField("id")
    private String id;

            /**
            * 名称
            */
        @TableField("name")
    private String name;

            /**
            * 模板内容
            */
        @TableField("tpl")
    private String tpl;

            @TableId(value = "pk_layout_template", type = IdType.UUID)
    private String pkLayoutTemplate;

            /**
            * 多语
            */
        @TableField("i18n")
    private String i18n;

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