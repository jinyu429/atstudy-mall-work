package com.atstudy.mapper;

import com.atstudy.entity.Cart;
import com.atstudy.entity.UserFavorite;
import com.atstudy.entity.bo.PageBo;
import com.atstudy.entity.bo.UserSearchBo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserFavoriteMapper extends BaseMapper {

    /**
     * 根据筛选条件擦查询订购信息
     * @param searchBo
     * @param pageBo
     * @return
     */
    List<UserFavorite> listBySearchBo(@Param("searchBo") UserSearchBo searchBo, PageBo pageBo);

    /**
     * 根据筛选条件查询出满足条件的总记录数
     * @param searchBo
     * @return
     */
    int getCount(@Param("searchBo") UserSearchBo searchBo);

}
