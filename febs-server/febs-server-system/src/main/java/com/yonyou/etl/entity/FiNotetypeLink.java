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
    @TableName("fi_notetype_link")
    public class FiNotetypeLink implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("creationtime")
    private String creationtime;

        @TableField("noteid")
    private String noteid;

        @TableField("notetype")
    private String notetype;

        @TableField("targetid")
    private String targetid;

        @TableField("targettype")
    private String targettype;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}