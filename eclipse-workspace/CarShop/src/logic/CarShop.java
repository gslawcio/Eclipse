/**
 * @author slawcio
 *
 */
package logic;

import data.Car;

public class CarShop {
    public static void main(String[] args) {
    	
        Car audiA5 = new Car(2018, "Audi", "A5", "Czarne");

        System.out.println(audiA5.getBrand() + " " + audiA5.getModel() + " " + audiA5.getYear() + " " + audiA5.getColor());
    }
}