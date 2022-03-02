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
    @TableName("ex_platsettings")
    public class ExPlatsettings implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("treekey")
    private String treekey;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("accbook")
    private String accbook;

        @TableField("glvoucher")
    private Boolean glvoucher;

        @TableField("respvoucher")
    private Boolean respvoucher;

        @TableField("costvoucher")
    private Boolean costvoucher;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}