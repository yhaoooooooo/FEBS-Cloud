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
    @TableName("pub_refcfg")
    public class PubRefcfg implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("funcode")
    private String funcode;

        @TableField("refcode")
    private String refcode;

        @TableField("refloadkey")
    private String refloadkey;

        @TableField("orderby")
    private String orderby;

        @TableField("enablecontrol")
    private Boolean enablecontrol;

        @TableField("acscene")
    private String acscene;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("convertcol")
    private String convertcol;

        @TableField("mutilangs")
    private String mutilangs;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("enableauthid")
    private Boolean enableauthid;

        @TableField("ytenant_id")
    private String ytenantId;


}