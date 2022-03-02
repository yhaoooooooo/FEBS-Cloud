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
    @TableName("coa_senderdetail_scope")
    public class CoaSenderdetailScope implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("senderid")
    private String senderid;

        @TableField("costcenter_group")
    private String costcenterGroup;

        @TableField("costcenterGroupDoctype")
    private String costcentergroupdoctype;

        @TableField("costobjectvalue")
    private String costobjectvalue;

        @TableField("value")
    private String value;

        @TableField("start")
    private String start;

        @TableField("end")
    private String end;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("ytenant_id")
    private String ytenantId;


}