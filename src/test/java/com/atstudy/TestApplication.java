package com.atstudy;

import com.atstudy.entity.*;
import com.atstudy.entity.bo.AdminSearchBo;
import com.atstudy.entity.bo.PageBo;
import com.atstudy.entity.bo.UserSearchBo;
import com.atstudy.entity.vo.PermissionWithRoleVo;
import com.atstudy.mapper.*;
import com.atstudy.service.AdminService;
import com.atstudy.service.PermissionService;
import com.atstudy.service.RoleService;
import com.atstudy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@Slf4j
public class TestApplication {


    @Resource
    private AdminService adminService;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private MenuMapper menuMapper;

    @Resource
    private AdminMapper adminMapper;

    @Resource
    private RoleService roleService;


    @Resource
    private PermissionService permissionService;

    @Resource
    private PermissionMapper permissionMapper;


    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private CartMapper cartMapper;
    @Test
    public void testCartMapper(){
        List<Cart> carts = cartMapper.listBySearchBo(new UserSearchBo(), new PageBo());
        for (Cart cart : carts) {
            System.out.println(cart);
        }
    }
    @Test
    public void testOrderMapper(){
//        List<Order> orders = orderMapper.listBySearchBo(new UserSearchBo(), new PageBo());
//        for (Order order : orders) {
//            System.out.println(order);
//        }
        int count = orderMapper.getCount(new UserSearchBo());
        System.out.println(count);
    }
    @Test
    public void testUserMapper(){
        List<User> users = userMapper.listBySearchBo(new UserSearchBo(), new PageBo());
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test
    public void testUserService(){
//        List<User> users = userService.listUserBySearchBo(new UserSearchBo(), new PageBo());
//        for (User user : users) {
//            System.out.println(user);
//        }
//        List<Order> orders = userService.listOrderBySearchBo(new UserSearchBo(), new PageBo());
//        for (Order order : orders) {
//            System.out.println(order);
//        }

        List<Cart> carts = userService.listCartBySearchBo(new UserSearchBo(), new PageBo());
        for (Cart cart : carts) {
            System.out.println(cart);
        }
    }

    @Test
    public void testPermissionMapper(){
        List<PermissionWithRoleVo> list = permissionMapper.listVoWithRoleId(23);
        for (PermissionWithRoleVo permissionWithRoleVo : list) {
            System.out.println(permissionWithRoleVo);
        }
    }



    @Test
    public void testPermissionService(){
        List<Permission> list = permissionService.list();
        for (Permission permission : list) {
            System.out.println(permission);
        }
    }

    @Test
    public void  testRoleService(){
        boolean b = roleService.isNameExists("系统管理员");
        System.out.println(b);
    }


    @Test
    public void testAdminMapper(){
        Admin adminById = adminMapper.getAdminById(1);

    }


    @Test
    public void testMenuMapper(){
        List<Menu> menus = menuMapper.listByAdminId(2);
        for (Menu menu : menus) {
            log.info(menu.toString());
        }
    }


    @Test
    public void testRoleMapper(){



//        List<Role> list = roleMapper.listByuUrl("/userorder/admin");
//        for (Role role : list) {
//            System.out.println(role);
//        }
    }

    @Test
    public void  testAdminService(){
        UserDetails admin = adminService.loadUserByUsername("admin");
        System.out.println(admin);
    }
}
