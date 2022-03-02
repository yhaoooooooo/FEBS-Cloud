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
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("wb_message_type")
    public class WbMessageType implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 主键
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 类型
            */
        @TableField("type")
    private String type;

            /**
            * 名称
            */
        @TableField("name")
    private String name;

            /**
            * 来源
            */
        @TableField("from")
    private String from;

            /**
            * 创建时间
            */
        @TableField("create_time")
    private LocalDateTime createTime;


}