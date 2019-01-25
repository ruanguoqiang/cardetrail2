package com.genaratexml;

import java.util.List;

import com.common.pojo.ItemCar;
import com.common.pojo.ItemCarExample;
import org.apache.ibatis.annotations.Param;

public interface ItemCarMapper {
    int countByExample(ItemCarExample example);

    int deleteByExample(ItemCarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemCar record);

    int insertSelective(ItemCar record);

    List<ItemCar> selectByExample(ItemCarExample example);

    ItemCar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemCar record, @Param("example") ItemCarExample example);

    int updateByExample(@Param("record") ItemCar record, @Param("example") ItemCarExample example);

    int updateByPrimaryKeySelective(ItemCar record);

    int updateByPrimaryKey(ItemCar record);
}