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
    @TableName("coa_branchvoucher")
    public class CoaBranchvoucher implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 关联的任务
            */
        @TableField("allocrule")
    private String allocrule;

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
            * 凭证号
            */
        @TableField("billcode")
    private String billcode;

        @TableField("busidate")
    private String busidate;

            /**
            * 分录行号
            */
        @TableField("recordnumber")
    private String recordnumber;

            /**
            * 科目
            */
        @TableField("accsubject")
    private String accsubject;

            /**
            * 成本中心
            */
        @TableField("costcenter")
    private String costcenter;

            /**
            * 总帐辅助核算关联id
            */
        @TableField("auxiliary")
    private String auxiliary;

            /**
            * 凭证类型
            */
        @TableField("vouchertype")
    private String vouchertype;

            /**
            * 计算状态
            */
        @TableField("compute_state")
    private String computeState;

        @TableField("sourcemodule")
    private String sourcemodule;

            /**
            * 审核状态
            */
        @TableField("check_state")
    private String checkState;

            /**
            * 会计期间
            */
        @TableField("period")
    private String period;

            /**
            * 会计主体
            */
        @TableField("accentity")
    private String accentity;

            /**
            * 账簿
            */
        @TableField("accbook")
    private String accbook;

            /**
            * 核算目的
            */
        @TableField("accpurposes")
    private String accpurposes;

            /**
            * 对应总帐凭证主键
            */
        @TableField("voucherid")
    private String voucherid;

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
            * 借方本币金额
            */
        @TableField("debit_org")
    private String debitOrg;

            /**
            * 贷方本币金额
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

            /**
            * 管控范围
            */
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

            /**
            * 辅助核算项1
            */
        @TableField("vr1")
    private String vr1;

            /**
            * 辅助核算项2
            */
        @TableField("vr2")
    private String vr2;

            /**
            * 辅助核算项3
            */
        @TableField("vr3")
    private String vr3;

            /**
            * 辅助核算项4
            */
        @TableField("vr4")
    private String vr4;

            /**
            * 辅助核算项5
            */
        @TableField("vr5")
    private String vr5;

            /**
            * 辅助核算项6
            */
        @TableField("vr6")
    private String vr6;

            /**
            * 辅助核算项7
            */
        @TableField("vr7")
    private String vr7;

            /**
            * 辅助核算项8
            */
        @TableField("vr8")
    private String vr8;

            /**
            * 辅助核算项9
            */
        @TableField("vr9")
    private String vr9;

            /**
            * 辅助核算项10
            */
        @TableField("vr10")
    private String vr10;

            /**
            * 辅助核算项11
            */
        @TableField("vr11")
    private String vr11;

            /**
            * 辅助核算项12
            */
        @TableField("vr12")
    private String vr12;

            /**
            * 辅助核算项13
            */
        @TableField("vr13")
    private String vr13;

            /**
            * 辅助核算项14
            */
        @TableField("vr14")
    private String vr14;

            /**
            * 辅助核算项15
            */
        @TableField("vr15")
    private String vr15;

            /**
            * 辅助核算项16
            */
        @TableField("vr16")
    private String vr16;

            /**
            * 辅助核算项17
            */
        @TableField("vr17")
    private String vr17;

            /**
            * 辅助核算项18
            */
        @TableField("vr18")
    private String vr18;

            /**
            * 辅助核算项19
            */
        @TableField("vr19")
    private String vr19;

            /**
            * 辅助核算项20
            */
        @TableField("vr20")
    private String vr20;

            /**
            * 辅助核算项21
            */
        @TableField("vr21")
    private String vr21;

            /**
            * 辅助核算项22
            */
        @TableField("vr22")
    private String vr22;

            /**
            * 辅助核算项23
            */
        @TableField("vr23")
    private String vr23;

            /**
            * 辅助核算项24
            */
        @TableField("vr24")
    private String vr24;

            /**
            * 辅助核算项25
            */
        @TableField("vr25")
    private String vr25;

            /**
            * 辅助核算项26
            */
        @TableField("vr26")
    private String vr26;

            /**
            * 辅助核算项27
            */
        @TableField("vr27")
    private String vr27;

            /**
            * 辅助核算项28
            */
        @TableField("vr28")
    private String vr28;

            /**
            * 辅助核算项29
            */
        @TableField("vr29")
    private String vr29;

            /**
            * 辅助核算项30
            */
        @TableField("vr30")
    private String vr30;

            /**
            * 辅助核算项31
            */
        @TableField("vr31")
    private String vr31;

            /**
            * 辅助核算项32
            */
        @TableField("vr32")
    private String vr32;

            /**
            * 辅助核算项33
            */
        @TableField("vr33")
    private String vr33;

            /**
            * 辅助核算项34
            */
        @TableField("vr34")
    private String vr34;

            /**
            * 辅助核算项35
            */
        @TableField("vr35")
    private String vr35;

            /**
            * 辅助核算项36
            */
        @TableField("vr36")
    private String vr36;

            /**
            * 辅助核算项37
            */
        @TableField("vr37")
    private String vr37;

            /**
            * 辅助核算项38
            */
        @TableField("vr38")
    private String vr38;

            /**
            * 辅助核算项39
            */
        @TableField("vr39")
    private String vr39;

            /**
            * 辅助核算项40
            */
        @TableField("vr40")
    private String vr40;

            /**
            * 辅助核算项41
            */
        @TableField("vr41")
    private String vr41;

            /**
            * 辅助核算项42
            */
        @TableField("vr42")
    private String vr42;

            /**
            * 辅助核算项43
            */
        @TableField("vr43")
    private String vr43;

            /**
            * 辅助核算项44
            */
        @TableField("vr44")
    private String vr44;

            /**
            * 辅助核算项45
            */
        @TableField("vr45")
    private String vr45;

            /**
            * 辅助核算项46
            */
        @TableField("vr46")
    private String vr46;

            /**
            * 辅助核算项47
            */
        @TableField("vr47")
    private String vr47;

            /**
            * 辅助核算项48
            */
        @TableField("vr48")
    private String vr48;

            /**
            * 辅助核算项49
            */
        @TableField("vr49")
    private String vr49;

            /**
            * 辅助核算项50
            */
        @TableField("vr50")
    private String vr50;

            /**
            * 辅助核算项51
            */
        @TableField("vr51")
    private String vr51;

            /**
            * 辅助核算项52
            */
        @TableField("vr52")
    private String vr52;

            /**
            * 辅助核算项53
            */
        @TableField("vr53")
    private String vr53;

            /**
            * 辅助核算项54
            */
        @TableField("vr54")
    private String vr54;

            /**
            * 辅助核算项55
            */
        @TableField("vr55")
    private String vr55;

            /**
            * 辅助核算项56
            */
        @TableField("vr56")
    private String vr56;

            /**
            * 辅助核算项57
            */
        @TableField("vr57")
    private String vr57;

            /**
            * 辅助核算项58
            */
        @TableField("vr58")
    private String vr58;

            /**
            * 辅助核算项59
            */
        @TableField("vr59")
    private String vr59;

            /**
            * 辅助核算项60
            */
        @TableField("vr60")
    private String vr60;

            /**
            * 辅助核算项61
            */
        @TableField("vr61")
    private String vr61;

            /**
            * 辅助核算项62
            */
        @TableField("vr62")
    private String vr62;

            /**
            * 辅助核算项63
            */
        @TableField("vr63")
    private String vr63;

            /**
            * 辅助核算项64
            */
        @TableField("vr64")
    private String vr64;

            /**
            * 辅助核算项65
            */
        @TableField("vr65")
    private String vr65;

            /**
            * 辅助核算项66
            */
        @TableField("vr66")
    private String vr66;

            /**
            * 辅助核算项67
            */
        @TableField("vr67")
    private String vr67;

            /**
            * 辅助核算项68
            */
        @TableField("vr68")
    private String vr68;

            /**
            * 辅助核算项69
            */
        @TableField("vr69")
    private String vr69;

            /**
            * 辅助核算项70
            */
        @TableField("vr70")
    private String vr70;

            /**
            * 辅助核算项71
            */
        @TableField("vr71")
    private String vr71;

            /**
            * 辅助核算项72
            */
        @TableField("vr72")
    private String vr72;

            /**
            * 辅助核算项73
            */
        @TableField("vr73")
    private String vr73;

            /**
            * 辅助核算项74
            */
        @TableField("vr74")
    private String vr74;

            /**
            * 辅助核算项75
            */
        @TableField("vr75")
    private String vr75;

            /**
            * 辅助核算项76
            */
        @TableField("vr76")
    private String vr76;

            /**
            * 辅助核算项77
            */
        @TableField("vr77")
    private String vr77;

            /**
            * 辅助核算项78
            */
        @TableField("vr78")
    private String vr78;

            /**
            * 辅助核算项79
            */
        @TableField("vr79")
    private String vr79;

            /**
            * 辅助核算项80
            */
        @TableField("vr80")
    private String vr80;

            /**
            * 辅助核算项81
            */
        @TableField("vr81")
    private String vr81;

            /**
            * 辅助核算项82
            */
        @TableField("vr82")
    private String vr82;

            /**
            * 辅助核算项83
            */
        @TableField("vr83")
    private String vr83;

            /**
            * 辅助核算项84
            */
        @TableField("vr84")
    private String vr84;

            /**
            * 辅助核算项85
            */
        @TableField("vr85")
    private String vr85;

            /**
            * 辅助核算项86
            */
        @TableField("vr86")
    private String vr86;

            /**
            * 辅助核算项87
            */
        @TableField("vr87")
    private String vr87;

            /**
            * 辅助核算项88
            */
        @TableField("vr88")
    private String vr88;

            /**
            * 辅助核算项89
            */
        @TableField("vr89")
    private String vr89;

            /**
            * 辅助核算项90
            */
        @TableField("vr90")
    private String vr90;

            /**
            * 辅助核算项91
            */
        @TableField("vr91")
    private String vr91;

            /**
            * 辅助核算项92
            */
        @TableField("vr92")
    private String vr92;

            /**
            * 辅助核算项93
            */
        @TableField("vr93")
    private String vr93;

            /**
            * 辅助核算项94
            */
        @TableField("vr94")
    private String vr94;

            /**
            * 辅助核算项95
            */
        @TableField("vr95")
    private String vr95;

            /**
            * 辅助核算项96
            */
        @TableField("vr96")
    private String vr96;

            /**
            * 辅助核算项97
            */
        @TableField("vr97")
    private String vr97;

            /**
            * 辅助核算项98
            */
        @TableField("vr98")
    private String vr98;

            /**
            * 辅助核算项99
            */
        @TableField("vr99")
    private String vr99;

            /**
            * 辅助核算项100
            */
        @TableField("vr100")
    private String vr100;

            /**
            * 租户id
            */
        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("ytenant_id")
    private String ytenantId;


}