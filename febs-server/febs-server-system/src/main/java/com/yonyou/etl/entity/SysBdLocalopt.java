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
    @TableName("sys_bd_localopt")
    public class SysBdLocalopt implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("bizkey")
    private String bizkey;

        @TableField("bizdesc")
    private String bizdesc;

        @TableField("bizresult")
    private Blob bizresult;

        @TableField("bizstatus")
    private String bizstatus;

        @TableField("biztime")
    private String biztime;

        @TableField("callid")
    private String callid;

        @TableField("dubbotx")
    private String dubbotx;

        @TableField("ts")
    private Long ts;

        @TableField("usercode")
    private String usercode;

        @TableField("userid")
    private String userid;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}