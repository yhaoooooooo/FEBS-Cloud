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
    @TableName("coa_moduleplan")
    public class CoaModuleplan implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 查询方案名称
            */
        @TableField("name")
    private String name;

            /**
            * 是否是默认方案
            */
        @TableField("isdefault")
    private Integer isdefault;

            /**
            * 方案编码
            */
        @TableField("code")
    private String code;

            /**
            * 模块编码
            */
        @TableField("modulecode")
    private String modulecode;

            /**
            * 租户
            */
        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("ytenant_id")
    private String ytenantId;


}