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
* 报表模板
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("rpt_bd_rptmod")
    public class RptBdRptmod implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("appid")
    private String appid;

        @TableField("tenantid")
    private String tenantid;

        @TableField("fileurl")
    private String fileurl;

        @TableField("fillable")
    private Integer fillable;

        @TableField("rpttypeid")
    private String rpttypeid;

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

        @TableField("code")
    private String code;

        @TableField("name")
    private String name;

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

        @TableField("enable")
    private Boolean enable;

        @TableField("parentid")
    private String parentid;

        @TableField("classifyid")
    private String classifyid;

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

        @TableField("def6")
    private String def6;

        @TableField("def7")
    private String def7;

        @TableField("def8")
    private String def8;

        @TableField("def9")
    private String def9;

        @TableField("def10")
    private String def10;

        @TableField("def11")
    private String def11;

        @TableField("def12")
    private String def12;

        @TableField("def13")
    private String def13;

        @TableField("def14")
    private String def14;

        @TableField("def15")
    private String def15;

        @TableField("def16")
    private String def16;

        @TableField("def17")
    private String def17;

        @TableField("def18")
    private String def18;

        @TableField("def19")
    private String def19;

        @TableField("def20")
    private String def20;

        @TableField("def21")
    private String def21;

        @TableField("def22")
    private String def22;

        @TableField("def23")
    private String def23;

        @TableField("def24")
    private String def24;

        @TableField("def25")
    private String def25;

        @TableField("def26")
    private String def26;

        @TableField("def27")
    private String def27;

        @TableField("def28")
    private String def28;

        @TableField("def29")
    private String def29;

        @TableField("def30")
    private String def30;

        @TableField("ytenant_id")
    private String ytenantId;


}