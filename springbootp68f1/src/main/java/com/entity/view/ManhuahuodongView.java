package com.entity.view;

import com.entity.ManhuahuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 漫画活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
@TableName("manhuahuodong")
public class ManhuahuodongView  extends ManhuahuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ManhuahuodongView(){
	}
 
 	public ManhuahuodongView(ManhuahuodongEntity manhuahuodongEntity){
 	try {
			BeanUtils.copyProperties(this, manhuahuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
