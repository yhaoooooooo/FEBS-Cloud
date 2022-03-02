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
    @TableName("coa_singleresult")
    public class CoaSingleresult implements Serializable {

private static final long serialVersionUID = 1L;

        @TableField("allocplan")
    private String allocplan;

        @TableField("dynfactor")
    private String dynfactor;

            /**
            * 动因值
            */
        @TableField("dynfactorrate")
    private String dynfactorrate;

        @TableField("accentity")
    private String accentity;

        @TableField("accbook")
    private String accbook;

            /**
            * 凭证号
            */
        @TableField("billcode")
    private String billcode;

            /**
            * 凭证类型
            */
        @TableField("vouchertype")
    private String vouchertype;

            /**
            * 业务日期
            */
        @TableField("busidate")
    private String busidate;

            /**
            * 制单日期
            */
        @TableField("maketime")
    private String maketime;

            /**
            * 制单人
            */
        @TableField("maker")
    private String maker;

            /**
            * 来源系统
            */
        @TableField("srcsystem")
    private String srcsystem;

            /**
            * 分录行号
            */
        @TableField("recordnumber")
    private String recordnumber;

            /**
            * 来源分录行id
            */
        @TableField("recordid")
    private String recordid;

        @TableField("refid")
    private String refid;

            /**
            * 凭证主键
            */
        @TableField("voucherid")
    private String voucherid;

            /**
            * 描述
            */
        @TableField("description")
    private String description;

        @TableField("allocrule")
    private String allocrule;

            /**
            * 年
            */
        @TableField("syear")
    private String syear;

            /**
            * 会计期间
            */
        @TableField("period")
    private String period;

        @TableField("accsubject")
    private String accsubject;

        @TableField("costcenter")
    private String costcenter;

            /**
            * 关联辅助核算id
            */
        @TableField("auxiliary")
    private String auxiliary;

            /**
            * 方向
            */
        @TableField("direct")
    private String direct;

            /**
            * 批次号
            */
        @TableField("batchno")
    private String batchno;

            /**
            * 管控范围币种
            */
        @TableField("currency_controlscope")
    private String currencyControlscope;

            /**
            * 管控范围贷方金额
            */
        @TableField("credit_controlscope")
    private String creditControlscope;

            /**
            * 管控范围借方金额
            */
        @TableField("debit_controlscope")
    private String debitControlscope;

            /**
            * 账簿币种
            */
        @TableField("currency_org")
    private String currencyOrg;

            /**
            * 借方本币金额（账簿币种）
            */
        @TableField("debit_org")
    private String debitOrg;

            /**
            * 贷方本币金额(账簿币种)
            */
        @TableField("credit_org")
    private String creditOrg;

            /**
            * 原币币种
            */
        @TableField("currency")
    private String currency;

            /**
            * 贷方原币金额
            */
        @TableField("credit_original")
    private String creditOriginal;

            /**
            * 借方原币金额
            */
        @TableField("debit_original")
    private String debitOriginal;

            /**
            * 版本
            */
        @TableField("maversion")
    private String maversion;

        @TableField("controlscope")
    private String controlscope;

            /**
            * 账簿汇率类型
            */
        @TableField("ratetype")
    private String ratetype;

            /**
            * 账簿汇率
            */
        @TableField("rate_org")
    private String rateOrg;

            /**
            * 管控范围汇率类型
            */
        @TableField("ratetype_controlscope")
    private String ratetypeControlscope;

            /**
            * 管控范围汇率
            */
        @TableField("rate_controlscope")
    private String rateControlscope;

            /**
            * 业务日期（汇率日期)
            */
        @TableField("rate_date")
    private String rateDate;

            /**
            * 贷方数量
            */
        @TableField("credit_quantity")
    private String creditQuantity;

            /**
            * 借方数量
            */
        @TableField("debit_quantity")
    private String debitQuantity;

        @TableField("opp_pk_org")
    private String oppPkOrg;

        @TableField("opp_costcenter")
    private String oppCostcenter;

        @TableField("opp_accsubject")
    private String oppAccsubject;

            /**
            * 线索的原币
            */
        @TableField("opp_currencyoringal")
    private String oppCurrencyoringal;

            /**
            * 线索原币金额
            */
        @TableField("opp_moneyoringal")
    private String oppMoneyoringal;

            /**
            * 线索的账簿本币
            */
        @TableField("opp_currencyorg")
    private String oppCurrencyorg;

            /**
            * 线索的账簿金额
            */
        @TableField("opp_moneyorg")
    private String oppMoneyorg;

            /**
            * 线索管控范围币
            */
        @TableField("opp_currencycontrolscope")
    private String oppCurrencycontrolscope;

            /**
            * 线索管控范围金额
            */
        @TableField("opp_moneycontrolscope")
    private String oppMoneycontrolscope;

            /**
            * 线索的辅助核算信息
            */
        @TableField("opp_auxInfo")
    private String oppAuxinfo;

        @TableField("vr1")
    private String vr1;

        @TableField("vr2")
    private String vr2;

        @TableField("vr3")
    private String vr3;

        @TableField("vr4")
    private String vr4;

        @TableField("vr5")
    private String vr5;

        @TableField("vr6")
    private String vr6;

        @TableField("vr7")
    private String vr7;

        @TableField("vr8")
    private String vr8;

        @TableField("vr9")
    private String vr9;

        @TableField("vr10")
    private String vr10;

        @TableField("vr11")
    private String vr11;

        @TableField("vr12")
    private String vr12;

        @TableField("vr13")
    private String vr13;

        @TableField("vr14")
    private String vr14;

        @TableField("vr15")
    private String vr15;

        @TableField("vr16")
    private String vr16;

        @TableField("vr17")
    private String vr17;

        @TableField("vr18")
    private String vr18;

        @TableField("vr19")
    private String vr19;

        @TableField("vr20")
    private String vr20;

        @TableField("vr21")
    private String vr21;

        @TableField("vr22")
    private String vr22;

        @TableField("vr23")
    private String vr23;

        @TableField("vr24")
    private String vr24;

        @TableField("vr25")
    private String vr25;

        @TableField("vr26")
    private String vr26;

        @TableField("vr27")
    private String vr27;

        @TableField("vr28")
    private String vr28;

        @TableField("vr29")
    private String vr29;

        @TableField("vr30")
    private String vr30;

        @TableField("vr31")
    private String vr31;

        @TableField("vr32")
    private String vr32;

        @TableField("vr33")
    private String vr33;

        @TableField("vr34")
    private String vr34;

        @TableField("vr35")
    private String vr35;

        @TableField("vr36")
    private String vr36;

        @TableField("vr37")
    private String vr37;

        @TableField("vr38")
    private String vr38;

        @TableField("vr39")
    private String vr39;

        @TableField("vr40")
    private String vr40;

        @TableField("vr41")
    private String vr41;

        @TableField("vr42")
    private String vr42;

        @TableField("vr43")
    private String vr43;

        @TableField("vr44")
    private String vr44;

        @TableField("vr45")
    private String vr45;

        @TableField("vr46")
    private String vr46;

        @TableField("vr47")
    private String vr47;

        @TableField("vr48")
    private String vr48;

        @TableField("vr49")
    private String vr49;

        @TableField("vr50")
    private String vr50;

        @TableField("vr51")
    private String vr51;

        @TableField("vr52")
    private String vr52;

        @TableField("vr53")
    private String vr53;

        @TableField("vr54")
    private String vr54;

        @TableField("vr55")
    private String vr55;

        @TableField("vr56")
    private String vr56;

        @TableField("vr57")
    private String vr57;

        @TableField("vr58")
    private String vr58;

        @TableField("vr59")
    private String vr59;

        @TableField("vr60")
    private String vr60;

        @TableField("vr61")
    private String vr61;

        @TableField("vr62")
    private String vr62;

        @TableField("vr63")
    private String vr63;

        @TableField("vr64")
    private String vr64;

        @TableField("vr65")
    private String vr65;

        @TableField("vr66")
    private String vr66;

        @TableField("vr67")
    private String vr67;

        @TableField("vr68")
    private String vr68;

        @TableField("vr69")
    private String vr69;

        @TableField("vr70")
    private String vr70;

        @TableField("vr71")
    private String vr71;

        @TableField("vr72")
    private String vr72;

        @TableField("vr73")
    private String vr73;

        @TableField("vr74")
    private String vr74;

        @TableField("vr75")
    private String vr75;

        @TableField("vr76")
    private String vr76;

        @TableField("vr77")
    private String vr77;

        @TableField("vr78")
    private String vr78;

        @TableField("vr79")
    private String vr79;

        @TableField("vr80")
    private String vr80;

        @TableField("vr81")
    private String vr81;

        @TableField("vr82")
    private String vr82;

        @TableField("vr83")
    private String vr83;

        @TableField("vr84")
    private String vr84;

        @TableField("vr85")
    private String vr85;

        @TableField("vr86")
    private String vr86;

        @TableField("vr87")
    private String vr87;

        @TableField("vr88")
    private String vr88;

        @TableField("vr89")
    private String vr89;

        @TableField("vr90")
    private String vr90;

        @TableField("vr91")
    private String vr91;

        @TableField("vr92")
    private String vr92;

        @TableField("vr93")
    private String vr93;

        @TableField("vr94")
    private String vr94;

        @TableField("vr95")
    private String vr95;

        @TableField("vr96")
    private String vr96;

        @TableField("vr97")
    private String vr97;

        @TableField("vr98")
    private String vr98;

        @TableField("vr99")
    private String vr99;

        @TableField("vr100")
    private String vr100;

            /**
            * 租户
            */
        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 是否被审核
            */
        @TableField("ischeck")
    private Integer ischeck;

        @TableField("ytenant_id")
    private String ytenantId;


}