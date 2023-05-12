package com.atstudy.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Order {

    @TableId
    private Integer id;
    private String orderNo;
    private Integer orderStatus;
    private BigDecimal orderSpuamount;
    private BigDecimal orderExpressfee;
    private BigDecimal orderTotalamount;
    private BigDecimal orderDiscountamount;
    private BigDecimal orderPayamount;
    private Integer orderPaymode;
    private Integer orderPayplatform;
    private String orderIpaddress;
    private String orderPaymentno;
    private String orderRemark;
    private LocalDateTime createtime;
    private LocalDateTime updatetime;
    private Integer orderUserId;


}
