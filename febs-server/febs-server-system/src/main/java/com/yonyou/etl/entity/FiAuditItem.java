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
    @TableName("fi_audit_item")
    public class FiAuditItem implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("modulecode")
    private String modulecode;

        @TableField("modulename")
    private String modulename;

        @TableField("doctypecode")
    private String doctypecode;

        @TableField("doctypename")
    private String doctypename;

        @TableField("classname")
    private String classname;

        @TableField("classify")
    private String classify;

        @TableField("priority")
    private Integer priority;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("url")
    private String url;

        @TableField("ytenant_id")
    private String ytenantId;


}