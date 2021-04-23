package com.demo.springboot.translation.mapper;

import com.demo.springboot.translation.common.domain.Collection;
import com.demo.springboot.translation.common.domain.CollectionExample;
import com.demo.springboot.translation.common.domain.CollectionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectionMapper {
    long countByExample(CollectionExample example);

    int deleteByExample(CollectionExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(CollectionWithBLOBs record);

    int insertSelective(CollectionWithBLOBs record);

    List<CollectionWithBLOBs> selectByExampleWithBLOBs(CollectionExample example);

    List<Collection> selectByExample(CollectionExample example);

    CollectionWithBLOBs selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") CollectionWithBLOBs record, @Param("example") CollectionExample example);

    int updateByExampleWithBLOBs(@Param("record") CollectionWithBLOBs record, @Param("example") CollectionExample example);

    int updateByExample(@Param("record") Collection record, @Param("example") CollectionExample example);

    int updateByPrimaryKeySelective(CollectionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CollectionWithBLOBs record);

    int updateByPrimaryKey(Collection record);
}