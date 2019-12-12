package com.devinlee.mybatisgeneratordemo.mapper;

import com.devinlee.mybatisgeneratordemo.entity.SysMenu;
import java.util.List;
import java.util.Map;

public interface SysMenuMapper {
    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByMap(Map<String, Object> params);

    int updateByMap(Map<String, Object> params);
}