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


import com.dao.BaogaoxinxiDao;
import com.entity.BaogaoxinxiEntity;
import com.service.BaogaoxinxiService;
import com.entity.vo.BaogaoxinxiVO;
import com.entity.view.BaogaoxinxiView;

@Service("baogaoxinxiService")
public class BaogaoxinxiServiceImpl extends ServiceImpl<BaogaoxinxiDao, BaogaoxinxiEntity> implements BaogaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaogaoxinxiEntity> page = this.selectPage(
                new Query<BaogaoxinxiEntity>(params).getPage(),
                new EntityWrapper<BaogaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaogaoxinxiEntity> wrapper) {
		  Page<BaogaoxinxiView> page =new Query<BaogaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BaogaoxinxiVO> selectListVO(Wrapper<BaogaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaogaoxinxiVO selectVO(Wrapper<BaogaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaogaoxinxiView> selectListView(Wrapper<BaogaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaogaoxinxiView selectView(Wrapper<BaogaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
