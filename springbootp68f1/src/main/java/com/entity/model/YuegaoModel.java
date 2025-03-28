package com.entity.model;

import com.entity.YuegaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 约稿
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public class YuegaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
