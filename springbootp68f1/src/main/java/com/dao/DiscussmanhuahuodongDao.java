package com.dao;

import com.entity.DiscussmanhuahuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmanhuahuodongVO;
import com.entity.view.DiscussmanhuahuodongView;


/**
 * 漫画活动评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface DiscussmanhuahuodongDao extends BaseMapper<DiscussmanhuahuodongEntity> {
	
	List<DiscussmanhuahuodongVO> selectListVO(@Param("ew") Wrapper<DiscussmanhuahuodongEntity> wrapper);
	
	DiscussmanhuahuodongVO selectVO(@Param("ew") Wrapper<DiscussmanhuahuodongEntity> wrapper);
	
	List<DiscussmanhuahuodongView> selectListView(@Param("ew") Wrapper<DiscussmanhuahuodongEntity> wrapper);

	List<DiscussmanhuahuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmanhuahuodongEntity> wrapper);
	
	DiscussmanhuahuodongView selectView(@Param("ew") Wrapper<DiscussmanhuahuodongEntity> wrapper);
	

}
