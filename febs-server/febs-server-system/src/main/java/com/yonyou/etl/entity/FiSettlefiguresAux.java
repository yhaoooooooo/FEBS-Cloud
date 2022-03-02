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
    @TableName("fi_settlefigures_aux")
    public class FiSettlefiguresAux implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("accsubject")
    private String accsubject;

        @TableField("dimension")
    private String dimension;

        @TableField("vrs")
    private String vrs;

        @TableField("auxvalue")
    private String auxvalue;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("figures")
    private String figures;

        @TableField("accbook")
    private String accbook;

        @TableField("period")
    private String period;

        @TableField("ytenant_id")
    private String ytenantId;


}