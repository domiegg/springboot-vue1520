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


import com.dao.DiscussmanhuaDao;
import com.entity.DiscussmanhuaEntity;
import com.service.DiscussmanhuaService;
import com.entity.vo.DiscussmanhuaVO;
import com.entity.view.DiscussmanhuaView;

@Service("discussmanhuaService")
public class DiscussmanhuaServiceImpl extends ServiceImpl<DiscussmanhuaDao, DiscussmanhuaEntity> implements DiscussmanhuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmanhuaEntity> page = this.selectPage(
                new Query<DiscussmanhuaEntity>(params).getPage(),
                new EntityWrapper<DiscussmanhuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmanhuaEntity> wrapper) {
		  Page<DiscussmanhuaView> page =new Query<DiscussmanhuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmanhuaVO> selectListVO(Wrapper<DiscussmanhuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmanhuaVO selectVO(Wrapper<DiscussmanhuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmanhuaView> selectListView(Wrapper<DiscussmanhuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmanhuaView selectView(Wrapper<DiscussmanhuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
