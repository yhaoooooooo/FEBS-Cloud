package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("cf_rule_record")
    public class CfRuleRecord implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("rule")
    private String rule;

        @TableField("multiline")
    private Boolean multiline;

        @TableField("mainitem")
    private String mainitem;

        @TableField("attachitem")
    private String attachitem;

        @TableField("accsubject")
    private String accsubject;

        @TableField("direction")
    private String direction;

        @TableField("creator")
    private String creator;

        @TableField("creationtime")
    private LocalDate creationtime;

        @TableField("modifier")
    private String modifier;

        @TableField("modifiedtime")
    private LocalDateTime modifiedtime;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("description")
    private String description;

        @TableField("ts")
    private LocalDate ts;

        @TableField("dr")
    private Integer dr;

        @TableField("state")
    private Integer state;

        @TableField("ruleId")
    private String ruleid;

        @TableField("accsubjectrange")
    private String accsubjectrange;

        @TableField("sequence")
    private Integer sequence;

        @TableField("isnegligible")
    private Boolean isnegligible;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}