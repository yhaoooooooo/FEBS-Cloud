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
    @TableName("sys_saas_dubboopt")
    public class SysSaasDubboopt implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("bizkey")
    private String bizkey;

        @TableField("bizstatus")
    private String bizstatus;

        @TableField("biztime")
    private String biztime;

        @TableField("biztype")
    private String biztype;

        @TableField("callid")
    private String callid;

        @TableField("classname")
    private String classname;

        @TableField("description")
    private String description;

        @TableField("dubbostatus")
    private String dubbostatus;

        @TableField("methodname")
    private String methodname;

        @TableField("params")
    private Blob params;

        @TableField("restatus")
    private String restatus;

        @TableField("result")
    private Blob result;

        @TableField("rollcount")
    private Integer rollcount;

        @TableField("rollmsg")
    private String rollmsg;

        @TableField("rollstatus")
    private String rollstatus;

        @TableField("tag")
    private String tag;

        @TableField("tenantid")
    private String tenantid;

        @TableField("ts")
    private Long ts;

        @TableField("usercode")
    private String usercode;

        @TableField("userid")
    private String userid;

        @TableField("isnotice")
    private Boolean isnotice;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}