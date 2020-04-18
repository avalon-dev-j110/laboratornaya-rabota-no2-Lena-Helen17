/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.shapes;

/**
 *
 * @author Professional
 */
public class PointClass implements Point{
    private float tochkaX;
    private float tochkaY;


    public PointClass(float tochka1X, float tochka1Y) {
        this.tochkaX = tochka1X;
        this.tochkaY = tochka1Y;

        
    }


    @Override
    public float getX() {
    return tochkaX;
    }

    @Override
    public float getY() {
    return tochkaY;
    }
    

}
