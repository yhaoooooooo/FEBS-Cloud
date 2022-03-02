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
    @TableName("report_model_info")
    public class ReportModelInfo implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("name")
    private String name;

        @TableField("code")
    private String code;

        @TableField("pid")
    private String pid;

        @TableField("type")
    private Integer type;

        @TableField("sub_type")
    private Integer subType;

        @TableField("tech_type")
    private Integer techType;

        @TableField("is_sys")
    private Integer isSys;

        @TableField("labels")
    private String labels;

        @TableField("deploy")
    private String deploy;

        @TableField("status")
    private Integer status;

        @TableField("version")
    private String version;

        @TableField("rule")
    private Integer rule;

        @TableField("etl")
    private Integer etl;

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

        @TableField("pkcolumn")
    private String pkcolumn;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("fetch_type")
    private Integer fetchType;

        @TableField("fetch_url")
    private String fetchUrl;

        @TableField("ytenant_id")
    private String ytenantId;


}