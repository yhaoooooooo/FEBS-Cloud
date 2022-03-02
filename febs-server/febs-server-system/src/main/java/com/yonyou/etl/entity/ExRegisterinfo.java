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
    @TableName("ex_registerinfo")
    public class ExRegisterinfo implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("actioncode")
    private String actioncode;

        @TableField("adeptclass")
    private String adeptclass;

        @TableField("billtypecode")
    private String billtypecode;

        @TableField("reportchannel")
    private String reportchannel;

        @TableField("rservicepath")
    private String rservicepath;

        @TableField("sendchannel")
    private String sendchannel;

        @TableField("servicepath")
    private String servicepath;

        @TableField("systemcode")
    private String systemcode;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}