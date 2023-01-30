package com.yibing.generator.store.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yibing
 * @since 2023-01-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Users对象", description="")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "手机号")
    private String iphone;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "微信号")
    private String wechatId;

    @ApiModelProperty(value = "微信头像")
    private String picture;

    private Date updateTime;

    private Date createTime;


}
