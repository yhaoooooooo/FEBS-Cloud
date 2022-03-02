package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* 会计平台开关配置表
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("ex_switch_config")
    public class ExSwitchConfig implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 开关标识code
            */
        @TableField("code")
    private String code;

            /**
            * 开关状态 0-关闭 1-开启
            */
        @TableField("status")
    private Integer status;

            /**
            * 创建时间
            */
        @TableField("create_time")
    private LocalDateTime createTime;

            /**
            * 修改时间 初始值与创建时间一致
            */
        @TableField("update_time")
    private LocalDateTime updateTime;

            /**
            * 备注|描述
            */
        @TableField("remark")
    private String remark;

        @TableField("ytenant_id")
    private String ytenantId;


}