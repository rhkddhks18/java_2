package org.example;

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.speed = 80;
        car1.model = "k5";
        System.out.println(car1.speed);
        System.out.println(car1.accel());
        System.out.println(car1.model + "가 최고속력 " + car1.speed + "km로 " + car1.accel());

        Car car2 = new Car();
        car2.speed = 100;
        car2.model = "k9";
        System.out.println(car2.speed);
        System.out.println(car2.accel());
        System.out.println(car2.model + "가 최고속력 " + car2.speed + "km로 " + car2.fly());
    }
}
