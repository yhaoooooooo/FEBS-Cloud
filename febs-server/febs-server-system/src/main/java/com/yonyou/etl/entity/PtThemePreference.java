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
    @TableName("pt_theme_preference")
    public class PtThemePreference implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("userid")
    private String userid;

        @TableField("themeid")
    private String themeid;

        @TableField("ctime")
    private LocalDateTime ctime;

            @TableId(value = "pk_theme_preference", type = IdType.UUID)
    private String pkThemePreference;

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