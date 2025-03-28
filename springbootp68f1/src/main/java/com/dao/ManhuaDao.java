package com.dao;

import com.entity.ManhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ManhuaVO;
import com.entity.view.ManhuaView;


/**
 * 漫画
 * 
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface ManhuaDao extends BaseMapper<ManhuaEntity> {
	
	List<ManhuaVO> selectListVO(@Param("ew") Wrapper<ManhuaEntity> wrapper);
	
	ManhuaVO selectVO(@Param("ew") Wrapper<ManhuaEntity> wrapper);
	
	List<ManhuaView> selectListView(@Param("ew") Wrapper<ManhuaEntity> wrapper);

	List<ManhuaView> selectListView(Pagination page,@Param("ew") Wrapper<ManhuaEntity> wrapper);
	
	ManhuaView selectView(@Param("ew") Wrapper<ManhuaEntity> wrapper);
	

}
