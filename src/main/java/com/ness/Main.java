package com.ness;

import ij.ImagePlus;
import ij.io.FileSaver;
import ij.process.ImageProcessor;
import org.apache.commons.lang3.RandomStringUtils;
import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        ImagePlus image = new ImagePlus("src/pic/picture.jpg");
        ImageProcessor processor = image.getProcessor();
        processor.setColor(new Color(236, 9, 9)); // Set the text color
        processor.setFont(new Font("Arial", Font.PLAIN, 20)); // Set the font
        processor.drawString("Ness Academy 2023", 50, 50); // Add the text
        image.show();


        FileSaver fs = new FileSaver(image);
        fs.saveAsTiff("src/pic/new_picture.jpg");

    }
}