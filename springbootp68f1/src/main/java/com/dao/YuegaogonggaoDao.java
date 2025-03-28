package com.dao;

import com.entity.YuegaogonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuegaogonggaoVO;
import com.entity.view.YuegaogonggaoView;


/**
 * 约稿公告
 * 
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface YuegaogonggaoDao extends BaseMapper<YuegaogonggaoEntity> {
	
	List<YuegaogonggaoVO> selectListVO(@Param("ew") Wrapper<YuegaogonggaoEntity> wrapper);
	
	YuegaogonggaoVO selectVO(@Param("ew") Wrapper<YuegaogonggaoEntity> wrapper);
	
	List<YuegaogonggaoView> selectListView(@Param("ew") Wrapper<YuegaogonggaoEntity> wrapper);

	List<YuegaogonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<YuegaogonggaoEntity> wrapper);
	
	YuegaogonggaoView selectView(@Param("ew") Wrapper<YuegaogonggaoEntity> wrapper);
	

}
