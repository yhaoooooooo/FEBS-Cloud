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
    @TableName("wb_user_layoutperf")
    public class WbUserLayoutperf implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("userid")
    private String userid;

        @TableField("roleid")
    private String roleid;

        @TableField("viewid")
    private String viewid;

        @TableField("createtime")
    private LocalDateTime createtime;

            /**
            * 是否默认布局Y是N否
            */
        @TableField("defaultview")
    private String defaultview;

        @TableField("rolelayoutrefid")
    private String rolelayoutrefid;

        @TableField("tenant_id")
    private String tenantId;

        @TableField("ytenant_id")
    private String ytenantId;


}