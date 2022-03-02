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
    @TableName("bd_con_accbookplan")
    public class BdConAccbookplan implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("code")
    private String code;

        @TableField("name")
    private String name;

        @TableField("sourceaccbook")
    private String sourceaccbook;

        @TableField("aimaccbook")
    private String aimaccbook;

        @TableField("enable")
    private Boolean enable;

        @TableField("executemode")
    private String executemode;

        @TableField("executefrequency")
    private String executefrequency;

        @TableField("executetime")
    private String executetime;

        @TableField("voucherstatus")
    private String voucherstatus;

        @TableField("currencyconvert")
    private String currencyconvert;

        @TableField("vouchermaker")
    private String vouchermaker;

        @TableField("aimvouchermaker")
    private String aimvouchermaker;

        @TableField("cashflow")
    private Boolean cashflow;

        @TableField("maintainvouher")
    private String maintainvouher;

        @TableField("makedatetype")
    private String makedatetype;

        @TableField("vouchernotbalance")
    private String vouchernotbalance;

        @TableField("sendersubject")
    private String sendersubject;

        @TableField("nosamesubject")
    private String nosamesubject;

        @TableField("defaultsubject")
    private String defaultsubject;

        @TableField("aimvouchertype")
    private String aimvouchertype;

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
    private LocalDate ts;

        @TableField("dr")
    private Integer dr;

        @TableField("state")
    private Integer state;

        @TableField("name2")
    private String name2;

        @TableField("name3")
    private String name3;

        @TableField("name4")
    private String name4;

        @TableField("name5")
    private String name5;

        @TableField("name6")
    private String name6;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("defaulttype")
    private Boolean defaulttype;

        @TableField("ytenant_id")
    private String ytenantId;


}