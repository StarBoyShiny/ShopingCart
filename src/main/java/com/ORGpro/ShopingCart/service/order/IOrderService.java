package com.ORGpro.ShopingCart.service.order;


import com.ORGpro.ShopingCart.Dto.OrderDto;
import com.ORGpro.ShopingCart.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
