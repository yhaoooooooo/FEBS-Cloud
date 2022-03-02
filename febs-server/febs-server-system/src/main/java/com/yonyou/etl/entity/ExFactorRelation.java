package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("ex_factor_relation")
    public class ExFactorRelation implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 主键
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 来源系统id
            */
        @TableField("outer_system_id")
    private String outerSystemId;

            /**
            * 事项类型id
            */
        @TableField("bill_type_id")
    private String billTypeId;

            /**
            * 交易类型id
            */
        @TableField("trade_type_id")
    private String tradeTypeId;

        @TableField("src_entity_id")
    private String srcEntityId;

            /**
            * 影响因素id
            */
        @TableField("factor_id")
    private String factorId;

            /**
            * 单据字段0
            */
        @TableField("bill_field_id0")
    private String billFieldId0;

            /**
            * 单据字段1
            */
        @TableField("bill_field_id1")
    private String billFieldId1;

            /**
            * 单据字段2
            */
        @TableField("bill_field_id2")
    private String billFieldId2;

            /**
            * 单据字段3
            */
        @TableField("bill_field_id3")
    private String billFieldId3;

            /**
            * 单据字段4
            */
        @TableField("bill_field_id4")
    private String billFieldId4;

            /**
            * 单据字段5
            */
        @TableField("bill_field_id5")
    private String billFieldId5;

            /**
            * 字段propertyName
            */
        @TableField("bill_field_attr_name")
    private String billFieldAttrName;

            /**
            * 权限
            */
        @TableField("permission")
    private Integer permission;

        @TableField("issocial")
    private Boolean issocial;

        @TableField("unique_key")
    private String uniqueKey;

            /**
            * 租户id
            */
        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            /**
            * 创建时间
            */
        @TableField("create_time")
    private LocalDateTime createTime;

        @TableField("ytenant_id")
    private String ytenantId;


}