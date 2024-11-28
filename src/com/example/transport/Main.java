package com.example.transport;

public class Main {

    public static void main(String[] args) {

        TransportFactory electricFactory = new ElectricTransportFactory() ;
        Transport electricScooter = electricFactory.createScooter();
        Transport electricBike = electricFactory.createBike();

        electricScooter.ride();
        electricBike.ride();

        TransportFactory humanFactory = new HumanPoweredTransportFactory();
        Transport bicycle = humanFactory.createBike();
        Transport rollerSkates = humanFactory.createScooter() ;

        bicycle.ride();
        rollerSkates.ride();

    }

}