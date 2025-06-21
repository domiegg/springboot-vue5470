package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaogaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaogaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaogaoxinxiView;


/**
 * 报告信息
 *
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
public interface BaogaoxinxiService extends IService<BaogaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaogaoxinxiVO> selectListVO(Wrapper<BaogaoxinxiEntity> wrapper);
   	
   	BaogaoxinxiVO selectVO(@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);
   	
   	List<BaogaoxinxiView> selectListView(Wrapper<BaogaoxinxiEntity> wrapper);
   	
   	BaogaoxinxiView selectView(@Param("ew") Wrapper<BaogaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaogaoxinxiEntity> wrapper);

   	

}

