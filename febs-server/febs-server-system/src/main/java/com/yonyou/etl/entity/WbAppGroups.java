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
    @TableName("wb_app_groups")
    public class WbAppGroups implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "Id", type = IdType.UUID)
    private String id;

        @TableField("name")
    private String name;

        @TableField("app_groupindex")
    private Integer appGroupindex;

            /**
            * 应用分组对应的领域
            */
        @TableField("area_id")
    private String areaId;

        @TableField("tenant_id")
    private String tenantId;

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