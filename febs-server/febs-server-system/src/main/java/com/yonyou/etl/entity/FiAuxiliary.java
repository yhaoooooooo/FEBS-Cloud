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
    @TableName("fi_auxiliary")
    public class FiAuxiliary implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

        @TableField("creationtime")
    private String creationtime;

        @TableField("creator")
    private String creator;

        @TableField("description")
    private String description;

        @TableField("dr")
    private Integer dr;

        @TableField("modifiedtime")
    private String modifiedtime;

        @TableField("modifier")
    private String modifier;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("ts")
    private String ts;

        @TableField("def1")
    private String def1;

        @TableField("def10")
    private String def10;

        @TableField("def11")
    private String def11;

        @TableField("def12")
    private String def12;

        @TableField("def13")
    private String def13;

        @TableField("def14")
    private String def14;

        @TableField("def15")
    private String def15;

        @TableField("def16")
    private String def16;

        @TableField("def17")
    private String def17;

        @TableField("def18")
    private String def18;

        @TableField("def19")
    private String def19;

        @TableField("def2")
    private String def2;

        @TableField("def20")
    private String def20;

        @TableField("def21")
    private String def21;

        @TableField("def22")
    private String def22;

        @TableField("def23")
    private String def23;

        @TableField("def24")
    private String def24;

        @TableField("def25")
    private String def25;

        @TableField("def26")
    private String def26;

        @TableField("def27")
    private String def27;

        @TableField("def28")
    private String def28;

        @TableField("def29")
    private String def29;

        @TableField("def3")
    private String def3;

        @TableField("def30")
    private String def30;

        @TableField("def4")
    private String def4;

        @TableField("def5")
    private String def5;

        @TableField("def6")
    private String def6;

        @TableField("def7")
    private String def7;

        @TableField("def8")
    private String def8;

        @TableField("def9")
    private String def9;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("def31")
    private String def31;

        @TableField("def32")
    private String def32;

        @TableField("def33")
    private String def33;

        @TableField("def34")
    private String def34;

        @TableField("def35")
    private String def35;

        @TableField("def36")
    private String def36;

        @TableField("def37")
    private String def37;

        @TableField("def38")
    private String def38;

        @TableField("def39")
    private String def39;

        @TableField("def40")
    private String def40;

        @TableField("def41")
    private String def41;

        @TableField("def42")
    private String def42;

        @TableField("def43")
    private String def43;

        @TableField("def44")
    private String def44;

        @TableField("def45")
    private String def45;

        @TableField("def46")
    private String def46;

        @TableField("def47")
    private String def47;

        @TableField("def48")
    private String def48;

        @TableField("def49")
    private String def49;

        @TableField("def50")
    private String def50;

        @TableField("def51")
    private String def51;

        @TableField("def52")
    private String def52;

        @TableField("def53")
    private String def53;

        @TableField("def54")
    private String def54;

        @TableField("def55")
    private String def55;

        @TableField("def56")
    private String def56;

        @TableField("def57")
    private String def57;

        @TableField("def58")
    private String def58;

        @TableField("def59")
    private String def59;

        @TableField("def60")
    private String def60;

        @TableField("def61")
    private String def61;

        @TableField("def62")
    private String def62;

        @TableField("def63")
    private String def63;

        @TableField("def64")
    private String def64;

        @TableField("def65")
    private String def65;

        @TableField("def66")
    private String def66;

        @TableField("def67")
    private String def67;

        @TableField("def68")
    private String def68;

        @TableField("def69")
    private String def69;

        @TableField("def70")
    private String def70;

        @TableField("def71")
    private String def71;

        @TableField("def72")
    private String def72;

        @TableField("def73")
    private String def73;

        @TableField("def74")
    private String def74;

        @TableField("def75")
    private String def75;

        @TableField("def76")
    private String def76;

        @TableField("def77")
    private String def77;

        @TableField("def78")
    private String def78;

        @TableField("def79")
    private String def79;

        @TableField("def80")
    private String def80;

        @TableField("def81")
    private String def81;

        @TableField("def82")
    private String def82;

        @TableField("def83")
    private String def83;

        @TableField("def84")
    private String def84;

        @TableField("def85")
    private String def85;

        @TableField("def86")
    private String def86;

        @TableField("def87")
    private String def87;

        @TableField("def88")
    private String def88;

        @TableField("def89")
    private String def89;

        @TableField("def90")
    private String def90;

        @TableField("def91")
    private String def91;

        @TableField("def92")
    private String def92;

        @TableField("def93")
    private String def93;

        @TableField("def94")
    private String def94;

        @TableField("def95")
    private String def95;

        @TableField("def96")
    private String def96;

        @TableField("def97")
    private String def97;

        @TableField("def98")
    private String def98;

        @TableField("def99")
    private String def99;

        @TableField("def100")
    private String def100;

        @TableField("accbook")
    private String accbook;

        @TableField("period")
    private String period;

        @TableField("ytenant_id")
    private String ytenantId;


}