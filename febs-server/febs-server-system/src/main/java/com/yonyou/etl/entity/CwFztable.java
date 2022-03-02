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
    @TableName("cw_fztable")
    public class CwFztable implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * ID
            */
            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 辅助成员pk
            */
        @TableField("fz_pk")
    private String fzPk;

            /**
            * 辅助成员code
            */
        @TableField("fz_code")
    private String fzCode;

            /**
            * 辅助成员name
            */
        @TableField("fz_name")
    private String fzName;

        @TableField("tenantid")
    private String tenantid;

        @TableField("ytenant_id")
    private String ytenantId;


}