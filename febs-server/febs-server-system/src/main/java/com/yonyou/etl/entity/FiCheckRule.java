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
    @TableName("fi_check_rule")
    public class FiCheckRule implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 主键
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 对账规则编码
            */
        @TableField("code")
    private String code;

            /**
            * 对账规则名称
            */
        @TableField("name")
    private String name;

            /**
            * 会计主体
            */
        @TableField("accbody")
    private String accbody;

            /**
            * 核算账簿
            */
        @TableField("accbook")
    private String accbook;

            /**
            * 业务系统
            */
        @TableField("businesssystem")
    private String businesssystem;

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

            /**
            * 创建人
            */
        @TableField("creator")
    private String creator;

            /**
            * 创建时间
            */
        @TableField("creationtime")
    private String creationtime;

            /**
            * 修改人
            */
        @TableField("modifier")
    private String modifier;

            /**
            * 修改时间
            */
        @TableField("modifiedtime")
    private String modifiedtime;

            /**
            * 组织
            */
        @TableField("pk_org")
    private String pkOrg;

            /**
            * 集团
            */
        @TableField("pk_group")
    private String pkGroup;

            /**
            * 备注
            */
        @TableField("description")
    private String description;

            /**
            * 系统时间戳
            */
        @TableField("ts")
    private String ts;

        @TableField("dr")
    private Integer dr;

        @TableField("srctplid")
    private String srctplid;

            /**
            * 租户id
            */
        @TableField("tenantid")
    private String tenantid;

        @TableField("ytenant_id")
    private String ytenantId;


}