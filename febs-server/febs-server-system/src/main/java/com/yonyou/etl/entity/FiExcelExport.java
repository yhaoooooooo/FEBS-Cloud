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
    @TableName("fi_excel_export")
    public class FiExcelExport implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("filename")
    private String filename;

            /**
            * 属性字段
            */
        @TableField("attribute")
    private String attribute;

            /**
            * 列宽
            */
        @TableField("columnwidth")
    private String columnwidth;

            /**
            * 标题行1
            */
        @TableField("head0")
    private String head0;

            /**
            * 标题行2
            */
        @TableField("head1")
    private String head1;

            /**
            * 标题行3
            */
        @TableField("head2")
    private String head2;

            /**
            * 标题行4
            */
        @TableField("head3")
    private String head3;

            /**
            * 标题行5
            */
        @TableField("head4")
    private String head4;

            /**
            * 对应标题行1设置
            */
        @TableField("headnum0")
    private String headnum0;

            /**
            * 对应标题行2设置
            */
        @TableField("headnum1")
    private String headnum1;

            /**
            * 对应标题行3设置
            */
        @TableField("headnum2")
    private String headnum2;

            /**
            * 对应标题行4设置
            */
        @TableField("headnum3")
    private String headnum3;

            /**
            * 对应标题行5设置
            */
        @TableField("headnum4")
    private String headnum4;

            /**
            * 待获取方法名集合
            */
        @TableField("methedname")
    private String methedname;

            /**
            * 单页sheet显示条数
            */
        @TableField("size")
    private Integer size;

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