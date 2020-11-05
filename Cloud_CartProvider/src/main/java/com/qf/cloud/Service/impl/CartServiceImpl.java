package com.qf.cloud.Service.impl;

import com.qf.cloud.Service.intf.CartService;
import com.qf.cloud.common.dto.CartDelDto;
import com.qf.cloud.common.dto.CartDto;
import com.qf.cloud.common.dto.CartItemDto;
import com.qf.cloud.common.dto.CartItemRedisDto;
import com.qf.cloud.common.vo.R;

public class CartServiceImpl implements CartService {
    @Override
    public R addJoinJoinCartV1(CartDto dto) {
        return null;
    }

    @Override
    public R plusCountV1(CartItemDto dto) {
        return null;
    }

    @Override
    public R minCountV1(CartItemDto dto) {
        return null;
    }

    @Override
    public R delCart(int id) {
        return null;
    }

    @Override
    public R all(int uid) {
        return null;
    }

    @Override
    public R addJoinCartV2(CartDto dto) {
        return null;
    }

    @Override
    public R plusCountV2(CartDto dto) {
        return null;
    }

    @Override
    public R minusCountV2(CartItemRedisDto dto) {
        return null;
    }

    @Override
    public R delCartV2(CartDelDto dto) {
        return null;
    }
}
