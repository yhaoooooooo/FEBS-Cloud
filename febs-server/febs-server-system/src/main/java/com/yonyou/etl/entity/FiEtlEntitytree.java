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
    @TableName("fi_etl_entitytree")
    public class FiEtlEntitytree implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("entitycode")
    private String entitycode;

        @TableField("entityname")
    private String entityname;

            /**
            * 多语字段2
            */
        @TableField("entityname2")
    private String entityname2;

            /**
            * 多语字段3
            */
        @TableField("entityname3")
    private String entityname3;

            /**
            * 多语字段4
            */
        @TableField("entityname4")
    private String entityname4;

            /**
            * 多语字段5
            */
        @TableField("entityname5")
    private String entityname5;

            /**
            * 多语字段6
            */
        @TableField("entityname6")
    private String entityname6;

        @TableField("parentid")
    private String parentid;

        @TableField("mdentityid")
    private String mdentityid;

        @TableField("dr")
    private Integer dr;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("sort")
    private Integer sort;

        @TableField("srctplid")
    private String srctplid;

            /**
            * 是否为子叶标识
            */
        @TableField("isLeaf")
    private String isleaf;

            /**
            * 根节点pk
            */
        @TableField("rootid")
    private String rootid;

            /**
            * 事项来源
            */
        @TableField("systype")
    private String systype;

        @TableField("ytenant_id")
    private String ytenantId;


}