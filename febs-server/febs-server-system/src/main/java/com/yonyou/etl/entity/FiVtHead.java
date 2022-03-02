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
    @TableName("fi_vt_head")
    public class FiVtHead implements Serializable {

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

        @TableField("accbook")
    private String accbook;

        @TableField("accstandard")
    private String accstandard;

        @TableField("accbody")
    private String accbody;

        @TableField("category")
    private String category;

        @TableField("code")
    private String code;

        @TableField("ismachine")
    private Boolean ismachine;

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

        @TableField("outserviceimpl")
    private String outserviceimpl;

        @TableField("outserviceparams")
    private String outserviceparams;

        @TableField("settlestrategy")
    private String settlestrategy;

        @TableField("showorder")
    private Integer showorder;

        @TableField("terminal")
    private Boolean terminal;

        @TableField("vouchertype")
    private String vouchertype;

        @TableField("vtlevel")
    private String vtlevel;

        @TableField("accsubjectchart")
    private String accsubjectchart;

        @TableField("periodtype")
    private String periodtype;

        @TableField("effectperiod")
    private String effectperiod;

        @TableField("expiryperiod")
    private String expiryperiod;

        @TableField("parmk1")
    private String parmk1;

        @TableField("parmt1")
    private String parmt1;

        @TableField("parmv1")
    private String parmv1;

        @TableField("parmk2")
    private String parmk2;

        @TableField("parmt2")
    private String parmt2;

        @TableField("parmv2")
    private String parmv2;

        @TableField("parmk3")
    private String parmk3;

        @TableField("parmt3")
    private String parmt3;

        @TableField("parmv3")
    private String parmv3;

        @TableField("parmk4")
    private String parmk4;

        @TableField("parmt4")
    private String parmt4;

        @TableField("parmv4")
    private String parmv4;

        @TableField("parmk5")
    private String parmk5;

        @TableField("parmt5")
    private String parmt5;

        @TableField("parmv5")
    private String parmv5;

        @TableField("parmk6")
    private String parmk6;

        @TableField("parmt6")
    private String parmt6;

        @TableField("parmv6")
    private String parmv6;

        @TableField("parmk7")
    private String parmk7;

        @TableField("parmt7")
    private String parmt7;

        @TableField("parmv7")
    private String parmv7;

        @TableField("parmk8")
    private String parmk8;

        @TableField("parmt8")
    private String parmt8;

        @TableField("parmv8")
    private String parmv8;

        @TableField("parmk9")
    private String parmk9;

        @TableField("parmt9")
    private String parmt9;

        @TableField("parmv9")
    private String parmv9;

        @TableField("parmk10")
    private String parmk10;

        @TableField("parmv10")
    private String parmv10;

        @TableField("parmt10")
    private String parmt10;

        @TableField("parmk11")
    private String parmk11;

        @TableField("parmv11")
    private String parmv11;

        @TableField("parmt11")
    private String parmt11;

        @TableField("parmk12")
    private String parmk12;

        @TableField("parmv12")
    private String parmv12;

        @TableField("parmt12")
    private String parmt12;

        @TableField("parmk13")
    private String parmk13;

        @TableField("parmv13")
    private String parmv13;

        @TableField("parmt13")
    private String parmt13;

        @TableField("parmk14")
    private String parmk14;

        @TableField("parmv14")
    private String parmv14;

        @TableField("parmt14")
    private String parmt14;

        @TableField("parmk15")
    private String parmk15;

        @TableField("parmv15")
    private String parmv15;

        @TableField("parmt15")
    private String parmt15;

        @TableField("parmk16")
    private String parmk16;

        @TableField("parmv16")
    private String parmv16;

        @TableField("parmt16")
    private String parmt16;

        @TableField("parmk17")
    private String parmk17;

        @TableField("parmv17")
    private String parmv17;

        @TableField("parmt17")
    private String parmt17;

        @TableField("parmk18")
    private String parmk18;

        @TableField("parmv18")
    private String parmv18;

        @TableField("parmt18")
    private String parmt18;

        @TableField("parmk19")
    private String parmk19;

        @TableField("parmv19")
    private String parmv19;

        @TableField("parmt19")
    private String parmt19;

        @TableField("parmk20")
    private String parmk20;

        @TableField("parmv20")
    private String parmv20;

        @TableField("parmt20")
    private String parmt20;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("from_accbook")
    private Boolean fromAccbook;

        @TableField("description2")
    private String description2;

        @TableField("description3")
    private String description3;

        @TableField("description4")
    private String description4;

        @TableField("description5")
    private String description5;

        @TableField("description6")
    private String description6;

        @TableField("rulevouchersort")
    private String rulevouchersort;

        @TableField("profitaloss")
    private Boolean profitaloss;

        @TableField("profitaccsubject")
    private String profitaccsubject;

        @TableField("currencycarry")
    private Boolean currencycarry;

        @TableField("carrytype")
    private String carrytype;

        @TableField("manualaccsubject")
    private String manualaccsubject;

        @TableField("vdescription")
    private String vdescription;

        @TableField("vdescription2")
    private String vdescription2;

        @TableField("vdescription3")
    private String vdescription3;

        @TableField("vdescription4")
    private String vdescription4;

        @TableField("vdescription5")
    private String vdescription5;

        @TableField("vdescription6")
    private String vdescription6;

        @TableField("ytenant_id")
    private String ytenantId;

        @TableField("template_type")
    private String templateType;

        @TableField("share")
    private Boolean share;

        @TableField("formula")
    private Boolean formula;

        @TableField("cashflowitem")
    private Boolean cashflowitem;


}