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
* 期间档案
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("cw_dim_period")
    public class CwDimPeriod implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * ID
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 租户ID
            */
        @TableField("tenantid")
    private String tenantid;

            /**
            * 账簿ID
            */
        @TableField("accbook_id")
    private String accbookId;

            /**
            * 账簿编码
            */
        @TableField("accbook_code")
    private String accbookCode;

            /**
            * 账簿名称
            */
        @TableField("accbook_name")
    private String accbookName;

            /**
            * 开始期间
            */
        @TableField("begin_period")
    private String beginPeriod;

            /**
            * 期间
            */
        @TableField("cperiod")
    private String cperiod;

        @TableField("ytenant_id")
    private String ytenantId;


}