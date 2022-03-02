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
    @TableName("coa_msg")
    public class CoaMsg implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("msgid")
    private String msgid;

        @TableField("controlscope")
    private String controlscope;

        @TableField("message")
    private String message;

        @TableField("allocplan")
    private String allocplan;

        @TableField("period")
    private String period;

        @TableField("ts")
    private String ts;

        @TableField("modifytime")
    private String modifytime;

            /**
            * 未发送，确认成功
            */
        @TableField("status")
    private String status;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("dataStartTime")
    private String datastarttime;

        @TableField("dataEndTime")
    private String dataendtime;

        @TableField("ytenant_id")
    private String ytenantId;


}