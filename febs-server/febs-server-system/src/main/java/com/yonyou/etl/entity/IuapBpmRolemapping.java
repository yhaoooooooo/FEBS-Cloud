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
    @TableName("iuap_bpm_rolemapping")
    public class IuapBpmRolemapping implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("bpm_role_code")
    private String bpmRoleCode;

        @TableField("bpm_role_id")
    private String bpmRoleId;

        @TableField("create_time")
    private String createTime;

        @TableField("role_code")
    private String roleCode;

        @TableField("role_id")
    private String roleId;

        @TableField("sys_id")
    private String sysId;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("ytenant_id")
    private String ytenantId;


}