package com.example.store.product_image;


import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Service
public class ProductImageService {

    BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        return outputImage;
    }

}
