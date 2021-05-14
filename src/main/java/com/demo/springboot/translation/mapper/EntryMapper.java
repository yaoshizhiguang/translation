package com.demo.springboot.translation.mapper;

import com.demo.springboot.translation.common.domain.Entry;
import com.demo.springboot.translation.common.domain.EntryExample;
import com.demo.springboot.translation.common.domain.EntryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntryMapper {
    long countByExample(EntryExample example);

    int deleteByExample(EntryExample example);

    int deleteByPrimaryKey(Integer entryId);

    int insert(EntryWithBLOBs record);

    int insertSelective(EntryWithBLOBs record);

    List<EntryWithBLOBs> selectByExampleWithBLOBs(EntryExample example);

    List<Entry> selectByExample(EntryExample example);

    EntryWithBLOBs selectByPrimaryKey(Integer entryId);

    int updateByExampleSelective(@Param("record") EntryWithBLOBs record, @Param("example") EntryExample example);

    int updateByExampleWithBLOBs(@Param("record") EntryWithBLOBs record, @Param("example") EntryExample example);

    int updateByExample(@Param("record") Entry record, @Param("example") EntryExample example);

    int updateByPrimaryKeySelective(EntryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EntryWithBLOBs record);

    int updateByPrimaryKey(Entry record);
}