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
    @TableName("ex_mappingentity")
    public class ExMappingentity implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("copyproperties")
    private Boolean copyproperties;

        @TableField("des_entityid")
    private String desEntityid;

        @TableField("des_path")
    private String desPath;

        @TableField("effector")
    private String effector;

        @TableField("mappingdefid")
    private String mappingdefid;

        @TableField("parentid")
    private String parentid;

        @TableField("rownumber")
    private Integer rownumber;

        @TableField("src_entityid")
    private String srcEntityid;

        @TableField("src_path")
    private String srcPath;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}