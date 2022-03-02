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
    @TableName("ex_voucheroplogs")
    public class ExVoucheroplogs implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("srcsystem")
    private String srcsystem;

        @TableField("billtype")
    private String billtype;

        @TableField("billno")
    private String billno;

        @TableField("billid")
    private String billid;

        @TableField("action")
    private String action;

        @TableField("desSystem")
    private String dessystem;

        @TableField("desbillid")
    private String desbillid;

        @TableField("reqid")
    private String reqid;

        @TableField("ts")
    private String ts;

        @TableField("tenantid")
    private String tenantid;

        @TableField("ytenant_id")
    private String ytenantId;


}