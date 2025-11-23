package com.ORGpro.ShopingCart.repository;


import com.ORGpro.ShopingCart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}
