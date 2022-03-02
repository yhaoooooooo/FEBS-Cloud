package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Blob;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("coa_senderasscon")
    public class CoaSenderasscon implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("auxiliary")
    private String auxiliary;

        @TableField("contype")
    private String contype;

        @TableField("assignasoa")
    private String assignasoa;

        @TableField("conditionarr")
    private Blob conditionarr;

        @TableField("rownumber")
    private Integer rownumber;

        @TableField("costcenterstart")
    private String costcenterstart;

        @TableField("costcenterend")
    private String costcenterend;

        @TableField("costcentergroup")
    private String costcentergroup;

        @TableField("costelementstart")
    private String costelementstart;

        @TableField("costelementend")
    private String costelementend;

        @TableField("costelementgroup")
    private String costelementgroup;

        @TableField("elementscopestart")
    private String elementscopestart;

        @TableField("elementscopeend")
    private String elementscopeend;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("cosendruleid")
    private String cosendruleid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("ytenant_id")
    private String ytenantId;


}