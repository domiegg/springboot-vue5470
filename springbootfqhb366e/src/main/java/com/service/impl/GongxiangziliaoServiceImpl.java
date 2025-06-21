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


import com.dao.GongxiangziliaoDao;
import com.entity.GongxiangziliaoEntity;
import com.service.GongxiangziliaoService;
import com.entity.vo.GongxiangziliaoVO;
import com.entity.view.GongxiangziliaoView;

@Service("gongxiangziliaoService")
public class GongxiangziliaoServiceImpl extends ServiceImpl<GongxiangziliaoDao, GongxiangziliaoEntity> implements GongxiangziliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongxiangziliaoEntity> page = this.selectPage(
                new Query<GongxiangziliaoEntity>(params).getPage(),
                new EntityWrapper<GongxiangziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongxiangziliaoEntity> wrapper) {
		  Page<GongxiangziliaoView> page =new Query<GongxiangziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GongxiangziliaoVO> selectListVO(Wrapper<GongxiangziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongxiangziliaoVO selectVO(Wrapper<GongxiangziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongxiangziliaoView> selectListView(Wrapper<GongxiangziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongxiangziliaoView selectView(Wrapper<GongxiangziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
