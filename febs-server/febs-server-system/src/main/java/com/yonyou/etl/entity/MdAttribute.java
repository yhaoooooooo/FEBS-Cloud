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
 * @author yhao
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("md_attribute")
public class MdAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableField("assemblyType")
    private Integer assemblytype;

    @TableField("columnName")
    private String columnname;

    @TableField("dataType")
    private Integer datatype;

    @TableField("dataTypeInfo")
    private String datatypeinfo;

    @TableField("defaultvalue")
    private String defaultvalue;

    @TableField("displayName")
    private String displayname;

    @TableField("displayName2")
    private String displayname2;

    @TableField("displayName3")
    private String displayname3;

    @TableField("displayName4")
    private String displayname4;

    @TableField("displayName5")
    private String displayname5;

    @TableField("displayName6")
    private String displayname6;

    @TableField("hidden")
    private Boolean hidden;

    @TableField("isExtend")
    private Boolean isextend;

    @TableField("isSyncDB")
    private Boolean issyncdb;

    @TableField("maxLength")
    private Integer maxlength;

    @TableField("nullable")
    private Boolean nullable;

    @TableField("numberDigit")
    private Integer numberdigit;

    @TableField("propertyName")
    private String propertyname;

    @TableField("refEntity")
    private String refentity;

    @TableField("refEntityCode")
    private String refentitycode;

    @TableField("tableName")
    private String tablename;

    @TableField("ownerEntity")
    private String ownerentity;

    @TableField("enumCode")
    private String enumcode;

    @TableField("rowno")
    private Integer rowno;

    @TableField("unionKey")
    private Boolean unionkey;

    @TableField("tenantid")
    private String tenantid;

    @TableField("srctplid")
    private String srctplid;

    @TableField("ytenant_id")
    private String ytenantId;


    private boolean refEntityCodeCorrectly;
}