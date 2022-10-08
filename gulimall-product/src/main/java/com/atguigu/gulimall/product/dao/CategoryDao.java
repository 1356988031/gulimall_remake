package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wushubin
 * @email 1356988031@qq.com
 * @date 2022-09-29 09:09:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
