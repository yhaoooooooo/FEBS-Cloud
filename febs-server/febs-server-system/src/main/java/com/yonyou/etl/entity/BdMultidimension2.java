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
    @TableName("bd_multidimension_2")
    public class BdMultidimension2 implements Serializable {

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

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("vr51")
    private String vr51;

        @TableField("vr52")
    private String vr52;

        @TableField("vr53")
    private String vr53;

        @TableField("vr54")
    private String vr54;

        @TableField("vr55")
    private String vr55;

        @TableField("vr56")
    private String vr56;

        @TableField("vr57")
    private String vr57;

        @TableField("vr58")
    private String vr58;

        @TableField("vr59")
    private String vr59;

        @TableField("vr60")
    private String vr60;

        @TableField("vr61")
    private String vr61;

        @TableField("vr62")
    private String vr62;

        @TableField("vr63")
    private String vr63;

        @TableField("vr64")
    private String vr64;

        @TableField("vr65")
    private String vr65;

        @TableField("vr66")
    private String vr66;

        @TableField("vr67")
    private String vr67;

        @TableField("vr68")
    private String vr68;

        @TableField("vr69")
    private String vr69;

        @TableField("vr70")
    private String vr70;

        @TableField("vr71")
    private String vr71;

        @TableField("vr72")
    private String vr72;

        @TableField("vr73")
    private String vr73;

        @TableField("vr74")
    private String vr74;

        @TableField("vr75")
    private String vr75;

        @TableField("vr76")
    private String vr76;

        @TableField("vr77")
    private String vr77;

        @TableField("vr78")
    private String vr78;

        @TableField("vr79")
    private String vr79;

        @TableField("vr80")
    private String vr80;

        @TableField("vr81")
    private String vr81;

        @TableField("vr82")
    private String vr82;

        @TableField("vr83")
    private String vr83;

        @TableField("vr84")
    private String vr84;

        @TableField("vr85")
    private String vr85;

        @TableField("vr86")
    private String vr86;

        @TableField("vr87")
    private String vr87;

        @TableField("vr88")
    private String vr88;

        @TableField("vr89")
    private String vr89;

        @TableField("vr90")
    private String vr90;

        @TableField("vr91")
    private String vr91;

        @TableField("vr92")
    private String vr92;

        @TableField("vr93")
    private String vr93;

        @TableField("vr94")
    private String vr94;

        @TableField("vr95")
    private String vr95;

        @TableField("vr96")
    private String vr96;

        @TableField("vr97")
    private String vr97;

        @TableField("vr98")
    private String vr98;

        @TableField("vr99")
    private String vr99;

        @TableField("vr100")
    private String vr100;

        @TableField("ytenant_id")
    private String ytenantId;


}