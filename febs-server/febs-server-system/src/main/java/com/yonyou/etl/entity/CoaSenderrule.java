package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("coa_senderrule")
    public class CoaSenderrule implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("allocrule")
    private String allocrule;

        @TableField("func")
    private String func;

        @TableField("direction")
    private String direction;

        @TableField("rate")
    private BigDecimal rate;

        @TableField("auxiliarys")
    private Blob auxiliarys;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("ruletype")
    private String ruletype;

        @TableField("mount")
    private BigDecimal mount;

        @TableField("ytenant_id")
    private String ytenantId;


}