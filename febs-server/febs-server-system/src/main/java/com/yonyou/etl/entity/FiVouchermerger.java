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
    @TableName("fi_vouchermerger")
    public class FiVouchermerger implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("id")
    private String id;

        @TableField("billtype")
    private String billtype;

        @TableField("tradetype")
    private String tradetype;

        @TableField("plugin")
    private String plugin;

        @TableField("srcsystem")
    private String srcsystem;

        @TableField("sequence")
    private Integer sequence;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}