package com.entity.view;

import com.entity.DiscusstongrenchahuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 同人插画评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
@TableName("discusstongrenchahua")
public class DiscusstongrenchahuaView  extends DiscusstongrenchahuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstongrenchahuaView(){
	}
 
 	public DiscusstongrenchahuaView(DiscusstongrenchahuaEntity discusstongrenchahuaEntity){
 	try {
			BeanUtils.copyProperties(this, discusstongrenchahuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
