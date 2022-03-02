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
    @TableName("sys_saas_tenant")
    public class SysSaasTenant implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("accountquantity")
    private Integer accountquantity;

        @TableField("creationtime")
    private String creationtime;

        @TableField("effecttime")
    private String effecttime;

        @TableField("email")
    private String email;

        @TableField("expiredtime")
    private String expiredtime;

        @TableField("mobile")
    private String mobile;

        @TableField("orderbizid")
    private String orderbizid;

        @TableField("ordertype")
    private String ordertype;

        @TableField("productid")
    private String productid;

        @TableField("skuid")
    private String skuid;

        @TableField("srcid")
    private String srcid;

        @TableField("tenantdb")
    private String tenantdb;

        @TableField("tenantid")
    private String tenantid;

        @TableField("tenantstatus")
    private Integer tenantstatus;

        @TableField("tenantversion")
    private Integer tenantversion;

        @TableField("trialversion")
    private String trialversion;

        @TableField("tenanttype")
    private String tenanttype;

        @TableField("mulang")
    private Boolean mulang;

        @TableField("defaultlang")
    private String defaultlang;

        @TableField("defaulttimezone")
    private String defaulttimezone;

        @TableField("def1")
    private String def1;

        @TableField("def2")
    private String def2;

        @TableField("def3")
    private String def3;

        @TableField("def4")
    private String def4;

        @TableField("def5")
    private String def5;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}