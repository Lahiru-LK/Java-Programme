package com.ictteck.Geometric;

import com.ictteck.resizable.Resizable;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius =  radius +(( radius * percent)/100.0);
    }
}
