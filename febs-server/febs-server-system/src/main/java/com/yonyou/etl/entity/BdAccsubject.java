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
    @TableName("bd_accsubject")
    public class BdAccsubject implements Serializable {

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

        @TableField("accbook")
    private String accbook;

        @TableField("accelement")
    private String accelement;

        @TableField("accproperty")
    private String accproperty;

        @TableField("accrualcontrol")
    private Boolean accrualcontrol;

        @TableField("accsubjectchart")
    private String accsubjectchart;

        @TableField("balancecontrol")
    private Boolean balancecontrol;

        @TableField("balancedisplay")
    private Boolean balancedisplay;

        @TableField("controlway")
    private String controlway;

        @TableField("currency")
    private String currency;

        @TableField("deficitcheckstrategy")
    private String deficitcheckstrategy;

        @TableField("direction")
    private String direction;

        @TableField("displayname")
    private String displayname;

        @TableField("displayname2")
    private String displayname2;

        @TableField("displayname3")
    private String displayname3;

        @TableField("displayname4")
    private String displayname4;

        @TableField("displayname5")
    private String displayname5;

        @TableField("displayname6")
    private String displayname6;

        @TableField("leaf")
    private Boolean leaf;

        @TableField("measuredoc")
    private String measuredoc;

        @TableField("mnemonicCode")
    private String mnemoniccode;

        @TableField("numcheck")
    private Boolean numcheck;

        @TableField("outchart")
    private Boolean outchart;

        @TableField("subject")
    private String subject;

        @TableField("subjectlevel")
    private Integer subjectlevel;

        @TableField("vr1")
    private Boolean vr1;

        @TableField("vr10")
    private Boolean vr10;

        @TableField("vr11")
    private Boolean vr11;

        @TableField("vr12")
    private Boolean vr12;

        @TableField("vr13")
    private Boolean vr13;

        @TableField("vr14")
    private Boolean vr14;

        @TableField("vr15")
    private Boolean vr15;

        @TableField("vr16")
    private Boolean vr16;

        @TableField("vr17")
    private Boolean vr17;

        @TableField("vr18")
    private Boolean vr18;

        @TableField("vr19")
    private Boolean vr19;

        @TableField("vr2")
    private Boolean vr2;

        @TableField("vr20")
    private Boolean vr20;

        @TableField("vr21")
    private Boolean vr21;

        @TableField("vr22")
    private Boolean vr22;

        @TableField("vr23")
    private Boolean vr23;

        @TableField("vr24")
    private Boolean vr24;

        @TableField("vr25")
    private Boolean vr25;

        @TableField("vr26")
    private Boolean vr26;

        @TableField("vr27")
    private Boolean vr27;

        @TableField("vr28")
    private Boolean vr28;

        @TableField("vr29")
    private Boolean vr29;

        @TableField("vr3")
    private Boolean vr3;

        @TableField("vr30")
    private Boolean vr30;

        @TableField("vr4")
    private Boolean vr4;

        @TableField("vr5")
    private Boolean vr5;

        @TableField("vr6")
    private Boolean vr6;

        @TableField("vr7")
    private Boolean vr7;

        @TableField("vr8")
    private Boolean vr8;

        @TableField("vr9")
    private Boolean vr9;

        @TableField("cashCategory")
    private String cashcategory;

        @TableField("parentchart")
    private String parentchart;

        @TableField("parentleaf")
    private Boolean parentleaf;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("vr31")
    private Boolean vr31;

        @TableField("vr32")
    private Boolean vr32;

        @TableField("vr33")
    private Boolean vr33;

        @TableField("vr34")
    private Boolean vr34;

        @TableField("vr35")
    private Boolean vr35;

        @TableField("vr36")
    private Boolean vr36;

        @TableField("vr37")
    private Boolean vr37;

        @TableField("vr38")
    private Boolean vr38;

        @TableField("vr39")
    private Boolean vr39;

        @TableField("vr40")
    private Boolean vr40;

        @TableField("vr41")
    private Boolean vr41;

        @TableField("vr42")
    private Boolean vr42;

        @TableField("vr43")
    private Boolean vr43;

        @TableField("vr44")
    private Boolean vr44;

        @TableField("vr45")
    private Boolean vr45;

        @TableField("vr46")
    private Boolean vr46;

        @TableField("vr47")
    private Boolean vr47;

        @TableField("vr48")
    private Boolean vr48;

        @TableField("vr49")
    private Boolean vr49;

        @TableField("vr50")
    private Boolean vr50;

        @TableField("vr51")
    private Boolean vr51;

        @TableField("vr52")
    private Boolean vr52;

        @TableField("vr53")
    private Boolean vr53;

        @TableField("vr54")
    private Boolean vr54;

        @TableField("vr55")
    private Boolean vr55;

        @TableField("vr56")
    private Boolean vr56;

        @TableField("vr57")
    private Boolean vr57;

        @TableField("vr58")
    private Boolean vr58;

        @TableField("vr59")
    private Boolean vr59;

        @TableField("vr60")
    private Boolean vr60;

        @TableField("vr61")
    private Boolean vr61;

        @TableField("vr62")
    private Boolean vr62;

        @TableField("vr63")
    private Boolean vr63;

        @TableField("vr64")
    private Boolean vr64;

        @TableField("vr65")
    private Boolean vr65;

        @TableField("vr66")
    private Boolean vr66;

        @TableField("vr67")
    private Boolean vr67;

        @TableField("vr68")
    private Boolean vr68;

        @TableField("vr69")
    private Boolean vr69;

        @TableField("vr70")
    private Boolean vr70;

        @TableField("vr71")
    private Boolean vr71;

        @TableField("vr72")
    private Boolean vr72;

        @TableField("vr73")
    private Boolean vr73;

        @TableField("vr74")
    private Boolean vr74;

        @TableField("vr75")
    private Boolean vr75;

        @TableField("vr76")
    private Boolean vr76;

        @TableField("vr77")
    private Boolean vr77;

        @TableField("vr78")
    private Boolean vr78;

        @TableField("vr79")
    private Boolean vr79;

        @TableField("vr80")
    private Boolean vr80;

        @TableField("vr81")
    private Boolean vr81;

        @TableField("vr82")
    private Boolean vr82;

        @TableField("vr83")
    private Boolean vr83;

        @TableField("vr84")
    private Boolean vr84;

        @TableField("vr85")
    private Boolean vr85;

        @TableField("vr86")
    private Boolean vr86;

        @TableField("vr87")
    private Boolean vr87;

        @TableField("vr88")
    private Boolean vr88;

        @TableField("vr89")
    private Boolean vr89;

        @TableField("vr90")
    private Boolean vr90;

        @TableField("vr91")
    private Boolean vr91;

        @TableField("vr92")
    private Boolean vr92;

        @TableField("vr93")
    private Boolean vr93;

        @TableField("vr94")
    private Boolean vr94;

        @TableField("vr95")
    private Boolean vr95;

        @TableField("vr96")
    private Boolean vr96;

        @TableField("vr97")
    private Boolean vr97;

        @TableField("vr98")
    private Boolean vr98;

        @TableField("vr99")
    private Boolean vr99;

        @TableField("vr100")
    private Boolean vr100;

            /**
            * 是否强管控
            */
        @TableField("strongctrl")
    private Boolean strongctrl;

            /**
            * 派生的核心租户的数据id
            */
        @TableField("srccoreid")
    private String srccoreid;

        @TableField("ytenant_id")
    private String ytenantId;

        @TableField("settlementmode")
    private Boolean settlementmode;

        @TableField("billtime")
    private Boolean billtime;

        @TableField("billno")
    private Boolean billno;

        @TableField("bankverifycode")
    private Boolean bankverifycode;


}