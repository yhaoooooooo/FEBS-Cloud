package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("wb_company")
    public class WbCompany implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("code")
    private String code;

            /**
            * 1公司2部门
            */
        @TableField("name")
    private String name;

            /**
            * 1顶级公司2子公司
            */
        @TableField("level")
    private Integer level;

        @TableField("createtime")
    private LocalDateTime createtime;

        @TableField("parentid")
    private String parentid;

        @TableField("description")
    private String description;

        @TableField("isstoped")
    private String isstoped;

        @TableField("circleorder")
    private Integer circleorder;

        @TableField("stoptime")
    private String stoptime;

        @TableField("isasterisk")
    private String isasterisk;

        @TableField("isdepartment")
    private String isdepartment;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("ytenant_id")
    private String ytenantId;


}