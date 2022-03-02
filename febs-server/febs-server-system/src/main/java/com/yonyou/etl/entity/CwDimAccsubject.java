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
* 科目档案表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("cw_dim_accsubject")
    public class CwDimAccsubject implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * ID
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 租户ID
            */
        @TableField("tenantid")
    private String tenantid;

            /**
            * 账簿ID
            */
        @TableField("accbook_id")
    private String accbookId;

            /**
            * 账簿编码
            */
        @TableField("accbook_code")
    private String accbookCode;

            /**
            * 账簿名称
            */
        @TableField("accbook_name")
    private String accbookName;

            /**
            * 科目ID
            */
        @TableField("accsubject_id")
    private String accsubjectId;

            /**
            * 科目编码
            */
        @TableField("accsubject_code")
    private String accsubjectCode;

            /**
            * 科目名称
            */
        @TableField("accsubject_name")
    private String accsubjectName;

            /**
            * 上级科目ID
            */
        @TableField("accsubject_pid")
    private String accsubjectPid;

        @TableField("ytenant_id")
    private String ytenantId;


}