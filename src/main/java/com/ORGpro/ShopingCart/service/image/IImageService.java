package com.ORGpro.ShopingCart.service.image;

import com.ORGpro.ShopingCart.Dto.ImageDto;
import com.ORGpro.ShopingCart.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(Long productId, List<MultipartFile> files);
    void updateImage(MultipartFile file,  Long imageId);
}
