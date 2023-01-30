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
@ApiModel(value="Contract对象", description="")
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "创建者id")
    private String createrId;

    @ApiModelProperty(value = "契约创建时间")
    private Date createTime;

    @ApiModelProperty(value = "契约更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "契约开始时间")
    private Date startTime;

    @ApiModelProperty(value = "契约结束时间")
    private Date endTime;

    @ApiModelProperty(value = "契约类型，1：1vs1,3：3vs3,4：4vs4，0：多vs多")
    private Integer type;

    @ApiModelProperty(value = "创建者name")
    private String createrName;

    @ApiModelProperty(value = "加入契约者")
    private String joiner;

    @ApiModelProperty(value = "告示(契约目的)")
    private String notice;

    @ApiModelProperty(value = "球赛等级：1：初级，娱乐练习局，2：中级，常规野球局，3：高级，高手互爆局")
    private Integer level;

    @ApiModelProperty(value = "位置")
    private String address;

    @ApiModelProperty(value = "创建者头像")
    private String picture;


}
