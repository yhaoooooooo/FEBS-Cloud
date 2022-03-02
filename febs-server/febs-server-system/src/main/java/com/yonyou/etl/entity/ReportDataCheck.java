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
* 数据校验
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("report_data_check")
    public class ReportDataCheck implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("rpt_item_type_id")
    private String rptItemTypeId;

        @TableField("accbookid")
    private String accbookid;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("period")
    private String period;

            /**
            * 0：未发布，1：发布 ， 2：未发布
            */
        @TableField("state")
    private Integer state;

        @TableField("success")
    private Boolean success;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("year")
    private String year;

            /**
            * 结账状态：  0 未结账 1 已结账
            */
        @TableField("accbook_state")
    private Integer accbookState;

            /**
            * 0：正常，1：计算中， 2：无数据
            */
        @TableField("data_state")
    private Integer dataState;

            /**
            * 0或者空：未启用，1：已启用
            */
        @TableField("enabled")
    private Integer enabled;

        @TableField("ytenant_id")
    private String ytenantId;


}