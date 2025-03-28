package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 约稿
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
@TableName("yuegao")
public class YuegaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuegaoEntity() {
		
	}
	
	public YuegaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 主题名称
	 */
					
	private String zhutimingcheng;
	
	/**
	 * 创作范围
	 */
					
	private String chuangzuofanwei;
	
	/**
	 * 主题限制
	 */
					
	private String zhutixianzhi;
	
	/**
	 * 稿费
	 */
					
	private String gaofei;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：主题名称
	 */
	public void setZhutimingcheng(String zhutimingcheng) {
		this.zhutimingcheng = zhutimingcheng;
	}
	/**
	 * 获取：主题名称
	 */
	public String getZhutimingcheng() {
		return zhutimingcheng;
	}
	/**
	 * 设置：创作范围
	 */
	public void setChuangzuofanwei(String chuangzuofanwei) {
		this.chuangzuofanwei = chuangzuofanwei;
	}
	/**
	 * 获取：创作范围
	 */
	public String getChuangzuofanwei() {
		return chuangzuofanwei;
	}
	/**
	 * 设置：主题限制
	 */
	public void setZhutixianzhi(String zhutixianzhi) {
		this.zhutixianzhi = zhutixianzhi;
	}
	/**
	 * 获取：主题限制
	 */
	public String getZhutixianzhi() {
		return zhutixianzhi;
	}
	/**
	 * 设置：稿费
	 */
	public void setGaofei(String gaofei) {
		this.gaofei = gaofei;
	}
	/**
	 * 获取：稿费
	 */
	public String getGaofei() {
		return gaofei;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
