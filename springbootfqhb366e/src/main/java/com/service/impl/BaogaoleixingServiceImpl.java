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


import com.dao.BaogaoleixingDao;
import com.entity.BaogaoleixingEntity;
import com.service.BaogaoleixingService;
import com.entity.vo.BaogaoleixingVO;
import com.entity.view.BaogaoleixingView;

@Service("baogaoleixingService")
public class BaogaoleixingServiceImpl extends ServiceImpl<BaogaoleixingDao, BaogaoleixingEntity> implements BaogaoleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaogaoleixingEntity> page = this.selectPage(
                new Query<BaogaoleixingEntity>(params).getPage(),
                new EntityWrapper<BaogaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaogaoleixingEntity> wrapper) {
		  Page<BaogaoleixingView> page =new Query<BaogaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BaogaoleixingVO> selectListVO(Wrapper<BaogaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaogaoleixingVO selectVO(Wrapper<BaogaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaogaoleixingView> selectListView(Wrapper<BaogaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaogaoleixingView selectView(Wrapper<BaogaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
