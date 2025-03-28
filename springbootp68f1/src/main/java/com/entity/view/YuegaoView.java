package com.entity.view;

import com.entity.YuegaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 约稿
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
@TableName("yuegao")
public class YuegaoView  extends YuegaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuegaoView(){
	}
 
 	public YuegaoView(YuegaoEntity yuegaoEntity){
 	try {
			BeanUtils.copyProperties(this, yuegaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
