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
    @TableName("fi_account_monitordetail")
    public class FiAccountMonitordetail implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 监控模版id
            */
        @TableField("monitortypeid")
    private String monitortypeid;

            /**
            * 模版类型
            */
        @TableField("templatetype")
    private String templatetype;

            /**
            * 模版名称
            */
        @TableField("name")
    private String name;

            /**
            * 链接
            */
        @TableField("url")
    private String url;

            /**
            * 是否显示
            */
        @TableField("isshow")
    private Boolean isshow;

            /**
            * 序号
            */
        @TableField("orderno")
    private Integer orderno;

            /**
            * 占位几列
            */
        @TableField("setcolumns")
    private Integer setcolumns;

            /**
            * 模版编码
            */
        @TableField("namecode")
    private String namecode;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}