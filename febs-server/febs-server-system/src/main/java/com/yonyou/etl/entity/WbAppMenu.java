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
    @TableName("wb_app_menu")
    public class WbAppMenu implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("id")
    private String id;

            @TableId(value = "func_id", type = IdType.UUID)
    private String funcId;

        @TableField("icon")
    private String icon;

        @TableField("isenable")
    private String isenable;

        @TableField("isvisible")
    private String isvisible;

        @TableField("is_virtual_node")
    private String isVirtualNode;

        @TableField("parent_id")
    private String parentId;

            /**
            * 从属分组
            */
        @TableField("classify")
    private String classify;

            /**
            * 关联layout表id
            */
        @TableField("layout_id")
    private String layoutId;

        @TableField("sort")
    private Integer sort;

        @TableField("create_time")
    private LocalDateTime createTime;

        @TableField("name")
    private String name;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("version")
    private Integer version;

        @TableField("label")
    private String label;

        @TableField("openview")
    private String openview;

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