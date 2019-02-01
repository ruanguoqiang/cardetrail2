package com.genaratexml;

import com.common.pojo.StockOut;
import com.common.pojo.StockOutExample;
import com.common.pojo.StockOutKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockOutMapper {
    int countByExample(StockOutExample example);

    int deleteByExample(StockOutExample example);

    int deleteByPrimaryKey(StockOutKey key);

    int insert(StockOut record);

    int insertSelective(StockOut record);

    List<StockOut> selectByExampleWithBLOBs(StockOutExample example);

    List<StockOut> selectByExample(StockOutExample example);

    StockOut selectByPrimaryKey(StockOutKey key);

    int updateByExampleSelective(@Param("record") StockOut record, @Param("example") StockOutExample example);

    int updateByExampleWithBLOBs(@Param("record") StockOut record, @Param("example") StockOutExample example);

    int updateByExample(@Param("record") StockOut record, @Param("example") StockOutExample example);

    int updateByPrimaryKeySelective(StockOut record);

    int updateByPrimaryKeyWithBLOBs(StockOut record);

    int updateByPrimaryKey(StockOut record);
}