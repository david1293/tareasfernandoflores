/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoFinal;

import java.io.serializable;

public class Cuenta extends serializable {
    String nombre; 
    int numero; 
    float saldo;

    public Cuenta() {
    }
    
    public Cuenta(String nombre, int numero, float saldo) {
        this.nombre = nombre;
        this.numero= numero;
        this.saldo = saldo;
    }

   

    @Override
    public String toString() {
        return "ProyectoFinal{" + "nombre=" + getNombre() + ", numero=" + getNumero() + ", saldo=" + getSaldo() + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    
}
}
