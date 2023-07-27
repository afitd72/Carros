/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udem.cars.entity;

/**
 *
 * @author b12s309
 */
public class Txl extends Toyota{ // estamos diciendo que esta clase es huja de la toyota es decir que el padre o la marca es toyota, y como se implemeta la intrface debemos de implementar los metodos
    private String color;
    private String placa;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Txl(String color, String placa) {
        this.color = color;
        this.placa = placa;
    }

    @Override
    public void mover() { // es el meotdo de la intrface que fue herredado
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
