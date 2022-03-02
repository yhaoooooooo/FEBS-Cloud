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
    @TableName("fi_accountlock")
    public class FiAccountlock implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("id")
    private String id;

            @TableId(value = "tenantid", type = IdType.UUID)
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("code")
    private String code;

        @TableField("ytenant_id")
    private String ytenantId;


}