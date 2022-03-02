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
    @TableName("wb_role_app")
    public class WbRoleApp implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 角色小应用关联表主键
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 角色表的主键
            */
        @TableField("pk_role")
    private String pkRole;

            /**
            * 小应用表的主键
            */
        @TableField("pk_little_app")
    private String pkLittleApp;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("ytenant_id")
    private String ytenantId;


}