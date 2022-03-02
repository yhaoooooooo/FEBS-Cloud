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
    @TableName("fi_cross_check_rule")
    public class FiCrossCheckRule implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 主键
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 所属组织
            */
        @TableField("pk_org")
    private String pkOrg;

            /**
            * 规则编码
            */
        @TableField("rulecode")
    private String rulecode;

            /**
            * 规则名称
            */
        @TableField("rulename")
    private String rulename;

            /**
            * 控制方式
            */
        @TableField("controltype")
    private String controltype;

            /**
            * 账簿
            */
        @TableField("accbook")
    private String accbook;

            /**
            * 科目表
            */
        @TableField("accsubjectchart")
    private String accsubjectchart;

            /**
            * 是否适用于所有科目
            */
        @TableField("bindsubjectflag")
    private String bindsubjectflag;

            /**
            * 租户id
            */
        @TableField("tenantid")
    private String tenantid;

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