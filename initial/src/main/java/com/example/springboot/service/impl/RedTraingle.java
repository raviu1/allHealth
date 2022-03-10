package com.example.springboot.service.impl;

import com.example.springboot.service.IColoredShape;
import org.springframework.stereotype.Service;

@Service
public class RedTraingle implements IColoredShape {

    @Override
    public String getShape() {
        return "Yellow Rectangle";
    }
}