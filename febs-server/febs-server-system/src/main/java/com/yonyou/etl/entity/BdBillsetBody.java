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
    @TableName("bd_billset_body")
    public class BdBillsetBody implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("billset")
    private String billset;

        @TableField("bodyorder")
    private Integer bodyorder;

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

        @TableField("accbody")
    private String accbody;

        @TableField("consignbodyfield")
    private String consignbodyfield;

        @TableField("consignbodyname")
    private String consignbodyname;

        @TableField("srcentity")
    private String srcentity;

        @TableField("entrustbody")
    private String entrustbody;

        @TableField("moveout")
    private Boolean moveout;

        @TableField("movein")
    private Boolean movein;

        @TableField("consignment")
    private String consignment;

        @TableField("tenantid")
    private String tenantid;

            /**
            * 来源id
            */
        @TableField("srctplid")
    private String srctplid;

            /**
            * 是否系统预制
            */
        @TableField("issystem")
    private Boolean issystem;

        @TableField("ytenant_id")
    private String ytenantId;


}