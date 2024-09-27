package com.cl.dao;

import com.cl.entity.DiscusszhilixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusszhilixinxiView;


/**
 * 治理信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-01-16 08:56:07
 */
public interface DiscusszhilixinxiDao extends BaseMapper<DiscusszhilixinxiEntity> {
	
	List<DiscusszhilixinxiView> selectListView(@Param("ew") Wrapper<DiscusszhilixinxiEntity> wrapper);

	List<DiscusszhilixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhilixinxiEntity> wrapper);
	
	DiscusszhilixinxiView selectView(@Param("ew") Wrapper<DiscusszhilixinxiEntity> wrapper);
	

}