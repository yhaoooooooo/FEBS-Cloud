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

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("coa_codynbilldetail")
    public class CoaCodynbilldetail implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("attr01")
    private String attr01;

        @TableField("attr02")
    private String attr02;

        @TableField("attr03")
    private String attr03;

        @TableField("attr04")
    private String attr04;

        @TableField("attr05")
    private String attr05;

        @TableField("attr06")
    private String attr06;

        @TableField("attr07")
    private String attr07;

        @TableField("attr08")
    private String attr08;

        @TableField("attr09")
    private String attr09;

        @TableField("attr10")
    private String attr10;

        @TableField("attr11")
    private String attr11;

        @TableField("attr12")
    private String attr12;

        @TableField("attr13")
    private String attr13;

        @TableField("attr14")
    private String attr14;

        @TableField("attr15")
    private String attr15;

        @TableField("attr16")
    private String attr16;

        @TableField("attr17")
    private String attr17;

        @TableField("attr18")
    private String attr18;

        @TableField("attr19")
    private String attr19;

        @TableField("attr20")
    private String attr20;

        @TableField("codynbill")
    private String codynbill;

        @TableField("rate")
    private BigDecimal rate;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ratesum")
    private BigDecimal ratesum;

        @TableField("ytenant_id")
    private String ytenantId;


}