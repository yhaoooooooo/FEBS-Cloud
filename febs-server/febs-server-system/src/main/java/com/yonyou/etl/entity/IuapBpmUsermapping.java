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
    @TableName("iuap_bpm_usermapping")
    public class IuapBpmUsermapping implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("bpm_user_code")
    private String bpmUserCode;

        @TableField("bpm_user_id")
    private String bpmUserId;

        @TableField("create_time")
    private String createTime;

        @TableField("sys_id")
    private String sysId;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("user_code")
    private String userCode;

        @TableField("user_id")
    private String userId;

        @TableField("ytenant_id")
    private String ytenantId;


}