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
    @TableName("bd_autotaskrole")
    public class BdAutotaskrole implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("role")
    private String role;

        @TableField("rolecode")
    private String rolecode;

        @TableField("rolename")
    private String rolename;

        @TableField("autosubtask")
    private String autosubtask;

        @TableField("taskrule")
    private String taskrule;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("rolename2")
    private String rolename2;

        @TableField("rolename3")
    private String rolename3;

        @TableField("rolename4")
    private String rolename4;

        @TableField("rolename5")
    private String rolename5;

        @TableField("rolename6")
    private String rolename6;

        @TableField("ytenant_id")
    private String ytenantId;


}