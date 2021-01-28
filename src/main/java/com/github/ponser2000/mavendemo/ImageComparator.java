package com.github.ponser2000.mavendemo;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import java.awt.image.BufferedImage;

/**
 * @author Sergey Ponomarev on 28.01.2021
 * @project maven-demo/com.github.ponser2000.mavendemo
 */
public class ImageComparator {

  public boolean isTheSameImages(BufferedImage image1, BufferedImage image2){

    ImageComparison imageComparison = new ImageComparison(image1, image2);
    ImageComparisonResult imageComparisonResult = imageComparison.compareImages();

    return ImageComparisonState.MATCH == imageComparisonResult.getImageComparisonState();
  }
}
