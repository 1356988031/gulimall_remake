package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wushubin
 * @email 1356988031@qq.com
 * @date 2022-09-27 12:40:23
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
