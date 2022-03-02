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
    @TableName("bd_billset")
    public class BdBillset implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("accpurposes")
    private String accpurposes;

        @TableField("srcentity")
    private String srcentity;

        @TableField("downbilltype")
    private String downbilltype;

        @TableField("warehousefield")
    private String warehousefield;

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

        @TableField("consignbodyfield")
    private String consignbodyfield;

        @TableField("accbody")
    private String accbody;

        @TableField("consignbodyname")
    private String consignbodyname;

        @TableField("warehousename")
    private String warehousename;

        @TableField("srcdealtype")
    private String srcdealtype;

        @TableField("targetsys")
    private String targetsys;

        @TableField("toia")
    private Boolean toia;

        @TableField("consignment")
    private String consignment;

        @TableField("warehouse")
    private String warehouse;

        @TableField("toarap")
    private Boolean toarap;

        @TableField("tocm")
    private Boolean tocm;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srcentityid")
    private String srcentityid;

        @TableField("toit")
    private Boolean toit;

            /**
            * 其他引擎系统地址
            */
        @TableField("link")
    private String link;

            /**
            * 条件公式
            */
        @TableField("formula")
    private String formula;

            /**
            * 来源交易类型
            */
        @TableField("tradetype")
    private String tradetype;

            /**
            * 来源id
            */
        @TableField("srctplid")
    private String srctplid;

            /**
            * 规则编码
            */
        @TableField("rulenum")
    private String rulenum;

            /**
            * 是否系统预制
            */
        @TableField("issystem")
    private Boolean issystem;

        @TableField("ytenant_id")
    private String ytenantId;


}