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
    @TableName("ex_classmapping")
    public class ExClassmapping implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("creationtime")
    private String creationtime;

        @TableField("creator")
    private String creator;

        @TableField("description")
    private String description;

        @TableField("dr")
    private Integer dr;

        @TableField("modifiedtime")
    private String modifiedtime;

        @TableField("modifier")
    private String modifier;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("ts")
    private String ts;

        @TableField("classifyid")
    private String classifyid;

        @TableField("code")
    private String code;

        @TableField("def1")
    private String def1;

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

        @TableField("def2")
    private String def2;

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

        @TableField("def3")
    private String def3;

        @TableField("def30")
    private String def30;

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

        @TableField("enable")
    private Boolean enable;

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

        @TableField("parentid")
    private String parentid;

        @TableField("classtype1")
    private String classtype1;

        @TableField("classtype10")
    private String classtype10;

        @TableField("classtype11")
    private String classtype11;

        @TableField("classtype12")
    private String classtype12;

        @TableField("classtype13")
    private String classtype13;

        @TableField("classtype14")
    private String classtype14;

        @TableField("classtype15")
    private String classtype15;

        @TableField("classtype16")
    private String classtype16;

        @TableField("classtype17")
    private String classtype17;

        @TableField("classtype18")
    private String classtype18;

        @TableField("classtype19")
    private String classtype19;

        @TableField("classtype2")
    private String classtype2;

        @TableField("classtype20")
    private String classtype20;

        @TableField("classtype3")
    private String classtype3;

        @TableField("classtype4")
    private String classtype4;

        @TableField("classtype5")
    private String classtype5;

        @TableField("classtype6")
    private String classtype6;

        @TableField("classtype7")
    private String classtype7;

        @TableField("classtype8")
    private String classtype8;

        @TableField("classtype9")
    private String classtype9;

        @TableField("targettype")
    private String targettype;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("accbookid")
    private String accbookid;

        @TableField("globalid")
    private String globalid;

        @TableField("version")
    private String version;

        @TableField("accsubjectchart")
    private String accsubjectchart;

        @TableField("defaultaccsubject")
    private String defaultaccsubject;

        @TableField("targetvouchertype")
    private String targetvouchertype;

        @TableField("accpurposes")
    private String accpurposes;

        @TableField("permission")
    private Integer permission;

        @TableField("issocial")
    private Boolean issocial;

        @TableField("ytenant_id")
    private String ytenantId;


}