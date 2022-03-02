package com.yonyou.etl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
* 
*
* @author yhao
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("fi_check_result")
    public class FiCheckResult implements Serializable {

private static final long serialVersionUID = 1L;

            /**
            * 主键
            */
            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 对账结果
            */
        @TableField("reconciliationresult")
    private String reconciliationresult;

            /**
            * 对账规则id
            */
        @TableField("ruleid")
    private String ruleid;

            /**
            * 核算账簿
            */
        @TableField("accbook")
    private String accbook;

            /**
            * 会计主体
            */
        @TableField("accbody")
    private String accbody;

            /**
            * 分组编码
            */
        @TableField("groupcode")
    private String groupcode;

            /**
            * 对账科目
            */
        @TableField("accsubject")
    private String accsubject;

            /**
            * 余额方向
            */
        @TableField("direction")
    private String direction;

            /**
            * 对账维度
            */
        @TableField("checkdimension")
    private String checkdimension;

            /**
            * 辅助核算
            */
        @TableField("checkauxiliary")
    private String checkauxiliary;

            /**
            * 业务系统
            */
        @TableField("businesssystem")
    private String businesssystem;

            /**
            * 对账币种
            */
        @TableField("checkcurrency")
    private String checkcurrency;

            /**
            * 起始对账日期
            */
        @TableField("startperiod")
    private String startperiod;

            /**
            * 终止对账日期
            */
        @TableField("endperiod")
    private String endperiod;

            /**
            * 事项类型
            */
        @TableField("mattertype")
    private String mattertype;

            /**
            * 交易类型
            */
        @TableField("transactiontype")
    private String transactiontype;

            /**
            * 贷方_业务_本币
            */
        @TableField("localcreditbusiness")
    private BigDecimal localcreditbusiness;

            /**
            * 贷方_业务_原币
            */
        @TableField("originalcreditbusiness")
    private BigDecimal originalcreditbusiness;

            /**
            * 贷方_总账_本币
            */
        @TableField("localcreditledger")
    private BigDecimal localcreditledger;

            /**
            * 贷方_总账_原币
            */
        @TableField("originalcreditledger")
    private BigDecimal originalcreditledger;

            /**
            * 借方_总账_原币
            */
        @TableField("originaldebitledger")
    private BigDecimal originaldebitledger;

            /**
            * 借方_业务_原币
            */
        @TableField("originaldebitbusiness")
    private BigDecimal originaldebitbusiness;

            /**
            * 借方_业务_本币
            */
        @TableField("localdebitbusiness")
    private BigDecimal localdebitbusiness;

            /**
            * 借方_总账_本币
            */
        @TableField("localdebitledger")
    private BigDecimal localdebitledger;

            /**
            * 是否包含未记账  Y:包含，N：不包含,默认N
            */
        @TableField("tally")
    private String tally;

            /**
            * 是否包含临时凭证，Y:包含，N：不包含,默认N
            */
        @TableField("tempvoucher")
    private String tempvoucher;

            /**
            * 对账时间
            */
        @TableField("checktime")
    private String checktime;

            /**
            * 操作人
            */
        @TableField("operator")
    private String operator;

            /**
            * 创建人
            */
        @TableField("creator")
    private String creator;

            /**
            * 创建时间
            */
        @TableField("creationtime")
    private String creationtime;

            /**
            * 修改人
            */
        @TableField("modifier")
    private String modifier;

            /**
            * 修改时间
            */
        @TableField("modifiedtime")
    private String modifiedtime;

            /**
            * 组织
            */
        @TableField("pk_org")
    private String pkOrg;

            /**
            * 集团
            */
        @TableField("pk_group")
    private String pkGroup;

            /**
            * 备注
            */
        @TableField("description")
    private String description;

            /**
            * 系统时间戳
            */
        @TableField("ts")
    private String ts;

        @TableField("dr")
    private Integer dr;

        @TableField("srctplid")
    private String srctplid;

        @TableField("reconciliationresult2")
    private String reconciliationresult2;

        @TableField("reconciliationresult3")
    private String reconciliationresult3;

        @TableField("reconciliationresult4")
    private String reconciliationresult4;

        @TableField("reconciliationresult5")
    private String reconciliationresult5;

        @TableField("reconciliationresult6")
    private String reconciliationresult6;

            /**
            * 租户id
            */
        @TableField("tenantid")
    private String tenantid;

        @TableField("ytenant_id")
    private String ytenantId;


}