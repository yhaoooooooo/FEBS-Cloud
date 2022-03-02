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
    @TableName("coa_rulecodynfac")
    public class CoaRulecodynfac implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("allocrule")
    private String allocrule;

        @TableField("periodtype")
    private String periodtype;

        @TableField("offsetattr")
    private Integer offsetattr;

        @TableField("accattrs")
    private Blob accattrs;

        @TableField("conditionattr")
    private String conditionattr;

        @TableField("conditiondesc")
    private String conditiondesc;

        @TableField("fixedperiod")
    private String fixedperiod;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("dyAuxiliarys")
    private Blob dyauxiliarys;

        @TableField("dynPeriod")
    private String dynperiod;

        @TableField("ytenant_id")
    private String ytenantId;


}