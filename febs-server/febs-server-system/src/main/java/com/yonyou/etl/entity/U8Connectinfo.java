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
    @TableName("u8_connectinfo")
    public class U8Connectinfo implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("app_key")
    private String appKey;

        @TableField("app_secret")
    private String appSecret;

        @TableField("appid")
    private String appid;

        @TableField("baseurl")
    private String baseurl;

        @TableField("ds_sequence")
    private String dsSequence;

        @TableField("from_account")
    private String fromAccount;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("to_account")
    private String toAccount;

        @TableField("ytenant_id")
    private String ytenantId;


}