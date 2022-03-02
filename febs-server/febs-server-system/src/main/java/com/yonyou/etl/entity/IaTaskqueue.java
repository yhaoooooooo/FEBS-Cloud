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
    @TableName("ia_taskqueue")
    public class IaTaskqueue implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 账簿类型
            */
        @TableField("accbooktype")
    private Long accbooktype;

            /**
            * 会计主体
            */
        @TableField("accbody")
    private String accbody;

            /**
            * 成本域
            */
        @TableField("costreg")
    private Long costreg;

            /**
            * 成本对象
            */
        @TableField("costobject")
    private Long costobject;

            /**
            * 序列号
            */
        @TableField("sequenceno")
    private String sequenceno;

            /**
            * taskkey
            */
        @TableField("taskkey")
    private String taskkey;

            /**
            * 任务内容
            */
        @TableField("context")
    private String context;

            /**
            * tasktype
            */
        @TableField("tasktype")
    private String tasktype;

            /**
            * 出入类型
            */
        @TableField("inouttype")
    private String inouttype;

            /**
            * 是否已处理
            */
        @TableField("processed")
    private Boolean processed;

            /**
            * 处理结果
            */
        @TableField("result")
    private String result;

            /**
            * ID
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            /**
            * 时间戳
            */
        @TableField("pubts")
    private LocalDateTime pubts;

            /**
            * 租户
            */
        @TableField("tenant_id")
    private Long tenantId;

        @TableField("ytenant_id")
    private String ytenantId;


}