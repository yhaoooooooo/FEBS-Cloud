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
    @TableName("bd_autotasklog")
    public class BdAutotasklog implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("autotask")
    private String autotask;

        @TableField("autosubtask")
    private String autosubtask;

        @TableField("rule")
    private String rule;

        @TableField("rulecode")
    private String rulecode;

        @TableField("rulename")
    private String rulename;

        @TableField("starttime")
    private String starttime;

        @TableField("endtime")
    private String endtime;

        @TableField("status")
    private Boolean status;

        @TableField("description")
    private String description;

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

        @TableField("description2")
    private String description2;

        @TableField("description3")
    private String description3;

        @TableField("description4")
    private String description4;

        @TableField("description5")
    private String description5;

        @TableField("description6")
    private String description6;

        @TableField("ytenant_id")
    private String ytenantId;


}