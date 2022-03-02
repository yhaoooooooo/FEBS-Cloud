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
    @TableName("iuap_bpm_orgmapping")
    public class IuapBpmOrgmapping implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("bpm_org_code")
    private String bpmOrgCode;

        @TableField("bpm_org_id")
    private String bpmOrgId;

        @TableField("create_time")
    private String createTime;

        @TableField("org_code")
    private String orgCode;

        @TableField("org_id")
    private String orgId;

        @TableField("sys_id")
    private String sysId;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("type")
    private String type;

        @TableField("ytenant_id")
    private String ytenantId;


}