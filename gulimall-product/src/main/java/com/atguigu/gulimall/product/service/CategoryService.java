package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wushubin
 * @email 1356988031@qq.com
 * @date 2022-09-29 09:09:38
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 利用递归查询 查询每个父子分类菜单
     * @return
     */
    List<CategoryEntity> listWithTree();

    /**
     * 删除当前分类，如果存在子分类则不能删除
     * @param asList
     */
    void removeMenuByIds(List<Long> asList);
}

