package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
    @TableName("tmp_accsubject")
    public class Accsubject implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("batch")
    private String batch;

        @TableField("code")
    private String code;

        @TableField("direction")
    private String direction;

        @TableField("subject")
    private String subject;

        @TableField("topcode")
    private String topcode;

        @TableField("deficitcheckstrategy")
    private String deficitcheckstrategy;

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

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}