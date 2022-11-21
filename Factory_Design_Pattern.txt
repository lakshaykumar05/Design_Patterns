// Factory Design Pattern

#include <bits/stdc++.h>
using namespace std;

class Vehicle           // Abstract Class
{
public:
    virtual void startVehicle() = 0;
};


class Car : public Vehicle
{
public:

    void startVehicle()
    {
        cout<<"Car starts to run";
    }
};

class Bike : public Vehicle
{
public:

    void startVehicle()
    {
        cout<<"Bike starts to run";
    }
};

class Truck : public Vehicle
{
public:

    void startVehicle()
    {
        cout<<"Truck starts to run";
    }
};


class VehicleFactory
{
public:

    Vehicle* runVehicle(string vehicleType)
    {
        if(vehicleType == "Car")
            return new Car();
        else if(vehicleType == "Bike")
            return new Bike();
        else if(vehicleType == "Truck")
            return new Truck();
    }
};



int main()
{
    string vehicleType;

    cin>>vehicleType;

    VehicleFactory* vehicleFactory = new VehicleFactory();

    Vehicle* vehicle = vehicleFactory->runVehicle(vehicleType); 

    vehicle->startVehicle();

    return 0;
}
