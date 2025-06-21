package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GongxiangziliaoEntity;
import com.entity.view.GongxiangziliaoView;

import com.service.GongxiangziliaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 共享资料
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
@RestController
@RequestMapping("/gongxiangziliao")
public class GongxiangziliaoController {
    @Autowired
    private GongxiangziliaoService gongxiangziliaoService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongxiangziliaoEntity gongxiangziliao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fuzeren")) {
			gongxiangziliao.setFuzerenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GongxiangziliaoEntity> ew = new EntityWrapper<GongxiangziliaoEntity>();

		PageUtils page = gongxiangziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongxiangziliao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongxiangziliaoEntity gongxiangziliao, 
		HttpServletRequest request){
        EntityWrapper<GongxiangziliaoEntity> ew = new EntityWrapper<GongxiangziliaoEntity>();

		PageUtils page = gongxiangziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongxiangziliao), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongxiangziliaoEntity gongxiangziliao){
       	EntityWrapper<GongxiangziliaoEntity> ew = new EntityWrapper<GongxiangziliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongxiangziliao, "gongxiangziliao")); 
        return R.ok().put("data", gongxiangziliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongxiangziliaoEntity gongxiangziliao){
        EntityWrapper< GongxiangziliaoEntity> ew = new EntityWrapper< GongxiangziliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongxiangziliao, "gongxiangziliao")); 
		GongxiangziliaoView gongxiangziliaoView =  gongxiangziliaoService.selectView(ew);
		return R.ok("查询共享资料成功").put("data", gongxiangziliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongxiangziliaoEntity gongxiangziliao = gongxiangziliaoService.selectById(id);
        return R.ok().put("data", gongxiangziliao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongxiangziliaoEntity gongxiangziliao = gongxiangziliaoService.selectById(id);
        return R.ok().put("data", gongxiangziliao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongxiangziliaoEntity gongxiangziliao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gongxiangziliao);
        gongxiangziliaoService.insert(gongxiangziliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongxiangziliaoEntity gongxiangziliao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gongxiangziliao);
        gongxiangziliaoService.insert(gongxiangziliao);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GongxiangziliaoEntity gongxiangziliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongxiangziliao);
        gongxiangziliaoService.updateById(gongxiangziliao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongxiangziliaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
