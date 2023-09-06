/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversor;

/**
 *
 * @author Steven
 */
public class Moneda {
    private double valorEnColones;
    private double valorMoneda;
    private String nombre;

    public Moneda(double valorEnColones,double valorMoneda, String nombre){
        this.valorEnColones = valorEnColones;
        this.valorMoneda = valorMoneda;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValorMoneda() {
        return valorMoneda;
    }

    public void setValorMoneda(double valorMoneda) {
        this.valorMoneda = valorMoneda;
    }

    public double getValorEnColones() {
        return valorEnColones;
    }

    public void setValorEnColones(double valorEnColones) {
        this.valorEnColones = valorEnColones;
    }
}