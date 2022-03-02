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
* 编码规则主表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("bd_cdrule")
    public class BdCdrule implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("description")
    private String description;

        @TableField("creator")
    private String creator;

        @TableField("creationtime")
    private String creationtime;

        @TableField("modifier")
    private String modifier;

        @TableField("modifiedtime")
    private String modifiedtime;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("ts")
    private String ts;

        @TableField("dr")
    private Integer dr;

        @TableField("cdtype")
    private String cdtype;

        @TableField("delimiter")
    private String delimiter;

        @TableField("flowfield")
    private String flowfield;

        @TableField("flowlenth")
    private String flowlenth;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}