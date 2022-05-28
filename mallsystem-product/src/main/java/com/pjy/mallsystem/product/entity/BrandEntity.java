package com.pjy.mallsystem.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pjy.mallsystem.common.validation.annotation.EnumValue;
import com.pjy.mallsystem.common.validation.group.AddGroup;
import com.pjy.mallsystem.common.validation.group.UpdateGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌
 * 
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 16:33:33
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	@NotNull(message = "修改需提供id",groups = UpdateGroup.class)
	@Null(message = "新增不能指定id",groups = AddGroup.class)
	private Long brandId;
	/**
	 * 品牌名
	 */
	@Pattern(regexp = "\\S+",message = "品牌名不能为空",groups= {AddGroup.class,UpdateGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotEmpty(message = "必须提交图片logo",groups = AddGroup.class)
	@URL(message = "logo地址必须为合法的url",groups = {AddGroup.class,UpdateGroup.class})
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@NotEmpty(message = "显示状态不能为空",groups =AddGroup.class)
	@EnumValue(values = {0,1},groups = {UpdateGroup.class,AddGroup.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@NotEmpty(message = "检索不能为空",groups =AddGroup.class)
	@Pattern(message = "检索只能为单字母",regexp = "^[a-zA-Z]$",groups = {UpdateGroup.class,AddGroup.class})
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull(message = "排序不能为空",groups =AddGroup.class)
	@Min(message = "排序值必须不小于0",value = 0,groups = {UpdateGroup.class,AddGroup.class})
	private Integer sort;

}
