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
    @TableName("fi_vt_body")
    public class FiVtBody implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("accsubject")
    private String accsubject;

        @TableField("accsubjectdesc")
    private String accsubjectdesc;

        @TableField("accsubjectfun")
    private String accsubjectfun;

        @TableField("credit_originalfun")
    private String creditOriginalfun;

        @TableField("currency")
    private String currency;

        @TableField("debit_originalfun")
    private String debitOriginalfun;

        @TableField("description")
    private String description;

        @TableField("description2")
    private String description2;

        @TableField("description3")
    private String description3;

        @TableField("description4")
    private String description4;

        @TableField("description5")
    private String description5;

        @TableField("description6")
    private String description6;

        @TableField("header")
    private String header;

        @TableField("rate")
    private BigDecimal rate;

        @TableField("rowno")
    private Integer rowno;

        @TableField("auxiliary")
    private String auxiliary;

        @TableField("auxorderstr")
    private String auxorderstr;

        @TableField("def1")
    private String def1;

        @TableField("deffun1")
    private String deffun1;

        @TableField("def2")
    private String def2;

        @TableField("deffun2")
    private String deffun2;

        @TableField("def3")
    private String def3;

        @TableField("deffun3")
    private String deffun3;

        @TableField("def4")
    private String def4;

        @TableField("deffun4")
    private String deffun4;

        @TableField("def5")
    private String def5;

        @TableField("deffun5")
    private String deffun5;

        @TableField("def6")
    private String def6;

        @TableField("deffun6")
    private String deffun6;

        @TableField("def7")
    private String def7;

        @TableField("deffun7")
    private String deffun7;

        @TableField("def8")
    private String def8;

        @TableField("deffun8")
    private String deffun8;

        @TableField("def9")
    private String def9;

        @TableField("deffun9")
    private String deffun9;

        @TableField("def10")
    private String def10;

        @TableField("deffun10")
    private String deffun10;

        @TableField("def11")
    private String def11;

        @TableField("deffun11")
    private String deffun11;

        @TableField("def12")
    private String def12;

        @TableField("deffun12")
    private String deffun12;

        @TableField("def13")
    private String def13;

        @TableField("deffun13")
    private String deffun13;

        @TableField("def14")
    private String def14;

        @TableField("deffun14")
    private String deffun14;

        @TableField("def15")
    private String def15;

        @TableField("deffun15")
    private String deffun15;

        @TableField("def16")
    private String def16;

        @TableField("deffun16")
    private String deffun16;

        @TableField("def17")
    private String def17;

        @TableField("deffun17")
    private String deffun17;

        @TableField("def18")
    private String def18;

        @TableField("deffun18")
    private String deffun18;

        @TableField("def19")
    private String def19;

        @TableField("deffun19")
    private String deffun19;

        @TableField("def20")
    private String def20;

        @TableField("deffun20")
    private String deffun20;

        @TableField("def21")
    private String def21;

        @TableField("deffun21")
    private String deffun21;

        @TableField("def22")
    private String def22;

        @TableField("deffun22")
    private String deffun22;

        @TableField("def23")
    private String def23;

        @TableField("deffun23")
    private String deffun23;

        @TableField("def24")
    private String def24;

        @TableField("deffun24")
    private String deffun24;

        @TableField("def25")
    private String def25;

        @TableField("deffun25")
    private String deffun25;

        @TableField("def26")
    private String def26;

        @TableField("deffun26")
    private String deffun26;

        @TableField("def27")
    private String def27;

        @TableField("deffun27")
    private String deffun27;

        @TableField("def28")
    private String def28;

        @TableField("deffun28")
    private String deffun28;

        @TableField("def29")
    private String def29;

        @TableField("deffun29")
    private String deffun29;

        @TableField("def30")
    private String def30;

        @TableField("deffun30")
    private String deffun30;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("debit_quantity")
    private BigDecimal debitQuantity;

        @TableField("credit_quantity")
    private BigDecimal creditQuantity;

        @TableField("price")
    private BigDecimal price;

        @TableField("quantity")
    private BigDecimal quantity;

        @TableField("secondorg")
    private String secondorg;

        @TableField("quantityfun")
    private String quantityfun;

        @TableField("ytenant_id")
    private String ytenantId;


}