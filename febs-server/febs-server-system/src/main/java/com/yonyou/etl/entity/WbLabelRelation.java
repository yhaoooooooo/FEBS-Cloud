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
    @TableName("wb_label_relation")
    public class WbLabelRelation implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("labelcode")
    private String labelcode;

        @TableField("sourcecode")
    private String sourcecode;

        @TableField("create_date")
    private LocalDateTime createDate;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("system")
    private String system;

        @TableField("lableid")
    private String lableid;

        @TableField("sourceid")
    private String sourceid;

            /**
            * 类型，小应用，widget。。。
            */
        @TableField("type")
    private String type;

        @TableField("ytenant_id")
    private String ytenantId;


}