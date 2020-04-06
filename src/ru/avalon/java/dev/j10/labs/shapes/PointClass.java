/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.shapes;

import sun.net.www.content.image.gif;

/**
 *
 * @author Professional
 */
public abstract class PointClass implements Point{
    private float tochka1X;
    private float tochka1Y;
    private float tochka2X;
    private float tochka2Y;

    public PointClass(float tochka1X, float tochka1Y, float tochka2X, float tochka2Y) {
        this.tochka1X = tochka1X;
        this.tochka1Y = tochka1Y;
        this.tochka2X = tochka2X;
        this.tochka2Y = tochka2Y;
        
    }

    public float getTochka1X() {
        return tochka1X;
    }

    public float getTochka1Y() {
        return tochka1Y;
    }

    public float getTochka2X() {
        return tochka2X;
    }

    public float getTochka2Y() {
        return tochka2Y;
    }

    @Override
    public float getX(float x1, float x2) {
    return Math.abs(x2-x1);
    }

    @Override
    public float getY(float y1, float y2) {
    return Math.abs(y2-y1);
    }
    
    public float getLengthLine (float getX, float getY) {
        return (float)Math.sqrt((getX * getX + getY * getY));
    }

    
}
