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
    @TableName("fi_fixed_dimension_enum")
    public class FiFixedDimensionEnum implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 主键
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 编码
            */
        @TableField("code")
    private String code;

            /**
            * 名称1
            */
        @TableField("name")
    private String name;

            /**
            * 名称2
            */
        @TableField("name1")
    private String name1;

            /**
            * 名称3
            */
        @TableField("name2")
    private String name2;

            /**
            * 解析类全路径
            */
        @TableField("fullclasspath")
    private String fullclasspath;

            /**
            * 参数
            */
        @TableField("param")
    private String param;

            /**
            * 租户id
            */
        @TableField("tenantid")
    private String tenantid;

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

        @TableField("ts")
    private String ts;

        @TableField("dr")
    private Integer dr;

            /**
            * 创建时间
            */
        @TableField("creationtime")
    private String creationtime;

            /**
            * 修改时间
            */
        @TableField("modifiedtime")
    private String modifiedtime;

            /**
            * 创建人
            */
        @TableField("creator")
    private String creator;

            /**
            * 修改人
            */
        @TableField("modifier")
    private String modifier;

            /**
            * 创建人
            */
        @TableField("srctplid")
    private String srctplid;

        @TableField("doctype")
    private String doctype;

        @TableField("doctype2")
    private String doctype2;

        @TableField("ytenant_id")
    private String ytenantId;


}