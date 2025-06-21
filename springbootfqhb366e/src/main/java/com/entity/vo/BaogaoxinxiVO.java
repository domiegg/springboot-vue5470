package com.entity.vo;

import com.entity.BaogaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 报告信息
 * @author 
 * @email 
 * @date 2024-03-20 16:42:58
 */
public class BaogaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 报告名称
	 */
	
	private String baogaomingcheng;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 报告类型
	 */
	
	private String baogaoleixing;
		
	/**
	 * 文件附件
	 */
	
	private String wenjianfujian;
		
	/**
	 * 报告内容
	 */
	
	private String baogaoneirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 负责人账号
	 */
	
	private String fuzerenzhanghao;
		
	/**
	 * 负责人姓名
	 */
	
	private String fuzerenxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：报告名称
	 */
	 
	public void setBaogaomingcheng(String baogaomingcheng) {
		this.baogaomingcheng = baogaomingcheng;
	}
	
	/**
	 * 获取：报告名称
	 */
	public String getBaogaomingcheng() {
		return baogaomingcheng;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：报告类型
	 */
	 
	public void setBaogaoleixing(String baogaoleixing) {
		this.baogaoleixing = baogaoleixing;
	}
	
	/**
	 * 获取：报告类型
	 */
	public String getBaogaoleixing() {
		return baogaoleixing;
	}
				
	
	/**
	 * 设置：文件附件
	 */
	 
	public void setWenjianfujian(String wenjianfujian) {
		this.wenjianfujian = wenjianfujian;
	}
	
	/**
	 * 获取：文件附件
	 */
	public String getWenjianfujian() {
		return wenjianfujian;
	}
				
	
	/**
	 * 设置：报告内容
	 */
	 
	public void setBaogaoneirong(String baogaoneirong) {
		this.baogaoneirong = baogaoneirong;
	}
	
	/**
	 * 获取：报告内容
	 */
	public String getBaogaoneirong() {
		return baogaoneirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
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
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
