package com.ORGpro.ShopingCart.service.product;

import com.ORGpro.ShopingCart.Dto.ProductDto;
import com.ORGpro.ShopingCart.model.Product;
import com.ORGpro.ShopingCart.request.AddProductRequest;
import com.ORGpro.ShopingCart.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService  {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);

    List<Product> findDistinctProductsByName();

    List<String> getAllDistinctBrands();
}
