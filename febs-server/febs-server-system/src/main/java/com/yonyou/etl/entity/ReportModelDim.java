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
    @TableName("report_model_dim")
    public class ReportModelDim implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("code")
    private String code;

        @TableField("name")
    private String name;

        @TableField("name2")
    private String name2;

        @TableField("name3")
    private String name3;

        @TableField("name4")
    private String name4;

        @TableField("name5")
    private String name5;

        @TableField("name6")
    private String name6;

        @TableField("model_id")
    private String modelId;

        @TableField("dim_group")
    private Integer dimGroup;

        @TableField("dim_sys_type")
    private String dimSysType;

        @TableField("dim_sys_info")
    private String dimSysInfo;

        @TableField("sys_ref_type")
    private Integer sysRefType;

        @TableField("dim_type")
    private Integer dimType;

        @TableField("dim_data_type")
    private Integer dimDataType;

        @TableField("is_table_used")
    private Integer isTableUsed;

        @TableField("is_keydim")
    private Integer isKeydim;

        @TableField("dim_table_m")
    private String dimTableM;

        @TableField("dim_table_h")
    private String dimTableH;

        @TableField("dim_table")
    private String dimTable;

        @TableField("sec_class")
    private String secClass;

            /**
            * 0:服务方式，service_class注册		1：物理表方式
            */
        @TableField("datasource_type")
    private Integer datasourceType;

        @TableField("service_class")
    private String serviceClass;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("dim_id")
    private String dimId;

        @TableField("srctplid")
    private String srctplid;

        @TableField("is_indexdim")
    private Integer isIndexdim;

        @TableField("shortcode")
    private String shortcode;

        @TableField("sort")
    private Integer sort;

        @TableField("is_auxidim")
    private Integer isAuxidim;

        @TableField("is_hidden")
    private Integer isHidden;

        @TableField("data_type")
    private Integer dataType;

        @TableField("query_default")
    private String queryDefault;

        @TableField("fill_default")
    private String fillDefault;

        @TableField("ytenant_id")
    private String ytenantId;


}