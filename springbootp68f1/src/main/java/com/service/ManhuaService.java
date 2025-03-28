package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ManhuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ManhuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ManhuaView;


/**
 * 漫画
 *
 * @author 
 * @email 
 * @date 2022-04-19 11:38:18
 */
public interface ManhuaService extends IService<ManhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ManhuaVO> selectListVO(Wrapper<ManhuaEntity> wrapper);
   	
   	ManhuaVO selectVO(@Param("ew") Wrapper<ManhuaEntity> wrapper);
   	
   	List<ManhuaView> selectListView(Wrapper<ManhuaEntity> wrapper);
   	
   	ManhuaView selectView(@Param("ew") Wrapper<ManhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ManhuaEntity> wrapper);
   	

}

