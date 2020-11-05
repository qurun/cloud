package com.qf.cloud.common.config;

/**
 * @program: CloudLike
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-11-02 11:08
 */
public class RedisKeyConfig {
    //记录点赞的内容  ZSet
    public static String LIKE_CID="like:";//cit
    //点赞热点数据 有效期3个月
    public static int LIKE_TIME=90;


    //购物车相关
    public static String CART_UID="cart:user:";//uid
    //购物车数据 有效期24小时
    public static int CART_TIME=24;
}
