package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ManhuaDao;
import com.entity.ManhuaEntity;
import com.service.ManhuaService;
import com.entity.vo.ManhuaVO;
import com.entity.view.ManhuaView;

@Service("manhuaService")
public class ManhuaServiceImpl extends ServiceImpl<ManhuaDao, ManhuaEntity> implements ManhuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ManhuaEntity> page = this.selectPage(
                new Query<ManhuaEntity>(params).getPage(),
                new EntityWrapper<ManhuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ManhuaEntity> wrapper) {
		  Page<ManhuaView> page =new Query<ManhuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ManhuaVO> selectListVO(Wrapper<ManhuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ManhuaVO selectVO(Wrapper<ManhuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ManhuaView> selectListView(Wrapper<ManhuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ManhuaView selectView(Wrapper<ManhuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
