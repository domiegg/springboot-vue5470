package com.entity.view;

import com.entity.GongxiangziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 共享资料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
@TableName("gongxiangziliao")
public class GongxiangziliaoView  extends GongxiangziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongxiangziliaoView(){
	}
 
 	public GongxiangziliaoView(GongxiangziliaoEntity gongxiangziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, gongxiangziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
