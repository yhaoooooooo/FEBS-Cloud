package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("bd_con_relation")
    public class BdConRelation implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("convertstatus")
    private String convertstatus;

        @TableField("converttime")
    private String converttime;

        @TableField("accbookconvertplan")
    private String accbookconvertplan;

        @TableField("sourcevoucher")
    private String sourcevoucher;

        @TableField("aimvoucher")
    private String aimvoucher;

        @TableField("executeresult")
    private String executeresult;

        @TableField("creator")
    private String creator;

        @TableField("creationtime")
    private LocalDate creationtime;

        @TableField("modifier")
    private String modifier;

        @TableField("modifiedtime")
    private LocalDateTime modifiedtime;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("description")
    private String description;

        @TableField("ts")
    private LocalDate ts;

        @TableField("dr")
    private Integer dr;

        @TableField("state")
    private Integer state;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("aimaccbook")
    private String aimaccbook;

        @TableField("ytenant_id")
    private String ytenantId;


}