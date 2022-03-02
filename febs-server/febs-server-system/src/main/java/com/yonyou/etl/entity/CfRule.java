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
    @TableName("cf_rule")
    public class CfRule implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("code")
    private String code;

        @TableField("name")
    private String name;

        @TableField("tlevel")
    private String tlevel;

        @TableField("cashflowtype")
    private String cashflowtype;

        @TableField("accsubjectchart")
    private String accsubjectchart;

        @TableField("accbook")
    private String accbook;

        @TableField("ruletype")
    private String ruletype;

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

        @TableField("priority")
    private Float priority;

        @TableField("accsubject")
    private String accsubject;

        @TableField("isrevmatch")
    private Boolean isrevmatch;

        @TableField("ismainrule")
    private String ismainrule;

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

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}