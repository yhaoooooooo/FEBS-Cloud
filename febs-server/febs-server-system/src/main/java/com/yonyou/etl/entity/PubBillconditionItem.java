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
    @TableName("pub_billcondition_item")
    public class PubBillconditionItem implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("code")
    private String code;

        @TableField("conditionshow")
    private String conditionshow;

        @TableField("datatype")
    private Integer datatype;

        @TableField("defaultvalue")
    private String defaultvalue;

        @TableField("field")
    private String field;

        @TableField("lable")
    private String lable;

        @TableField("operator")
    private String operator;

        @TableField("parenttable")
    private String parenttable;

        @TableField("reftype")
    private String reftype;

        @TableField("showorder")
    private Integer showorder;

        @TableField("showformat")
    private String showformat;

        @TableField("optvalue")
    private String optvalue;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}