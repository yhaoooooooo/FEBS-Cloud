package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
    @TableName("fi_voucher_oplog")
    public class FiVoucherOplog implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("id")
    private String id;

        @TableField("reqid")
    private String reqid;

        @TableField("billid")
    private String billid;

        @TableField("voucherid")
    private String voucherid;

        @TableField("vo")
    private String vo;

        @TableField("action")
    private String action;

        @TableField("param")
    private String param;

        @TableField("ts")
    private String ts;

        @TableField("MESSAGE")
    private String message;


}