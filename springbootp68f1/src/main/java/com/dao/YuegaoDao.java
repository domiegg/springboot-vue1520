package com.dao;

import com.entity.YuegaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuegaoVO;
import com.entity.view.YuegaoView;


/**
 * 约稿
 * 
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface YuegaoDao extends BaseMapper<YuegaoEntity> {
	
	List<YuegaoVO> selectListVO(@Param("ew") Wrapper<YuegaoEntity> wrapper);
	
	YuegaoVO selectVO(@Param("ew") Wrapper<YuegaoEntity> wrapper);
	
	List<YuegaoView> selectListView(@Param("ew") Wrapper<YuegaoEntity> wrapper);

	List<YuegaoView> selectListView(Pagination page,@Param("ew") Wrapper<YuegaoEntity> wrapper);
	
	YuegaoView selectView(@Param("ew") Wrapper<YuegaoEntity> wrapper);
	

}
