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
    @TableName("ex_outpropertydef")
    public class ExOutpropertydef implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("assemblytype")
    private String assemblytype;

        @TableField("datatype")
    private Integer datatype;

        @TableField("outeridentifier")
    private String outeridentifier;

        @TableField("propertycode")
    private String propertycode;

        @TableField("propertyname")
    private String propertyname;

        @TableField("refouterentity")
    private String refouterentity;

        @TableField("rownumber")
    private Integer rownumber;

        @TableField("outerentityid")
    private String outerentityid;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}