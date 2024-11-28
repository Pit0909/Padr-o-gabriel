package com.example.transport;

public class HumanPoweredTransportFactory extends TransportFactory {
    @Override

    public Transport createScooter() {
        return new RollerSkates();

    }

    @Override

    public Transport createBike() {
        return new Bicycle();

    }

}