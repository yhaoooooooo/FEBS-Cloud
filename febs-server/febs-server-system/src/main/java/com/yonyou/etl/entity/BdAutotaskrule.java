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
    @TableName("bd_autotaskrule")
    public class BdAutotaskrule implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("rule")
    private String rule;

        @TableField("rulecode")
    private String rulecode;

        @TableField("rulename")
    private String rulename;

        @TableField("rulesort")
    private Integer rulesort;

        @TableField("autosubtask")
    private String autosubtask;

        @TableField("email")
    private Boolean email;

        @TableField("message")
    private Boolean message;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("rulename2")
    private String rulename2;

        @TableField("rulename3")
    private String rulename3;

        @TableField("rulename4")
    private String rulename4;

        @TableField("rulename5")
    private String rulename5;

        @TableField("rulename6")
    private String rulename6;

        @TableField("ytenant_id")
    private String ytenantId;


}