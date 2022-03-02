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
    @TableName("report_info")
    public class ReportInfo implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("pid")
    private String pid;

        @TableField("type")
    private Integer type;

        @TableField("biz_type")
    private Integer bizType;

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

        @TableField("rpt_item_type_id")
    private String rptItemTypeId;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("description")
    private String description;

        @TableField("labels")
    private String labels;

        @TableField("is_sys")
    private Integer isSys;

        @TableField("is_input")
    private Integer isInput;

        @TableField("href")
    private String href;

        @TableField("content")
    private Blob content;

        @TableField("params")
    private String params;

        @TableField("sec_class")
    private String secClass;

        @TableField("status")
    private Integer status;

        @TableField("code")
    private String code;

        @TableField("report_type_id")
    private String reportTypeId;

        @TableField("report_category_id")
    private String reportCategoryId;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("report_view_id")
    private String reportViewId;

        @TableField("accstandard")
    private String accstandard;

        @TableField("ytenant_id")
    private String ytenantId;


}