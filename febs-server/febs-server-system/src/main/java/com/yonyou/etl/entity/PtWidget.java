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
    @TableName("pt_widget")
    public class PtWidget implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 编码
            */
        @TableField("id")
    private String id;

            /**
            * 名称
            */
        @TableField("name")
    private String name;

            /**
            * 描述
            */
        @TableField("descr")
    private String descr;

            /**
            * 类别
            */
        @TableField("category")
    private String category;

            /**
            * 类型
            */
        @TableField("wtype")
    private String wtype;

        @TableField("url")
    private String url;

            @TableId(value = "pk_widget", type = IdType.UUID)
    private String pkWidget;

            /**
            * 是否启用
            */
        @TableField("isenable")
    private String isenable;

        @TableField("system")
    private String system;

        @TableField("tenant")
    private String tenant;

        @TableField("ctime")
    private LocalDateTime ctime;

        @TableField("cnf")
    private String cnf;

        @TableField("modifytime")
    private LocalDateTime modifytime;

        @TableField("setting")
    private String setting;

        @TableField("ts")
    private LocalDateTime ts;

        @TableField("dr")
    private Integer dr;

        @TableField("wlevel")
    private String wlevel;

        @TableField("tag")
    private String tag;

        @TableField("ytenant_id")
    private String ytenantId;


}