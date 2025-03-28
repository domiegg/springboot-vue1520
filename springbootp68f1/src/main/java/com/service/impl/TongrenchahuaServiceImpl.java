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


import com.dao.TongrenchahuaDao;
import com.entity.TongrenchahuaEntity;
import com.service.TongrenchahuaService;
import com.entity.vo.TongrenchahuaVO;
import com.entity.view.TongrenchahuaView;

@Service("tongrenchahuaService")
public class TongrenchahuaServiceImpl extends ServiceImpl<TongrenchahuaDao, TongrenchahuaEntity> implements TongrenchahuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongrenchahuaEntity> page = this.selectPage(
                new Query<TongrenchahuaEntity>(params).getPage(),
                new EntityWrapper<TongrenchahuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongrenchahuaEntity> wrapper) {
		  Page<TongrenchahuaView> page =new Query<TongrenchahuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongrenchahuaVO> selectListVO(Wrapper<TongrenchahuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongrenchahuaVO selectVO(Wrapper<TongrenchahuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongrenchahuaView> selectListView(Wrapper<TongrenchahuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongrenchahuaView selectView(Wrapper<TongrenchahuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
