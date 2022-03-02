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
    @TableName("ds_dm_finrpt_sys")
    public class DsDmFinrptSys implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("year")
    private String year;

        @TableField("scenario")
    private String scenario;

        @TableField("period")
    private String period;

        @TableField("accbookorg")
    private String accbookorg;

        @TableField("accbook")
    private String accbook;

        @TableField("accstandard")
    private String accstandard;

        @TableField("currency")
    private String currency;

        @TableField("pre_report_item")
    private String preReportItem;

        @TableField("dept")
    private String dept;

        @TableField("project")
    private String project;

        @TableField("SS")
    private String ss;

        @TableField("customer")
    private String customer;

        @TableField("supplier")
    private String supplier;

        @TableField("adjs")
    private String adjs;

        @TableField("yearbegin")
    private BigDecimal yearbegin;

        @TableField("accural")
    private BigDecimal accural;

        @TableField("periodend")
    private BigDecimal periodend;

        @TableField("vdefault")
    private BigDecimal vdefault;

        @TableField("tenantid")
    private String tenantid;

        @TableField("ts")
    private String ts;

        @TableField("report_item_type")
    private String reportItemType;

        @TableField("ytenant_id")
    private String ytenantId;


}