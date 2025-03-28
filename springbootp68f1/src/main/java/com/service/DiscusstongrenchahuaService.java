package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstongrenchahuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstongrenchahuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstongrenchahuaView;


/**
 * 同人插画评论表
 *
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface DiscusstongrenchahuaService extends IService<DiscusstongrenchahuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstongrenchahuaVO> selectListVO(Wrapper<DiscusstongrenchahuaEntity> wrapper);
   	
   	DiscusstongrenchahuaVO selectVO(@Param("ew") Wrapper<DiscusstongrenchahuaEntity> wrapper);
   	
   	List<DiscusstongrenchahuaView> selectListView(Wrapper<DiscusstongrenchahuaEntity> wrapper);
   	
   	DiscusstongrenchahuaView selectView(@Param("ew") Wrapper<DiscusstongrenchahuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstongrenchahuaEntity> wrapper);
   	

}

