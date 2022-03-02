package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("bd_consignment")
    public class BdConsignment implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("consignbody")
    private String consignbody;

        @TableField("accbody")
    private String accbody;

        @TableField("accpurposes")
    private String accpurposes;

        @TableField("type")
    private String type;

        @TableField("creator")
    private String creator;

        @TableField("creationtime")
    private LocalDate creationtime;

        @TableField("modifier")
    private String modifier;

        @TableField("modifiedtime")
    private LocalDateTime modifiedtime;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("description")
    private String description;

        @TableField("ts")
    private String ts;

        @TableField("dr")
    private Integer dr;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("doctype")
    private String doctype;

        @TableField("def1")
    private String def1;

        @TableField("def2")
    private String def2;

        @TableField("def3")
    private String def3;

        @TableField("def4")
    private String def4;

        @TableField("def5")
    private String def5;

        @TableField("ytenant_id")
    private String ytenantId;


}