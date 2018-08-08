package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌
 * @author 大白猫😀😀😀小地瓜
 *
 */
public interface BrandService {


	public List<TbBrand> findAll();


	/**
	 * 品牌分页
	 * @param pageNum  当前页面
	 * @param pageSize  页面大小
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);

	/**
	 * 添加品牌
	 * @param tbBrand
	 */
	public void add(TbBrand tbBrand);
	
	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	
	
	/**
	 * 修改结果存入
	 * @param tbBrand
	 */
	public void update(TbBrand tbBrand);
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);
	
	
	
	/**
	 * 按照条件查询
	 * @param brand
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(TbBrand brand,int pageNum,int pageSize);

	
	
	
	
}
