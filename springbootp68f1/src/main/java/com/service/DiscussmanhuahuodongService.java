package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmanhuahuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmanhuahuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmanhuahuodongView;


/**
 * 漫画活动评论表
 *
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface DiscussmanhuahuodongService extends IService<DiscussmanhuahuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmanhuahuodongVO> selectListVO(Wrapper<DiscussmanhuahuodongEntity> wrapper);
   	
   	DiscussmanhuahuodongVO selectVO(@Param("ew") Wrapper<DiscussmanhuahuodongEntity> wrapper);
   	
   	List<DiscussmanhuahuodongView> selectListView(Wrapper<DiscussmanhuahuodongEntity> wrapper);
   	
   	DiscussmanhuahuodongView selectView(@Param("ew") Wrapper<DiscussmanhuahuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmanhuahuodongEntity> wrapper);
   	

}

