/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication103;

/**
 *
 * @author dda
 */
public class Hotel {

public class Room  {

    protected String name, idRoom, status;
    protected int priceRoom;
    protected double discountRoom, discount, price;

    public Room(String name, int priceRoom, String idRoom, String status) {
        this.name = name;
        this.priceRoom = priceRoom;
        this.idRoom = idRoom;
        this.status = status;
    }

    public int setPrice(int x) {
        if (x >= 0 && x <= 9) {
            discountRoom = 0;
        } else if (x >= 10 && x <= 30) {
            discountRoom = 0.1;
        } else if (x >= 31 && x <= 60) {
            discountRoom = 0.15;
        } else {
            discountRoom = 0.25;
        }
        discount = +getPriceRoom() * discountRoom;
        price = +getPriceRoom() * x - discount;
        return (int) price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriceRoom() {
        return priceRoom;
    }

    public double getDiscount() {
        return discount;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("   " + getIdRoom() + "       " + getStatus());
    }

}

}
