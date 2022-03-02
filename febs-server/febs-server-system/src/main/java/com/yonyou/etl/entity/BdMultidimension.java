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
    @TableName("bd_multidimension")
    public class BdMultidimension implements Serializable {

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

        @TableField("vr1")
    private String vr1;

        @TableField("vr10")
    private String vr10;

        @TableField("vr11")
    private String vr11;

        @TableField("vr12")
    private String vr12;

        @TableField("vr13")
    private String vr13;

        @TableField("vr14")
    private String vr14;

        @TableField("vr15")
    private String vr15;

        @TableField("vr16")
    private String vr16;

        @TableField("vr17")
    private String vr17;

        @TableField("vr18")
    private String vr18;

        @TableField("vr19")
    private String vr19;

        @TableField("vr2")
    private String vr2;

        @TableField("vr20")
    private String vr20;

        @TableField("vr21")
    private String vr21;

        @TableField("vr22")
    private String vr22;

        @TableField("vr23")
    private String vr23;

        @TableField("vr24")
    private String vr24;

        @TableField("vr25")
    private String vr25;

        @TableField("vr26")
    private String vr26;

        @TableField("vr27")
    private String vr27;

        @TableField("vr28")
    private String vr28;

        @TableField("vr29")
    private String vr29;

        @TableField("vr3")
    private String vr3;

        @TableField("vr30")
    private String vr30;

        @TableField("vr4")
    private String vr4;

        @TableField("vr5")
    private String vr5;

        @TableField("vr6")
    private String vr6;

        @TableField("vr7")
    private String vr7;

        @TableField("vr8")
    private String vr8;

        @TableField("vr9")
    private String vr9;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("vr31")
    private String vr31;

        @TableField("vr32")
    private String vr32;

        @TableField("vr33")
    private String vr33;

        @TableField("vr34")
    private String vr34;

        @TableField("vr35")
    private String vr35;

        @TableField("vr36")
    private String vr36;

        @TableField("vr37")
    private String vr37;

        @TableField("vr38")
    private String vr38;

        @TableField("vr39")
    private String vr39;

        @TableField("vr40")
    private String vr40;

        @TableField("vr41")
    private String vr41;

        @TableField("vr42")
    private String vr42;

        @TableField("vr43")
    private String vr43;

        @TableField("vr44")
    private String vr44;

        @TableField("vr45")
    private String vr45;

        @TableField("vr46")
    private String vr46;

        @TableField("vr47")
    private String vr47;

        @TableField("vr48")
    private String vr48;

        @TableField("vr49")
    private String vr49;

        @TableField("vr50")
    private String vr50;

        @TableField("ytenant_id")
    private String ytenantId;


}