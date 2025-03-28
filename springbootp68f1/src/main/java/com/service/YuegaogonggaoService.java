package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuegaogonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuegaogonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuegaogonggaoView;


/**
 * 约稿公告
 *
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface YuegaogonggaoService extends IService<YuegaogonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuegaogonggaoVO> selectListVO(Wrapper<YuegaogonggaoEntity> wrapper);
   	
   	YuegaogonggaoVO selectVO(@Param("ew") Wrapper<YuegaogonggaoEntity> wrapper);
   	
   	List<YuegaogonggaoView> selectListView(Wrapper<YuegaogonggaoEntity> wrapper);
   	
   	YuegaogonggaoView selectView(@Param("ew") Wrapper<YuegaogonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuegaogonggaoEntity> wrapper);
   	

}

