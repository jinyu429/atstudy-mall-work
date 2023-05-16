package com.atstudy.controller;

import com.atstudy.entity.UserFavorite;
import com.atstudy.entity.bo.PageBo;
import com.atstudy.entity.bo.UserSearchBo;
import com.atstudy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/favorite")
public class UserFavoriteController {

    @Resource
    private UserService userService;
    @RequestMapping("/admin")
    public String admin(UserSearchBo searchBo, PageBo pageBo, Model model){

        List<UserFavorite> userFavoriteList = userService.listUserFavoriteBySearchBo(searchBo, pageBo);

        model.addAttribute("pageBo",pageBo);
        model.addAttribute("userFavoriteList",userFavoriteList);
        model.addAttribute("searchBo",searchBo);

        return "favorite/admin";
    }

}
