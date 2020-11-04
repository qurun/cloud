package com.qf.cloud.dao;

import com.qf.cloud.common.dto.CartDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CartDao {
//    查询skuid 是否存在
    @Select("select * from t_cart where kuid=#{skuid} and uid=#{uid} limit 1")
    Cart queryByUid(CartDto dto);
    @Insert("insert into t_cart(skuid,uid,jprice,scount,ctime)values()")
    int insert(CartDto dto);
    int update(CartDto dto);
}
