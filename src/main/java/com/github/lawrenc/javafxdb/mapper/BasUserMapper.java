package com.github.lawrenc.javafxdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.lawrenc.javafxdb.domain.BasUser;
import org.apache.ibatis.annotations.Mapper;

// 1、Dao 层 Mapper 接口，继承 mp 的 BaseMapper<T> 后，无需编写 mapper.xml 文件，即可获得CRUD功能
@Mapper
public interface BasUserMapper extends BaseMapper<BasUser> {
}