package com.dao;

import com.entity.BaogaoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaogaoleixingVO;
import com.entity.view.BaogaoleixingView;


/**
 * 报告类型
 * 
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
public interface BaogaoleixingDao extends BaseMapper<BaogaoleixingEntity> {
	
	List<BaogaoleixingVO> selectListVO(@Param("ew") Wrapper<BaogaoleixingEntity> wrapper);
	
	BaogaoleixingVO selectVO(@Param("ew") Wrapper<BaogaoleixingEntity> wrapper);
	
	List<BaogaoleixingView> selectListView(@Param("ew") Wrapper<BaogaoleixingEntity> wrapper);

	List<BaogaoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<BaogaoleixingEntity> wrapper);

	
	BaogaoleixingView selectView(@Param("ew") Wrapper<BaogaoleixingEntity> wrapper);
	

}
