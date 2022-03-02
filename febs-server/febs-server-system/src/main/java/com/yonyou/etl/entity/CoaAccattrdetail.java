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
    @TableName("coa_accattrdetail")
    public class CoaAccattrdetail implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("accattr")
    private String accattr;

        @TableField("hasnumber")
    private Boolean hasnumber;

        @TableField("valuetype")
    private String valuetype;

        @TableField("assignasoa")
    private String assignasoa;

        @TableField("rownumber")
    private Integer rownumber;

        @TableField("conditionArr")
    private Blob conditionarr;

        @TableField("orderstart")
    private String orderstart;

        @TableField("orderend")
    private String orderend;

        @TableField("ordergroup")
    private String ordergroup;

        @TableField("costcenterstart")
    private String costcenterstart;

        @TableField("costcenterend")
    private String costcenterend;

        @TableField("costcentergroup")
    private String costcentergroup;

        @TableField("elementscopestart")
    private String elementscopestart;

        @TableField("elementscopeend")
    private String elementscopeend;

        @TableField("costelementtype")
    private String costelementtype;

        @TableField("costelement")
    private String costelement;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("dynreceiveruleid")
    private String dynreceiveruleid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("ytenant_id")
    private String ytenantId;


}