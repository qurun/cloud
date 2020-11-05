package com.qf.cloud.Service.intf;

import com.qf.cloud.common.dto.CartDelDto;
import com.qf.cloud.common.dto.CartDto;
import com.qf.cloud.common.dto.CartItemDto;
import com.qf.cloud.common.dto.CartItemRedisDto;
import com.qf.cloud.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;

public interface CartService {
//    加入购物车
    R addJoinJoinCartV1(CartDto dto);
//    数量增加
    R plusCountV1(CartItemDto dto);
//    数量减少
    R minCountV1(CartItemDto dto);
//    删除
    R delCart(int id);
//    全部
    R all(int uid);
//加入购物车
    R addJoinCartV2(CartDto dto);
//  数量增加
    R plusCountV2(CartDto dto);
//    数量减少
    R minusCountV2(CartItemRedisDto dto);
//    删除
    R delCartV2(CartDelDto dto);
}
