package cn.ggx.dao;

import cn.ggx.entity.ToolsType;

import java.util.List;

public interface ToolsTypeDao {

    int addToolsTypes(List<ToolsType> list);

    List<ToolsType> findToolsTypeAll();

    List<ToolsType> findToolsTypeByIds(List<Integer> list);
}
