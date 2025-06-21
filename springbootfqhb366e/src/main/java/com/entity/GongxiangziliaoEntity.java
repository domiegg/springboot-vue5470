package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 共享资料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
@TableName("gongxiangziliao")
public class GongxiangziliaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongxiangziliaoEntity() {
		
	}
	
	public GongxiangziliaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 资料编号
	 */
					
	private String ziliaobianhao;
	
	/**
	 * 资料名称
	 */
					
	private String ziliaomingcheng;
	
	/**
	 * 资料类型
	 */
					
	private String ziliaoleixing;
	
	/**
	 * 资料封面
	 */
					
	private String ziliaofengmian;
	
	/**
	 * 资料文件
	 */
					
	private String ziliaowenjian;
	
	/**
	 * 资料介绍
	 */
					
	private String ziliaojieshao;
	
	/**
	 * 上传时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shangchuanshijian;
	
	/**
	 * 负责人账号
	 */
					
	private String fuzerenzhanghao;
	
	/**
	 * 负责人姓名
	 */
					
	private String fuzerenxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：资料编号
	 */
	public void setZiliaobianhao(String ziliaobianhao) {
		this.ziliaobianhao = ziliaobianhao;
	}
	/**
	 * 获取：资料编号
	 */
	public String getZiliaobianhao() {
		return ziliaobianhao;
	}
	/**
	 * 设置：资料名称
	 */
	public void setZiliaomingcheng(String ziliaomingcheng) {
		this.ziliaomingcheng = ziliaomingcheng;
	}
	/**
	 * 获取：资料名称
	 */
	public String getZiliaomingcheng() {
		return ziliaomingcheng;
	}
	/**
	 * 设置：资料类型
	 */
	public void setZiliaoleixing(String ziliaoleixing) {
		this.ziliaoleixing = ziliaoleixing;
	}
	/**
	 * 获取：资料类型
	 */
	public String getZiliaoleixing() {
		return ziliaoleixing;
	}
	/**
	 * 设置：资料封面
	 */
	public void setZiliaofengmian(String ziliaofengmian) {
		this.ziliaofengmian = ziliaofengmian;
	}
	/**
	 * 获取：资料封面
	 */
	public String getZiliaofengmian() {
		return ziliaofengmian;
	}
	/**
	 * 设置：资料文件
	 */
	public void setZiliaowenjian(String ziliaowenjian) {
		this.ziliaowenjian = ziliaowenjian;
	}
	/**
	 * 获取：资料文件
	 */
	public String getZiliaowenjian() {
		return ziliaowenjian;
	}
	/**
	 * 设置：资料介绍
	 */
	public void setZiliaojieshao(String ziliaojieshao) {
		this.ziliaojieshao = ziliaojieshao;
	}
	/**
	 * 获取：资料介绍
	 */
	public String getZiliaojieshao() {
		return ziliaojieshao;
	}
	/**
	 * 设置：上传时间
	 */
	public void setShangchuanshijian(Date shangchuanshijian) {
		this.shangchuanshijian = shangchuanshijian;
	}
	/**
	 * 获取：上传时间
	 */
	public Date getShangchuanshijian() {
		return shangchuanshijian;
	}
	/**
	 * 设置：负责人账号
	 */
	public void setFuzerenzhanghao(String fuzerenzhanghao) {
		this.fuzerenzhanghao = fuzerenzhanghao;
	}
	/**
	 * 获取：负责人账号
	 */
	public String getFuzerenzhanghao() {
		return fuzerenzhanghao;
	}
	/**
	 * 设置：负责人姓名
	 */
	public void setFuzerenxingming(String fuzerenxingming) {
		this.fuzerenxingming = fuzerenxingming;
	}
	/**
	 * 获取：负责人姓名
	 */
	public String getFuzerenxingming() {
		return fuzerenxingming;
	}

}
