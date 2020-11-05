package com.qf.cloud.common.dto;

import lombok.Data;

/**
 * @program: CloudLike
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-11-04 10:25
 */
@Data
public class CartItemDto {
    private int id;
    private int count;//+ 正数  - 负数
}
