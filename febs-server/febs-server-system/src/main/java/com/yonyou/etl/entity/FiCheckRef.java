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
    @TableName("fi_check_ref")
    public class FiCheckRef implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 参照名称
            */
        @TableField("name")
    private String name;

            /**
            * 业务系统
            */
        @TableField("system")
    private String system;

            /**
            * 参照编码
            */
        @TableField("refcode")
    private String refcode;

            /**
            * 业务系统参照标识
            */
        @TableField("sysrefcode")
    private String sysrefcode;

            /**
            * 场景
            */
        @TableField("sceneflag")
    private String sceneflag;

        @TableField("inclusioncondition")
    private String inclusioncondition;

            /**
            * 不包含条件
            */
        @TableField("nocondition")
    private String nocondition;

            /**
            * 排序条件
            */
        @TableField("orderby")
    private String orderby;

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