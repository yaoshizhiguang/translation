package com.demo.springboot.translation.mapper;

import com.demo.springboot.translation.common.domain.History;
import com.demo.springboot.translation.common.domain.HistoryExample;
import com.demo.springboot.translation.common.domain.HistoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryMapper {
    long countByExample(HistoryExample example);

    int deleteByExample(HistoryExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(HistoryWithBLOBs record);

    int insertSelective(HistoryWithBLOBs record);

    List<HistoryWithBLOBs> selectByExampleWithBLOBs(HistoryExample example);

    List<History> selectByExample(HistoryExample example);

    HistoryWithBLOBs selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") HistoryWithBLOBs record, @Param("example") HistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") HistoryWithBLOBs record, @Param("example") HistoryExample example);

    int updateByExample(@Param("record") History record, @Param("example") HistoryExample example);

    int updateByPrimaryKeySelective(HistoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HistoryWithBLOBs record);

    int updateByPrimaryKey(History record);
}