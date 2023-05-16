package com.atstudy.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class UserFavorite {


    @TableId
     private Integer ufavorId;
     private String ufavorName;
     private String ufavorThumburl;
     private BigDecimal ufavorPrice;
     private LocalDateTime createtime;
     private LocalDateTime updatetime;
     private String ufavorSku;
     private Integer ufavorSpuId;
     private Integer ufavorUserId;


}
