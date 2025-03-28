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


import com.dao.DiscusstongrenchahuaDao;
import com.entity.DiscusstongrenchahuaEntity;
import com.service.DiscusstongrenchahuaService;
import com.entity.vo.DiscusstongrenchahuaVO;
import com.entity.view.DiscusstongrenchahuaView;

@Service("discusstongrenchahuaService")
public class DiscusstongrenchahuaServiceImpl extends ServiceImpl<DiscusstongrenchahuaDao, DiscusstongrenchahuaEntity> implements DiscusstongrenchahuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstongrenchahuaEntity> page = this.selectPage(
                new Query<DiscusstongrenchahuaEntity>(params).getPage(),
                new EntityWrapper<DiscusstongrenchahuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstongrenchahuaEntity> wrapper) {
		  Page<DiscusstongrenchahuaView> page =new Query<DiscusstongrenchahuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstongrenchahuaVO> selectListVO(Wrapper<DiscusstongrenchahuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstongrenchahuaVO selectVO(Wrapper<DiscusstongrenchahuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstongrenchahuaView> selectListView(Wrapper<DiscusstongrenchahuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstongrenchahuaView selectView(Wrapper<DiscusstongrenchahuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
