package com.designpattern.cases.structure.proxy.virtualproxy;

import java.net.URL;

public class ImageViewer {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://image.jpg");
        HighResolutionImage image = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(image);

        imageProxy.showImage();
    }
}
