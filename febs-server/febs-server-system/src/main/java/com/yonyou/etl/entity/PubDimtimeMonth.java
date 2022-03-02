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
* 时间维度表_月
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("pub_dimtime_month")
    public class PubDimtimeMonth implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 年月
            */
            @TableId(value = "YEARMONTH_NUM", type = IdType.UUID)
    private Integer yearmonthNum;

            /**
            * 期间
            */
        @TableField("PK_YEARMONTH")
    private String pkYearmonth;

        @TableField("YEARMONTH_NAME")
    private String yearmonthName;

            /**
            * 月
            */
        @TableField("PK_MONTH")
    private String pkMonth;

            /**
            * 月名称
            */
        @TableField("MONTH_NAME")
    private String monthName;

            /**
            * 月序号
            */
        @TableField("PK_MONTH_NUM")
    private Integer pkMonthNum;

            /**
            * 是否季最后一天
            */
        @TableField("IS_LAST_QUARTER")
    private Integer isLastQuarter;

        @TableField("YEARQUARTER_ABB")
    private String yearquarterAbb;

            /**
            * 年
            */
        @TableField("PK_YEAR")
    private Integer pkYear;

            /**
            * 年名称
            */
        @TableField("YEAR_NAME")
    private String yearName;

            /**
            * 是否年最后一天
            */
        @TableField("IS_LAST_YEAR")
    private Integer isLastYear;


}