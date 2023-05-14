package com.ictec.geometric;

import com.ictec.resize.Resizable;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * ((100+percent)/100.0);

    }
}
