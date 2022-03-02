package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Blob;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("coa_allocrule_back")
    public class CoaAllocruleBack implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("allocplan")
    private String allocplan;

        @TableField("undertaketasks")
    private Blob undertaketasks;

        @TableField("execorder")
    private Integer execorder;

        @TableField("status")
    private Boolean status;

        @TableField("supertask")
    private String supertask;

        @TableField("remark")
    private String remark;

        @TableField("rulestatus")
    private Boolean rulestatus;

        @TableField("noscheexec")
    private Boolean noscheexec;

        @TableField("controlarea")
    private String controlarea;

        @TableField("factorchart")
    private String factorchart;

        @TableField("allocruleclass")
    private String allocruleclass;

        @TableField("datasrctype")
    private String datasrctype;

        @TableField("rulelevel")
    private Integer rulelevel;

        @TableField("coatype")
    private String coatype;

        @TableField("ruletype")
    private String ruletype;

        @TableField("dynYear")
    private String dynyear;

        @TableField("dynPeriod")
    private String dynperiod;

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

        @TableField("parentid")
    private String parentid;

        @TableField("classifyid")
    private String classifyid;

        @TableField("enable")
    private Boolean enable;

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

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

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

        @TableField("description")
    private String description;

        @TableField("ts")
    private String ts;

        @TableField("dr")
    private Integer dr;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("ytenant_id")
    private String ytenantId;


}