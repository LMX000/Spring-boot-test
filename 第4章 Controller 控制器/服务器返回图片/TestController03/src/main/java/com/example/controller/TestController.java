package com.example.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class TestController {
    @RequestMapping("/image")
    @ResponseBody
    public void image(String massage, HttpServletResponse response)
    {
        // 创建宽 300，高 100 的缓冲图片
        BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();// 获取绘图对象
        g.setColor(Color.BLUE);// 画笔为蓝色
        g.fillRect(0, 0, 300, 100);// 覆盖图片的实心矩形
        g.setColor(Color.WHITE);// 画笔为白色
        g.setFont(new Font(" 宋体 ", Font.BOLD, 22));// 字体
        g.drawString(massage, 10, 50);// 将参数字符串绘制在指定坐标上
        try {
            ImageIO.write(image, "jpg", response.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
