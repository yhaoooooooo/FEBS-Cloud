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
    @TableName("report_system_dim")
    public class ReportSystemDim implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("code")
    private String code;

        @TableField("name")
    private String name;

            /**
            * 基础档案等系统基本信息
            */
        @TableField("sys_basic_data")
    private String sysBasicData;

        @TableField("datasource_type")
    private Integer datasourceType;

        @TableField("datasource_desc")
    private String datasourceDesc;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ts")
    private String ts;

        @TableField("ytenant_id")
    private String ytenantId;


}