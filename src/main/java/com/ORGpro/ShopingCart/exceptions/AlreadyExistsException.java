package com.ORGpro.ShopingCart.exceptions;


public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String message) {
        super(message);
    }
}