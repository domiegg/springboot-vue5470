package com.dao;

import com.entity.BaogaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaogaoxinxiVO;
import com.entity.view.BaogaoxinxiView;


/**
 * 报告信息
 * 
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
public interface BaogaoxinxiDao extends BaseMapper<BaogaoxinxiEntity> {
	
	List<BaogaoxinxiVO> selectListVO(@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);
	
	BaogaoxinxiVO selectVO(@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);
	
	List<BaogaoxinxiView> selectListView(@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);

	List<BaogaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);

	
	BaogaoxinxiView selectView(@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);
	

}
