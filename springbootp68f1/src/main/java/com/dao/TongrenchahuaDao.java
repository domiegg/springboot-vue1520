package com.dao;

import com.entity.TongrenchahuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongrenchahuaVO;
import com.entity.view.TongrenchahuaView;


/**
 * 同人插画
 * 
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface TongrenchahuaDao extends BaseMapper<TongrenchahuaEntity> {
	
	List<TongrenchahuaVO> selectListVO(@Param("ew") Wrapper<TongrenchahuaEntity> wrapper);
	
	TongrenchahuaVO selectVO(@Param("ew") Wrapper<TongrenchahuaEntity> wrapper);
	
	List<TongrenchahuaView> selectListView(@Param("ew") Wrapper<TongrenchahuaEntity> wrapper);

	List<TongrenchahuaView> selectListView(Pagination page,@Param("ew") Wrapper<TongrenchahuaEntity> wrapper);
	
	TongrenchahuaView selectView(@Param("ew") Wrapper<TongrenchahuaEntity> wrapper);
	

}
