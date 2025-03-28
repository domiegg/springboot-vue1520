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


import com.dao.ManhuahuodongDao;
import com.entity.ManhuahuodongEntity;
import com.service.ManhuahuodongService;
import com.entity.vo.ManhuahuodongVO;
import com.entity.view.ManhuahuodongView;

@Service("manhuahuodongService")
public class ManhuahuodongServiceImpl extends ServiceImpl<ManhuahuodongDao, ManhuahuodongEntity> implements ManhuahuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ManhuahuodongEntity> page = this.selectPage(
                new Query<ManhuahuodongEntity>(params).getPage(),
                new EntityWrapper<ManhuahuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ManhuahuodongEntity> wrapper) {
		  Page<ManhuahuodongView> page =new Query<ManhuahuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ManhuahuodongVO> selectListVO(Wrapper<ManhuahuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ManhuahuodongVO selectVO(Wrapper<ManhuahuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ManhuahuodongView> selectListView(Wrapper<ManhuahuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ManhuahuodongView selectView(Wrapper<ManhuahuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
