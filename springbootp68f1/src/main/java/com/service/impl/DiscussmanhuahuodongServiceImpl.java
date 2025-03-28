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


import com.dao.DiscussmanhuahuodongDao;
import com.entity.DiscussmanhuahuodongEntity;
import com.service.DiscussmanhuahuodongService;
import com.entity.vo.DiscussmanhuahuodongVO;
import com.entity.view.DiscussmanhuahuodongView;

@Service("discussmanhuahuodongService")
public class DiscussmanhuahuodongServiceImpl extends ServiceImpl<DiscussmanhuahuodongDao, DiscussmanhuahuodongEntity> implements DiscussmanhuahuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmanhuahuodongEntity> page = this.selectPage(
                new Query<DiscussmanhuahuodongEntity>(params).getPage(),
                new EntityWrapper<DiscussmanhuahuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmanhuahuodongEntity> wrapper) {
		  Page<DiscussmanhuahuodongView> page =new Query<DiscussmanhuahuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmanhuahuodongVO> selectListVO(Wrapper<DiscussmanhuahuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmanhuahuodongVO selectVO(Wrapper<DiscussmanhuahuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmanhuahuodongView> selectListView(Wrapper<DiscussmanhuahuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmanhuahuodongView selectView(Wrapper<DiscussmanhuahuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
