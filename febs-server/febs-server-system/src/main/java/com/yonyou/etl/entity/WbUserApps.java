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
    @TableName("wb_user_apps")
    public class WbUserApps implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "Id", type = IdType.UUID)
    private String id;

        @TableField("user_Id")
    private String userId;

        @TableField("group_Id")
    private String groupId;

        @TableField("group_index")
    private Integer groupIndex;

        @TableField("group_name")
    private String groupName;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("ytenant_id")
    private String ytenantId;


}