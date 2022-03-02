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
* 编码规则子表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("bd_cdrule_b")
    public class BdCdruleB implements Serializable {

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

        @TableField("cdruleid")
    private String cdruleid;

        @TableField("field")
    private String field;

        @TableField("srcfield")
    private String srcfield;

        @TableField("doctype")
    private String doctype;

        @TableField("datatype")
    private Integer datatype;

        @TableField("sequence")
    private String sequence;

        @TableField("according")
    private Boolean according;

        @TableField("isshow")
    private Boolean isshow;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}