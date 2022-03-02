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

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("coa_accattrdetail_scope")
    public class CoaAccattrdetailScope implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("dynreceivescopeid")
    private String dynreceivescopeid;

        @TableField("costcentergroup")
    private String costcentergroup;

        @TableField("groupdoctype")
    private String groupdoctype;

        @TableField("costobjectvalue")
    private String costobjectvalue;

        @TableField("accentity")
    private String accentity;

        @TableField("value")
    private String value;

        @TableField("start")
    private String start;

        @TableField("end")
    private String end;

        @TableField("number")
    private BigDecimal number;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("ytenant_id")
    private String ytenantId;


}