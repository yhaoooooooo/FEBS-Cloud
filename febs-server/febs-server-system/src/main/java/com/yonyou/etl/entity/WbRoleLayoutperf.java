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
    @TableName("wb_role_layoutperf")
    public class WbRoleLayoutperf implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 角色和布局关联表的主键
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 角色的主键
            */
        @TableField("rolecode")
    private String rolecode;

            /**
            * 布局表中的id，用来作为关联用
            */
        @TableField("pk_layoutperference")
    private String pkLayoutperference;

        @TableField("createtime")
    private LocalDateTime createtime;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("system")
    private String system;

        @TableField("sort")
    private Integer sort;

        @TableField("ytenant_id")
    private String ytenantId;


}