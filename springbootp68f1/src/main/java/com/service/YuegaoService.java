package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuegaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuegaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuegaoView;


/**
 * 约稿
 *
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface YuegaoService extends IService<YuegaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuegaoVO> selectListVO(Wrapper<YuegaoEntity> wrapper);
   	
   	YuegaoVO selectVO(@Param("ew") Wrapper<YuegaoEntity> wrapper);
   	
   	List<YuegaoView> selectListView(Wrapper<YuegaoEntity> wrapper);
   	
   	YuegaoView selectView(@Param("ew") Wrapper<YuegaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuegaoEntity> wrapper);
   	

}

