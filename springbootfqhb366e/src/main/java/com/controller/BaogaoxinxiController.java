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

import com.entity.BaogaoxinxiEntity;
import com.entity.view.BaogaoxinxiView;

import com.service.BaogaoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 报告信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
@RestController
@RequestMapping("/baogaoxinxi")
public class BaogaoxinxiController {
    @Autowired
    private BaogaoxinxiService baogaoxinxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaogaoxinxiEntity baogaoxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			baogaoxinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("fuzeren")) {
			baogaoxinxi.setFuzerenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaogaoxinxiEntity> ew = new EntityWrapper<BaogaoxinxiEntity>();

		PageUtils page = baogaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baogaoxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaogaoxinxiEntity baogaoxinxi, 
		HttpServletRequest request){
        EntityWrapper<BaogaoxinxiEntity> ew = new EntityWrapper<BaogaoxinxiEntity>();

		PageUtils page = baogaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baogaoxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaogaoxinxiEntity baogaoxinxi){
       	EntityWrapper<BaogaoxinxiEntity> ew = new EntityWrapper<BaogaoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baogaoxinxi, "baogaoxinxi")); 
        return R.ok().put("data", baogaoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaogaoxinxiEntity baogaoxinxi){
        EntityWrapper< BaogaoxinxiEntity> ew = new EntityWrapper< BaogaoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baogaoxinxi, "baogaoxinxi")); 
		BaogaoxinxiView baogaoxinxiView =  baogaoxinxiService.selectView(ew);
		return R.ok("查询报告信息成功").put("data", baogaoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaogaoxinxiEntity baogaoxinxi = baogaoxinxiService.selectById(id);
        return R.ok().put("data", baogaoxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaogaoxinxiEntity baogaoxinxi = baogaoxinxiService.selectById(id);
        return R.ok().put("data", baogaoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaogaoxinxiEntity baogaoxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(baogaoxinxi);
        baogaoxinxiService.insert(baogaoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaogaoxinxiEntity baogaoxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(baogaoxinxi);
        baogaoxinxiService.insert(baogaoxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BaogaoxinxiEntity baogaoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baogaoxinxi);
        baogaoxinxiService.updateById(baogaoxinxi);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<BaogaoxinxiEntity> list = new ArrayList<BaogaoxinxiEntity>();
        for(Long id : ids) {
            BaogaoxinxiEntity baogaoxinxi = baogaoxinxiService.selectById(id);
            baogaoxinxi.setSfsh(sfsh);
            baogaoxinxi.setShhf(shhf);
            list.add(baogaoxinxi);
        }
        baogaoxinxiService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baogaoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
