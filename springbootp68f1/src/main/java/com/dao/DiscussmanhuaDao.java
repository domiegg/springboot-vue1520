package com.dao;

import com.entity.DiscussmanhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmanhuaVO;
import com.entity.view.DiscussmanhuaView;


/**
 * 漫画评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface DiscussmanhuaDao extends BaseMapper<DiscussmanhuaEntity> {
	
	List<DiscussmanhuaVO> selectListVO(@Param("ew") Wrapper<DiscussmanhuaEntity> wrapper);
	
	DiscussmanhuaVO selectVO(@Param("ew") Wrapper<DiscussmanhuaEntity> wrapper);
	
	List<DiscussmanhuaView> selectListView(@Param("ew") Wrapper<DiscussmanhuaEntity> wrapper);

	List<DiscussmanhuaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmanhuaEntity> wrapper);
	
	DiscussmanhuaView selectView(@Param("ew") Wrapper<DiscussmanhuaEntity> wrapper);
	

}
