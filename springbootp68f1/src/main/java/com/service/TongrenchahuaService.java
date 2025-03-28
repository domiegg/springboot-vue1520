package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongrenchahuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongrenchahuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongrenchahuaView;


/**
 * 同人插画
 *
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface TongrenchahuaService extends IService<TongrenchahuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongrenchahuaVO> selectListVO(Wrapper<TongrenchahuaEntity> wrapper);
   	
   	TongrenchahuaVO selectVO(@Param("ew") Wrapper<TongrenchahuaEntity> wrapper);
   	
   	List<TongrenchahuaView> selectListView(Wrapper<TongrenchahuaEntity> wrapper);
   	
   	TongrenchahuaView selectView(@Param("ew") Wrapper<TongrenchahuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongrenchahuaEntity> wrapper);
   	

}

