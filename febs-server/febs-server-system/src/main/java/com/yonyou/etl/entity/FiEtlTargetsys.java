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
    @TableName("fi_etl_targetsys")
    public class FiEtlTargetsys implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("code")
    private String code;

        @TableField("name")
    private String name;

        @TableField("url")
    private String url;

        @TableField("type")
    private String type;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("absoluteFlag")
    private Boolean absoluteflag;

        @TableField("billaction")
    private String billaction;

        @TableField("ytenant_id")
    private String ytenantId;


}