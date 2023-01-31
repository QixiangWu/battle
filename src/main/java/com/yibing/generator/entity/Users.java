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
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String iphone;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 微信号
     */
    private String wechatId;

    /**
     * 微信头像
     */
    private String picture;

    private Date updateTime;

    private Date createTime;


}
