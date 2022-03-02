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
* 数据抽取配置表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("pub_etl_table")
    public class PubEtlTable implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * PK_ETL_TABLE
            */
            @TableId(value = "pk_etl_table", type = IdType.AUTO)
    private Integer pkEtlTable;

            /**
            * 模块
            */
        @TableField("etlmod")
    private String etlmod;

            /**
            * 表名
            */
        @TableField("tablename")
    private String tablename;

            /**
            * 存储表名
            */
        @TableField("gentable")
    private String gentable;

            /**
            * 是否初始化
            */
        @TableField("isincr")
    private Integer isincr;

            /**
            * 表主键
            */
        @TableField("pk_field")
    private String pkField;

            /**
            * 时间戳字段
            */
        @TableField("busidate")
    private String busidate;

            /**
            * 天数
            */
        @TableField("incrdaynum")
    private Integer incrdaynum;

            /**
            * 条件
            */
        @TableField("wherecond")
    private String wherecond;

            /**
            * 最后一次更新时间
            */
        @TableField("etl_lasttime")
    private String etlLasttime;

            /**
            * 是否抽取
            */
        @TableField("isetl")
    private Integer isetl;


}