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


import com.dao.YuegaoDao;
import com.entity.YuegaoEntity;
import com.service.YuegaoService;
import com.entity.vo.YuegaoVO;
import com.entity.view.YuegaoView;

@Service("yuegaoService")
public class YuegaoServiceImpl extends ServiceImpl<YuegaoDao, YuegaoEntity> implements YuegaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuegaoEntity> page = this.selectPage(
                new Query<YuegaoEntity>(params).getPage(),
                new EntityWrapper<YuegaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuegaoEntity> wrapper) {
		  Page<YuegaoView> page =new Query<YuegaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuegaoVO> selectListVO(Wrapper<YuegaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuegaoVO selectVO(Wrapper<YuegaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuegaoView> selectListView(Wrapper<YuegaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuegaoView selectView(Wrapper<YuegaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
