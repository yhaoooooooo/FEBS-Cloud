package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("resp_vouchertemp_b")
    public class RespVouchertempB implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("recordnumber")
    private Integer recordnumber;

        @TableField("description")
    private String description;

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

        @TableField("costcenter")
    private String costcenter;

        @TableField("accsubject")
    private String accsubject;

        @TableField("auxiliary")
    private String auxiliary;

        @TableField("credit_quantity")
    private BigDecimal creditQuantity;

        @TableField("debit_quantity")
    private BigDecimal debitQuantity;

        @TableField("price")
    private BigDecimal price;

        @TableField("currency")
    private String currency;

        @TableField("credit_global")
    private BigDecimal creditGlobal;

        @TableField("credit_org")
    private BigDecimal creditOrg;

        @TableField("credit_original")
    private BigDecimal creditOriginal;

        @TableField("debit_global")
    private BigDecimal debitGlobal;

        @TableField("debit_org")
    private BigDecimal debitOrg;

        @TableField("debit_original")
    private BigDecimal debitOriginal;

        @TableField("rate_org")
    private BigDecimal rateOrg;

        @TableField("rate_org_op")
    private String rateOrgOp;

        @TableField("voucherid")
    private String voucherid;

        @TableField("secondorg")
    private String secondorg;

        @TableField("secondorg_v")
    private String secondorgV;

        @TableField("accbook")
    private String accbook;

        @TableField("period")
    private String period;

        @TableField("creationtime")
    private String creationtime;

        @TableField("creator")
    private String creator;

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

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("quantity")
    private BigDecimal quantity;

        @TableField("coavbid")
    private String coavbid;

        @TableField("coa_planid")
    private String coaPlanid;

        @TableField("coa_type")
    private String coaType;

        @TableField("rate_date")
    private String rateDate;

        @TableField("rate_class")
    private String rateClass;

        @TableField("modify_rule")
    private Blob modifyRule;

        @TableField("ytenant_id")
    private String ytenantId;


}