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

import com.entity.BaogaoleixingEntity;
import com.entity.view.BaogaoleixingView;

import com.service.BaogaoleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 报告类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
@RestController
@RequestMapping("/baogaoleixing")
public class BaogaoleixingController {
    @Autowired
    private BaogaoleixingService baogaoleixingService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaogaoleixingEntity baogaoleixing,
		HttpServletRequest request){
        EntityWrapper<BaogaoleixingEntity> ew = new EntityWrapper<BaogaoleixingEntity>();

		PageUtils page = baogaoleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baogaoleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaogaoleixingEntity baogaoleixing, 
		HttpServletRequest request){
        EntityWrapper<BaogaoleixingEntity> ew = new EntityWrapper<BaogaoleixingEntity>();

		PageUtils page = baogaoleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baogaoleixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaogaoleixingEntity baogaoleixing){
       	EntityWrapper<BaogaoleixingEntity> ew = new EntityWrapper<BaogaoleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baogaoleixing, "baogaoleixing")); 
        return R.ok().put("data", baogaoleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaogaoleixingEntity baogaoleixing){
        EntityWrapper< BaogaoleixingEntity> ew = new EntityWrapper< BaogaoleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baogaoleixing, "baogaoleixing")); 
		BaogaoleixingView baogaoleixingView =  baogaoleixingService.selectView(ew);
		return R.ok("查询报告类型成功").put("data", baogaoleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaogaoleixingEntity baogaoleixing = baogaoleixingService.selectById(id);
        return R.ok().put("data", baogaoleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaogaoleixingEntity baogaoleixing = baogaoleixingService.selectById(id);
        return R.ok().put("data", baogaoleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaogaoleixingEntity baogaoleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(baogaoleixing);
        baogaoleixingService.insert(baogaoleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaogaoleixingEntity baogaoleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(baogaoleixing);
        baogaoleixingService.insert(baogaoleixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BaogaoleixingEntity baogaoleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baogaoleixing);
        baogaoleixingService.updateById(baogaoleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baogaoleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
