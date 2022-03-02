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
    @TableName("fi_check_gl_auxiliary")
    public class FiCheckGlAuxiliary implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 主键
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 规则id
            */
        @TableField("ruleid")
    private String ruleid;

            /**
            * 规则明细id
            */
        @TableField("detailid")
    private String detailid;

            /**
            * 辅助项id
            */
        @TableField("auxiliaryid")
    private String auxiliaryid;

            /**
            * 辅助项名称
            */
        @TableField("auxiliaryname")
    private String auxiliaryname;

            /**
            * 档案编码
            */
        @TableField("auxiliarydoc")
    private String auxiliarydoc;

            /**
            * 维度值
            */
        @TableField("auxiliaryvalue")
    private String auxiliaryvalue;

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