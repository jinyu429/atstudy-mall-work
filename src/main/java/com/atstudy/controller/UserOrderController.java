package com.atstudy.controller;

import com.atstudy.entity.Order;
import com.atstudy.entity.bo.PageBo;
import com.atstudy.entity.bo.UserSearchBo;
import com.atstudy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/userorder")
public class UserOrderController {
    @Resource
    private UserService userService;

    @RequestMapping("/admin")
    public String admin(UserSearchBo userSearchBo, PageBo pageBo, Model model){

        List<Order> orderList = userService.listOrderBySearchBo(userSearchBo,pageBo);


        model.addAttribute("pageBo",pageBo);
        model.addAttribute("orderList",orderList);
        model.addAttribute("searchBo",userSearchBo);
        return "userorder/admin";
    }
}
