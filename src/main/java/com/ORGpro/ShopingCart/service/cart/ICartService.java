package com.ORGpro.ShopingCart.service.cart;



import com.ORGpro.ShopingCart.Dto.CartDto;
import com.ORGpro.ShopingCart.model.Cart;
import com.ORGpro.ShopingCart.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);

    CartDto convertToDto(Cart cart);
}
