package com.atstudy.service.impl;

import com.atstudy.entity.Cart;
import com.atstudy.entity.Order;
import com.atstudy.entity.User;
import com.atstudy.entity.UserFavorite;
import com.atstudy.entity.bo.PageBo;
import com.atstudy.entity.bo.UserSearchBo;
import com.atstudy.mapper.CartMapper;
import com.atstudy.mapper.OrderMapper;
import com.atstudy.mapper.UserFavoriteMapper;
import com.atstudy.mapper.UserMapper;
import com.atstudy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private CartMapper cartMapper;
    @Resource
    private UserFavoriteMapper favoriteMapper;

    @Override
    public List<User> listUserBySearchBo(UserSearchBo searchBo, PageBo pageBo) {
        // 查询出满足条件的总记录数，赋值给pgeBo
        int count = userMapper.getCount(searchBo);
        pageBo.setResultCount((long) count);

        // 查询满足条件的客户信息
        List<User> users = userMapper.listBySearchBo(searchBo, pageBo);
        return users;
    }

    @Override
    public List<Order> listOrderBySearchBo(UserSearchBo searchBo, PageBo pageBo) {
        // 查询出满足条件的总记录数，赋值给pgeBo
        int count = orderMapper.getCount(searchBo);
        pageBo.setResultCount((long) count);

        // 查询满足条件的订单信息
        List<Order> orders = orderMapper.listBySearchBo(searchBo, pageBo);
        return orders;
    }

    @Override
    public List<Cart> listCartBySearchBo(UserSearchBo searchBo, PageBo pageBo) {
        // 查询出满足条件的总记录数，赋值给pgeBo
        int count = cartMapper.getCount(searchBo);
        pageBo.setResultCount((long) count);
        // 查询满足条件的订购信息
        List<Cart> carts = cartMapper.listBySearchBo(searchBo, pageBo);
        return carts;
    }

    @Override
    public List<UserFavorite> listUserFavoriteBySearchBo(UserSearchBo searchBo, PageBo pageBo) {
        // 查询出满足条件的总记录数，赋值给pgeBo
        int count = favoriteMapper.getCount(searchBo);
        pageBo.setResultCount((long) count);
        // 查询满足条件的订购信息
        List<UserFavorite> userFavorites = favoriteMapper.listBySearchBo(searchBo, pageBo);

        return userFavorites;
    }


}
