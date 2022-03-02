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
    @TableName("fi_freedom_dimension_archives")
    public class FiFreedomDimensionArchives implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 主键
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 规则表id
            */
        @TableField("ruleid")
    private String ruleid;

            /**
            * 维度表id
            */
        @TableField("dimensionid")
    private String dimensionid;

            /**
            * 行号
            */
        @TableField("rowno")
    private Integer rowno;

            /**
            * 档案类型
            */
        @TableField("doctype")
    private String doctype;

            /**
            * 值id
            */
        @TableField("valueid")
    private String valueid;

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

        @TableField("ytenant_id")
    private String ytenantId;


}