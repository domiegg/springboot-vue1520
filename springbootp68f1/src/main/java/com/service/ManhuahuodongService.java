package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ManhuahuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ManhuahuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ManhuahuodongView;


/**
 * 漫画活动
 *
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface ManhuahuodongService extends IService<ManhuahuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ManhuahuodongVO> selectListVO(Wrapper<ManhuahuodongEntity> wrapper);
   	
   	ManhuahuodongVO selectVO(@Param("ew") Wrapper<ManhuahuodongEntity> wrapper);
   	
   	List<ManhuahuodongView> selectListView(Wrapper<ManhuahuodongEntity> wrapper);
   	
   	ManhuahuodongView selectView(@Param("ew") Wrapper<ManhuahuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ManhuahuodongEntity> wrapper);
   	

}

