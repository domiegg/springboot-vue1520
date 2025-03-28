package com.dao;

import com.entity.DiscusstongrenchahuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstongrenchahuaVO;
import com.entity.view.DiscusstongrenchahuaView;


/**
 * 同人插画评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface DiscusstongrenchahuaDao extends BaseMapper<DiscusstongrenchahuaEntity> {
	
	List<DiscusstongrenchahuaVO> selectListVO(@Param("ew") Wrapper<DiscusstongrenchahuaEntity> wrapper);
	
	DiscusstongrenchahuaVO selectVO(@Param("ew") Wrapper<DiscusstongrenchahuaEntity> wrapper);
	
	List<DiscusstongrenchahuaView> selectListView(@Param("ew") Wrapper<DiscusstongrenchahuaEntity> wrapper);

	List<DiscusstongrenchahuaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstongrenchahuaEntity> wrapper);
	
	DiscusstongrenchahuaView selectView(@Param("ew") Wrapper<DiscusstongrenchahuaEntity> wrapper);
	

}
