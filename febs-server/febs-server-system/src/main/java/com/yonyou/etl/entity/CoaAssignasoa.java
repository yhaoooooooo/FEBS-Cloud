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
    @TableName("coa_assignasoa")
    public class CoaAssignasoa implements Serializable {

private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.UUID)
    private String id;

            /**
            * 核算目的
            */
        @TableField("accpurposes")
    private String accpurposes;

            /**
            * 期间类型
            */
        @TableField("periodtype")
    private String periodtype;

            /**
            * 管控范围
            */
        @TableField("controlarea")
    private String controlarea;

            /**
            * 来源模块
            */
        @TableField("sourcemodule")
    private String sourcemodule;

            /**
            * 发送对象集合
            */
        @TableField("sendobjects")
    private String sendobjects;

            /**
            * 接受对象集合
            */
        @TableField("acceptobjects")
    private String acceptobjects;

            /**
            * 发送方对象1
            */
        @TableField("srcobj1")
    private String srcobj1;

            /**
            * 发送方对象2
            */
        @TableField("srcobj2")
    private String srcobj2;

            /**
            * 发送方对象3
            */
        @TableField("srcobj3")
    private String srcobj3;

            /**
            * 发送方对象4
            */
        @TableField("srcobj4")
    private String srcobj4;

            /**
            * 发送方对象5
            */
        @TableField("srcobj5")
    private String srcobj5;

            /**
            * 发送方对象6
            */
        @TableField("srcobj6")
    private String srcobj6;

            /**
            * 发送方对象7
            */
        @TableField("srcobj7")
    private String srcobj7;

            /**
            * 发送方对象8
            */
        @TableField("srcobj8")
    private String srcobj8;

            /**
            * 发送方对象9
            */
        @TableField("srcobj9")
    private String srcobj9;

            /**
            * 发送方对象10
            */
        @TableField("srcobj10")
    private String srcobj10;

            /**
            * 发送方对象11
            */
        @TableField("srcobj11")
    private String srcobj11;

            /**
            * 发送方对象12
            */
        @TableField("srcobj12")
    private String srcobj12;

            /**
            * 发送方对象13
            */
        @TableField("srcobj13")
    private String srcobj13;

            /**
            * 发送方对象14
            */
        @TableField("srcobj14")
    private String srcobj14;

            /**
            * 发送方对象15
            */
        @TableField("srcobj15")
    private String srcobj15;

            /**
            * 发送方对象16
            */
        @TableField("srcobj16")
    private String srcobj16;

            /**
            * 发送方对象17
            */
        @TableField("srcobj17")
    private String srcobj17;

            /**
            * 发送方对象18
            */
        @TableField("srcobj18")
    private String srcobj18;

            /**
            * 发送方对象19
            */
        @TableField("srcobj19")
    private String srcobj19;

            /**
            * 发送方对象20
            */
        @TableField("srcobj20")
    private String srcobj20;

            /**
            * 接收方对象1
            */
        @TableField("accobj1")
    private String accobj1;

            /**
            * 接收方对象2
            */
        @TableField("accobj2")
    private String accobj2;

            /**
            * 接收方对象3
            */
        @TableField("accobj3")
    private String accobj3;

            /**
            * 接收方对象4
            */
        @TableField("accobj4")
    private String accobj4;

            /**
            * 接收方对象5
            */
        @TableField("accobj5")
    private String accobj5;

            /**
            * 接收方对象6
            */
        @TableField("accobj6")
    private String accobj6;

            /**
            * 接收方对象7
            */
        @TableField("accobj7")
    private String accobj7;

            /**
            * 接收方对象8
            */
        @TableField("accobj8")
    private String accobj8;

            /**
            * 接收方对象9
            */
        @TableField("accobj9")
    private String accobj9;

            /**
            * 接收方对象10
            */
        @TableField("accobj10")
    private String accobj10;

            /**
            * 接收方对象11
            */
        @TableField("accobj11")
    private String accobj11;

            /**
            * 接收方对象12
            */
        @TableField("accobj12")
    private String accobj12;

            /**
            * 接收方对象13
            */
        @TableField("accobj13")
    private String accobj13;

            /**
            * 接收方对象14
            */
        @TableField("accobj14")
    private String accobj14;

            /**
            * 接收方对象15
            */
        @TableField("accobj15")
    private String accobj15;

            /**
            * 接收方对象16
            */
        @TableField("accobj16")
    private String accobj16;

            /**
            * 接收方对象17
            */
        @TableField("accobj17")
    private String accobj17;

            /**
            * 接收方对象18
            */
        @TableField("accobj18")
    private String accobj18;

            /**
            * 接收方对象19
            */
        @TableField("accobj19")
    private String accobj19;

            /**
            * 接收方对象20
            */
        @TableField("accobj20")
    private String accobj20;

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

        @TableField("ts")
    private String ts;

        @TableField("classifyid")
    private String classifyid;

        @TableField("code")
    private String code;

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

        @TableField("enable")
    private Boolean enable;

        @TableField("name")
    private String name;

        @TableField("name2")
    private String name2;

        @TableField("name3")
    private String name3;

        @TableField("name4")
    private String name4;

        @TableField("name5")
    private String name5;

        @TableField("name6")
    private String name6;

        @TableField("parentid")
    private String parentid;

        @TableField("tenantid")
    private String tenantid;

        @TableField("srctplid")
    private String srctplid;

        @TableField("pk_group")
    private String pkGroup;

        @TableField("pk_org")
    private String pkOrg;

        @TableField("ytenant_id")
    private String ytenantId;


}