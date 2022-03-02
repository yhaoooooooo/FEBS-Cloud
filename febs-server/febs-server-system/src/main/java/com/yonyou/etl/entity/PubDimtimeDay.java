package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
* 时间维度表_日
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("pub_dimtime_day")
    public class PubDimtimeDay implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 日期PK
            */
        @TableField("PK_DATE")
    private String pkDate;

            /**
            * 日期
            */
        @TableField("DATE_NUM")
    private String dateNum;

            /**
            * 本周第几天
            */
        @TableField("WEEK_DAY")
    private Integer weekDay;

            /**
            * 年周数
            */
        @TableField("YEAR_WEEK_NUM")
    private Integer yearWeekNum;

            /**
            * 年周组合PK
            */
        @TableField("PK_YEAR_WEEK")
    private String pkYearWeek;

            /**
            * 周名称
            */
        @TableField("WEEK_NAME")
    private String weekName;

            /**
            * 周开始日期
            */
        @TableField("WEEK_BEGIN_DATE")
    private String weekBeginDate;

            /**
            * 周截止日期
            */
        @TableField("WEEK_END_DATE")
    private String weekEndDate;

            /**
            * 是否周最后一天
            */
        @TableField("IS_LAST_WEEK")
    private Integer isLastWeek;

            /**
            * 本月第几天
            */
        @TableField("MONTH_DAY")
    private Integer monthDay;

            /**
            * 年月
            */
        @TableField("YEARMONTH_NUM")
    private Integer yearmonthNum;

            /**
            * 年月PK
            */
        @TableField("PK_YEARMONTH")
    private String pkYearmonth;

            /**
            * 年月名称
            */
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
            * 月开始日期
            */
        @TableField("MONTH_BEGIN_DATE")
    private String monthBeginDate;

            /**
            * 月截止日期
            */
        @TableField("MONTH_END_DATE")
    private String monthEndDate;

            /**
            * 是否月最后一天
            */
        @TableField("IS_LAST_MONTH")
    private Integer isLastMonth;

            /**
            * 季度序号
            */
        @TableField("QUARTER_NUM")
    private Integer quarterNum;

            /**
            * 季度简称
            */
        @TableField("QUARTER_ABB")
    private String quarterAbb;

            /**
            * 季度名称
            */
        @TableField("QUARTER_NAME")
    private String quarterName;

            /**
            * 年季简写
            */
        @TableField("YEARQUARTER_ABB")
    private String yearquarterAbb;

            /**
            * 季开始日期
            */
        @TableField("QUARTER_BEGIN_DATE")
    private String quarterBeginDate;

            /**
            * 季截止日期
            */
        @TableField("QUARTER_END_DATE")
    private String quarterEndDate;

            /**
            * 是否季最后一天
            */
        @TableField("IS_LAST_QUARTER")
    private Integer isLastQuarter;

            /**
            * 本年第几天
            */
        @TableField("YEAR_DAY")
    private Integer yearDay;

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
            * 年开始日期
            */
        @TableField("YEAR_BEGIN_DATE")
    private String yearBeginDate;

            /**
            * 年截止日期
            */
        @TableField("YEAR_END_DATE")
    private String yearEndDate;

            /**
            * 是否年最后一天
            */
        @TableField("IS_LAST_YEAR")
    private Integer isLastYear;


}