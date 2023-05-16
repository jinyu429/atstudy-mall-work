package com.atstudy.controller;

import com.atstudy.entity.Cart;
import com.atstudy.entity.bo.PageBo;
import com.atstudy.entity.bo.UserSearchBo;
import com.atstudy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Resource
    private UserService userService;
    @RequestMapping("/admin")
    public String admin(UserSearchBo searchBo, PageBo pageBo, Model model){

        List<Cart> cartList = userService.listCartBySearchBo(searchBo, pageBo);

        model.addAttribute("pageBo",pageBo);
        model.addAttribute("cartList",cartList);
        model.addAttribute("searchBo",searchBo);
        return "cart/admin";
    }
}
