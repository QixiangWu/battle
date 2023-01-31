package com.yibing.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author caochenlei
 * @since 2023-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 创建者id
     */
    private String createrId;

    /**
     * 契约创建时间
     */
    private Date createTime;

    /**
     * 契约更新时间
     */
    private Date updateTime;

    /**
     * 契约开始时间
     */
    private Date startTime;

    /**
     * 契约结束时间
     */
    private Date endTime;

    /**
     * 契约类型，1：1vs1,3：3vs3,4：4vs4，0：多vs多
     */
    private Integer type;

    /**
     * 创建者name
     */
    private String createrName;

    /**
     * 加入契约者
     */
    private String joiner;

    /**
     * 告示(契约目的)
     */
    private String notice;

    /**
     * 球赛等级：1：初级，娱乐练习局，2：中级，常规野球局，3：高级，高手互爆局
     */
    private Integer level;

    /**
     * 位置
     */
    private String address;

    /**
     * 创建者头像
     */
    private String picture;


}
