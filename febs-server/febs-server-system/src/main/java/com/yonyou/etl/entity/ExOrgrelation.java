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
    @TableName("ex_orgrelation")
    public class ExOrgrelation implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("src_system")
    private String srcSystem;

        @TableField("src_billtype")
    private String srcBilltype;

        @TableField("src_tradetype")
    private String srcTradetype;

        @TableField("relationattr1")
    private String relationattr1;

        @TableField("relationattr2")
    private String relationattr2;

        @TableField("relationattr3")
    private String relationattr3;

        @TableField("relationattr4")
    private String relationattr4;

        @TableField("relationattr5")
    private String relationattr5;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}