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
    @TableName("coa_computationcheckresult_cost")
    public class CoaComputationcheckresultCost implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 检查项id
            */
        @TableField("checkid")
    private String checkid;

            /**
            * 任务编码
            */
        @TableField("taskcode")
    private String taskcode;

            /**
            * 任务名称
            */
        @TableField("taskname")
    private String taskname;

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

            /**
            * 动因编码
            */
        @TableField("dycode")
    private String dycode;

            /**
            * 动因名称
            */
        @TableField("dyname")
    private String dyname;

        @TableField("dyname2")
    private String dyname2;

        @TableField("dyname3")
    private String dyname3;

        @TableField("dyname4")
    private String dyname4;

        @TableField("dyname5")
    private String dyname5;

        @TableField("dyname6")
    private String dyname6;

            /**
            * 年度
            */
        @TableField("year")
    private String year;

            /**
            * 期间
            */
        @TableField("period")
    private String period;

            /**
            * 住户
            */
        @TableField("tenantid")
    private String tenantid;

            /**
            * 接口消息
            */
        @TableField("message")
    private String message;

        @TableField("message2")
    private String message2;

        @TableField("message3")
    private String message3;

        @TableField("message4")
    private String message4;

        @TableField("message5")
    private String message5;

        @TableField("message6")
    private String message6;

            /**
            * 凭证号
            */
        @TableField("voucherno")
    private String voucherno;

            /**
            * 凭证日期
            */
        @TableField("voucherdate")
    private String voucherdate;

            /**
            * 成本对象类型
            */
        @TableField("costobjecttype")
    private String costobjecttype;

            /**
            * 成本对象值
            */
        @TableField("costobjectvalue")
    private String costobjectvalue;

            /**
            * 本币金额
            */
        @TableField("accbookamount")
    private String accbookamount;

            /**
            * 成本要素
            */
        @TableField("costfactor")
    private String costfactor;

            /**
            * 方向
            */
        @TableField("direction")
    private String direction;

            /**
            * 作业类型
            */
        @TableField("activitytype")
    private String activitytype;

            /**
            * 作业数量
            */
        @TableField("activitytotalnum")
    private String activitytotalnum;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}