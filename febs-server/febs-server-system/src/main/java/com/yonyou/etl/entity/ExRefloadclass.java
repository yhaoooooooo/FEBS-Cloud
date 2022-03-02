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
    @TableName("ex_refloadclass")
    public class ExRefloadclass implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("refloadkey")
    private String refloadkey;

        @TableField("refloadclass")
    private String refloadclass;

        @TableField("refdata")
    private String refdata;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("id")
    private String id;

        @TableField("ytenant_id")
    private String ytenantId;


}