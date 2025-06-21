package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongxiangziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongxiangziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongxiangziliaoView;


/**
 * 共享资料
 *
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
public interface GongxiangziliaoService extends IService<GongxiangziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongxiangziliaoVO> selectListVO(Wrapper<GongxiangziliaoEntity> wrapper);
   	
   	GongxiangziliaoVO selectVO(@Param("ew") Wrapper<GongxiangziliaoEntity> wrapper);
   	
   	List<GongxiangziliaoView> selectListView(Wrapper<GongxiangziliaoEntity> wrapper);
   	
   	GongxiangziliaoView selectView(@Param("ew") Wrapper<GongxiangziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongxiangziliaoEntity> wrapper);

   	

}

