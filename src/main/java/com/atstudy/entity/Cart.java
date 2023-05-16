package com.atstudy.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
public class Cart {

    @TableId
    private Integer carId;
    private Integer cartUserid;
    private BigInteger cartSpuid;
    private Integer cartSkuid;
    private String cartName;
    private String cartThumburl;
    private BigDecimal cartPrice;
    private Integer cartCount;
    private Byte cartChecked;
    private LocalDateTime createtime;
    private LocalDateTime updatetime;
    private String cartSku;

}
