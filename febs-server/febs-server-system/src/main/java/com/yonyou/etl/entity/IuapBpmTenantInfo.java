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
    @TableName("iuap_bpm_tenant_info")
    public class IuapBpmTenantInfo implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("description")
    private String description;

        @TableField("suffix")
    private String suffix;

        @TableField("system_code")
    private String systemCode;

        @TableField("tenant_code")
    private String tenantCode;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("ytenant_id")
    private String ytenantId;


}