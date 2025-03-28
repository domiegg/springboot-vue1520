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


import com.dao.YuegaogonggaoDao;
import com.entity.YuegaogonggaoEntity;
import com.service.YuegaogonggaoService;
import com.entity.vo.YuegaogonggaoVO;
import com.entity.view.YuegaogonggaoView;

@Service("yuegaogonggaoService")
public class YuegaogonggaoServiceImpl extends ServiceImpl<YuegaogonggaoDao, YuegaogonggaoEntity> implements YuegaogonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuegaogonggaoEntity> page = this.selectPage(
                new Query<YuegaogonggaoEntity>(params).getPage(),
                new EntityWrapper<YuegaogonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuegaogonggaoEntity> wrapper) {
		  Page<YuegaogonggaoView> page =new Query<YuegaogonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuegaogonggaoVO> selectListVO(Wrapper<YuegaogonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuegaogonggaoVO selectVO(Wrapper<YuegaogonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuegaogonggaoView> selectListView(Wrapper<YuegaogonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuegaogonggaoView selectView(Wrapper<YuegaogonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
