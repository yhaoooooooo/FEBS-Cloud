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
    @TableName("fi_notetype")
    public class FiNotetype implements Serializable {

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

        @TableField("enable")
    private Boolean enable;

        @TableField("entityid")
    private String entityid;

        @TableField("entityorder")
    private Integer entityorder;

        @TableField("icon")
    private String icon;

        @TableField("name")
    private String name;

        @TableField("parentid")
    private String parentid;

        @TableField("iscashpayment")
    private Boolean iscashpayment;

        @TableField("ismakevoucher")
    private Boolean ismakevoucher;

        @TableField("ispaybank")
    private Boolean ispaybank;

        @TableField("hasfile")
    private Boolean hasfile;

        @TableField("visable")
    private Boolean visable;

        @TableField("importerror")
    private String importerror;

        @TableField("funcode")
    private String funcode;

        @TableField("showtype")
    private String showtype;

        @TableField("showorder")
    private Integer showorder;

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

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}