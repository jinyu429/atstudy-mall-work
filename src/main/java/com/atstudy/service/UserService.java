package com.atstudy.service;

import com.atstudy.entity.Cart;
import com.atstudy.entity.Order;
import com.atstudy.entity.User;
import com.atstudy.entity.UserFavorite;
import com.atstudy.entity.bo.PageBo;
import com.atstudy.entity.bo.UserSearchBo;

import java.util.List;

public interface UserService {

    /**
     * 根据筛选条件查询客户信息
     * @param searchBo
     * @param pageBo
     * @return
     */
    List<User> listUserBySearchBo(UserSearchBo searchBo, PageBo pageBo);

    /**
     * 根据筛选条件查询订单信息
     * @param searchBo
     * @param pageBo
     * @return
     */
    List<Order> listOrderBySearchBo(UserSearchBo searchBo,PageBo pageBo);

    /**
     * 根据筛选条件查询客户预购信息
     * @param searchBo
     * @param pageBo
     * @return
     */
    List<Cart> listCartBySearchBo(UserSearchBo searchBo,PageBo pageBo);

    /**
     * 根据筛选条件查询客户收藏信息
     * @param searchBo
     * @param pageBo
     * @return
     */
    List<UserFavorite> listUserFavoriteBySearchBo(UserSearchBo searchBo, PageBo pageBo);
}
