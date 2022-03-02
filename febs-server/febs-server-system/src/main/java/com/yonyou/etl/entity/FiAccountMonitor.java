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
    @TableName("fi_account_monitor")
    public class FiAccountMonitor implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 模版名称
            */
        @TableField("name")
    private String name;

            /**
            * 设置列数
            */
        @TableField("setcolumns")
    private Integer setcolumns;

            /**
            * 序号
            */
        @TableField("orderno")
    private Integer orderno;

            /**
            * 模版编码
            */
        @TableField("templatecode")
    private String templatecode;

        @TableField("updatetime")
    private String updatetime;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}