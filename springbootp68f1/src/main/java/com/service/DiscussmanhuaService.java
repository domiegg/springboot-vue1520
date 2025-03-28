package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmanhuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmanhuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmanhuaView;


/**
 * 漫画评论表
 *
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface DiscussmanhuaService extends IService<DiscussmanhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmanhuaVO> selectListVO(Wrapper<DiscussmanhuaEntity> wrapper);
   	
   	DiscussmanhuaVO selectVO(@Param("ew") Wrapper<DiscussmanhuaEntity> wrapper);
   	
   	List<DiscussmanhuaView> selectListView(Wrapper<DiscussmanhuaEntity> wrapper);
   	
   	DiscussmanhuaView selectView(@Param("ew") Wrapper<DiscussmanhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmanhuaEntity> wrapper);
   	

}

