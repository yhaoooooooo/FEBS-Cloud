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
    @TableName("ia_seqvo")
    public class IaSeqvo implements Serializable {

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
            * 入库最小时间戳
            */
        @TableField("inminseq")
    private String inminseq;

            /**
            * 出库最小时间戳
            */
        @TableField("outminseq")
    private String outminseq;

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