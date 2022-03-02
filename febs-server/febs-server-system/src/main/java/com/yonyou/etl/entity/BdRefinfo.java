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
    @TableName("bd_refinfo")
    public class BdRefinfo implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("indexno")
    private Integer indexno;

        @TableField("isCheckListEnabled")
    private Boolean ischecklistenabled;

        @TableField("isMultiSelectedEnabled")
    private Boolean ismultiselectedenabled;

        @TableField("isNotLeafSelected")
    private Boolean isnotleafselected;

        @TableField("isReturnCode")
    private Boolean isreturncode;

        @TableField("isUseDataPower")
    private Boolean isusedatapower;

        @TableField("isdefault")
    private Boolean isdefault;

        @TableField("pk_entity")
    private String pkEntity;

        @TableField("refCodeNamePK")
    private String refcodenamepk;

        @TableField("refclassname")
    private String refclassname;

        @TableField("refname")
    private String refname;

        @TableField("strFieldCode")
    private String strfieldcode;

        @TableField("strFieldName")
    private String strfieldname;

        @TableField("strHiddenFieldCode")
    private String strhiddenfieldcode;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}