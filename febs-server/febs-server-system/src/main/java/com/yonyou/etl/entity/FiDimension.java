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
    @TableName("fi_dimension")
    public class FiDimension implements Serializable {

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
            * 固定维度控制表id
            */
        @TableField("fixeddimensionid")
    private String fixeddimensionid;

            /**
            * 条件公式
            */
        @TableField("formual")
    private String formual;

            /**
            * 维度1
            */
        @TableField("dimension1")
    private String dimension1;

            /**
            * 维度2
            */
        @TableField("dimension2")
    private String dimension2;

            /**
            * 维度3
            */
        @TableField("dimension3")
    private String dimension3;

            /**
            * 维度4
            */
        @TableField("dimension4")
    private String dimension4;

            /**
            * 维度5
            */
        @TableField("dimension5")
    private String dimension5;

            /**
            * 维度6
            */
        @TableField("dimension6")
    private String dimension6;

            /**
            * 维度7
            */
        @TableField("dimension7")
    private String dimension7;

            /**
            * 维度8
            */
        @TableField("dimension8")
    private String dimension8;

            /**
            * 维度9
            */
        @TableField("dimension9")
    private String dimension9;

            /**
            * 维度10
            */
        @TableField("dimension10")
    private String dimension10;

            /**
            * 维度类型
            */
        @TableField("dimensiontype")
    private String dimensiontype;

            /**
            * 维度标识:固定/自由
            */
        @TableField("flag")
    private String flag;

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