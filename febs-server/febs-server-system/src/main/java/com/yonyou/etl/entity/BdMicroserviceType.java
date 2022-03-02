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
    @TableName("bd_microservice_type")
    public class BdMicroserviceType implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("sort")
    private Integer sort;

        @TableField("tasktype")
    private String tasktype;

        @TableField("subtype")
    private String subtype;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("taskname")
    private String taskname;

        @TableField("subname")
    private String subname;

        @TableField("ruleClass")
    private String ruleclass;

        @TableField("executeClass")
    private String executeclass;

        @TableField("taskname2")
    private String taskname2;

        @TableField("taskname3")
    private String taskname3;

        @TableField("taskname4")
    private String taskname4;

        @TableField("taskname5")
    private String taskname5;

        @TableField("taskname6")
    private String taskname6;

        @TableField("subname2")
    private String subname2;

        @TableField("subname3")
    private String subname3;

        @TableField("subname4")
    private String subname4;

        @TableField("subname5")
    private String subname5;

        @TableField("subname6")
    private String subname6;

        @TableField("ytenant_id")
    private String ytenantId;


}