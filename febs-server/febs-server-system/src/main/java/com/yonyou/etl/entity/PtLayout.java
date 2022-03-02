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
    @TableName("pt_layout")
    public class PtLayout implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 布局模板编码
            */
        @TableField("templateid")
    private String templateid;

            /**
            * 内容
            */
        @TableField("setting")
    private String setting;

            /**
            * 主键
            */
            @TableId(value = "pk_layout", type = IdType.UUID)
    private String pkLayout;

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

        @TableField("ctime")
    private LocalDateTime ctime;

        @TableField("parentid")
    private String parentid;

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

        @TableField("isdefault")
    private String isdefault;

        @TableField("modifytime")
    private LocalDateTime modifytime;

        @TableField("wlevel")
    private String wlevel;

        @TableField("isenable")
    private String isenable;

        @TableField("rnd")
    private String rnd;

        @TableField("ts")
    private LocalDateTime ts;

        @TableField("dr")
    private Integer dr;

        @TableField("ytenant_id")
    private String ytenantId;


}