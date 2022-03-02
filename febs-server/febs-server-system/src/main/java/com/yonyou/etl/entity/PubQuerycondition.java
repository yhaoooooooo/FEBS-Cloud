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
    @TableName("pub_querycondition")
    public class PubQuerycondition implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("componenttype")
    private String componenttype;

        @TableField("datatype")
    private Integer datatype;

        @TableField("default_value")
    private String defaultValue;

        @TableField("digit")
    private Integer digit;

        @TableField("disp_sequence")
    private Integer dispSequence;

        @TableField("field_code")
    private String fieldCode;

        @TableField("field_name")
    private String fieldName;

        @TableField("name2")
    private String name2;

        @TableField("name3")
    private String name3;

        @TableField("name4")
    private String name4;

        @TableField("name5")
    private String name5;

        @TableField("name6")
    private String name6;

        @TableField("opera_code")
    private String operaCode;

        @TableField("opera_name")
    private String operaName;

        @TableField("opera_name2")
    private String operaName2;

        @TableField("opera_name3")
    private String operaName3;

        @TableField("opera_name4")
    private String operaName4;

        @TableField("opera_name5")
    private String operaName5;

        @TableField("opera_name6")
    private String operaName6;

        @TableField("refEntityCode")
    private String refentitycode;

        @TableField("templetId")
    private String templetid;

        @TableField("ismust")
    private Boolean ismust;

        @TableField("isshow")
    private Boolean isshow;

        @TableField("LENGTH")
    private Integer length;

        @TableField("groupinfo")
    private String groupinfo;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}