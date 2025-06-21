package com.dao;

import com.entity.GongxiangziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongxiangziliaoVO;
import com.entity.view.GongxiangziliaoView;


/**
 * 共享资料
 * 
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
public interface GongxiangziliaoDao extends BaseMapper<GongxiangziliaoEntity> {
	
	List<GongxiangziliaoVO> selectListVO(@Param("ew") Wrapper<GongxiangziliaoEntity> wrapper);
	
	GongxiangziliaoVO selectVO(@Param("ew") Wrapper<GongxiangziliaoEntity> wrapper);
	
	List<GongxiangziliaoView> selectListView(@Param("ew") Wrapper<GongxiangziliaoEntity> wrapper);

	List<GongxiangziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<GongxiangziliaoEntity> wrapper);

	
	GongxiangziliaoView selectView(@Param("ew") Wrapper<GongxiangziliaoEntity> wrapper);
	

}
