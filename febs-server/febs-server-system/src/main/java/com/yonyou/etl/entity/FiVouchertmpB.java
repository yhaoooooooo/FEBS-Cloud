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
    @TableName("fi_vouchertmp_b")
    public class FiVouchertmpB implements Serializable {

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

        @TableField("accsubject")
    private String accsubject;

        @TableField("auxiliary")
    private String auxiliary;

        @TableField("credit_global")
    private BigDecimal creditGlobal;

        @TableField("credit_group")
    private BigDecimal creditGroup;

        @TableField("credit_org")
    private BigDecimal creditOrg;

        @TableField("credit_original")
    private BigDecimal creditOriginal;

        @TableField("credit_quantity")
    private BigDecimal creditQuantity;

        @TableField("currency")
    private String currency;

        @TableField("debit_global")
    private BigDecimal debitGlobal;

        @TableField("debit_group")
    private BigDecimal debitGroup;

        @TableField("debit_org")
    private BigDecimal debitOrg;

        @TableField("debit_original")
    private BigDecimal debitOriginal;

        @TableField("debit_quantity")
    private BigDecimal debitQuantity;

        @TableField("price")
    private BigDecimal price;

        @TableField("rate_global")
    private BigDecimal rateGlobal;

        @TableField("rate_group")
    private BigDecimal rateGroup;

        @TableField("rate_org")
    private BigDecimal rateOrg;

        @TableField("rate_org_op")
    private String rateOrgOp;

        @TableField("recordnumber")
    private Integer recordnumber;

        @TableField("voucherid")
    private String voucherid;

        @TableField("flag")
    private String flag;

        @TableField("busidate")
    private String busidate;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("modify_rule")
    private Blob modifyRule;

        @TableField("secondorg")
    private String secondorg;

        @TableField("ratetype")
    private String ratetype;

        @TableField("settlementmode")
    private String settlementmode;

        @TableField("billtime")
    private String billtime;

        @TableField("billno")
    private String billno;

        @TableField("bankverifycode")
    private String bankverifycode;

        @TableField("ytenant_id")
    private String ytenantId;


}