package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaogaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaogaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaogaoleixingView;


/**
 * 报告类型
 *
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
public interface BaogaoleixingService extends IService<BaogaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaogaoleixingVO> selectListVO(Wrapper<BaogaoleixingEntity> wrapper);
   	
   	BaogaoleixingVO selectVO(@Param("ew") Wrapper<BaogaoleixingEntity> wrapper);
   	
   	List<BaogaoleixingView> selectListView(Wrapper<BaogaoleixingEntity> wrapper);
   	
   	BaogaoleixingView selectView(@Param("ew") Wrapper<BaogaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaogaoleixingEntity> wrapper);

   	

}

