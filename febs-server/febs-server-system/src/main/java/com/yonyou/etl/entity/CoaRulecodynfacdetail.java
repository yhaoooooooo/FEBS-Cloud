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
    @TableName("coa_rulecodynfacdetail")
    public class CoaRulecodynfacdetail implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("codynfac")
    private String codynfac;

        @TableField("rownumber")
    private Integer rownumber;

        @TableField("rate")
    private BigDecimal rate;

        @TableField("negativeset")
    private String negativeset;

        @TableField("maversion")
    private String maversion;

        @TableField("datascope")
    private String datascope;

        @TableField("direction")
    private String direction;

        @TableField("costelementgroup")
    private String costelementgroup;

        @TableField("ccstatisindicators")
    private String ccstatisindicators;

        @TableField("bdactivitytype")
    private String bdactivitytype;

        @TableField("costelementstart")
    private String costelementstart;

        @TableField("costelementend")
    private String costelementend;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("rulecodynfacid")
    private String rulecodynfacid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("ytenant_id")
    private String ytenantId;


}