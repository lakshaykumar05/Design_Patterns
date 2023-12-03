#include <bits/stdc++.h>
using namespace std;

// Abstract Factory Design Pattern (One level above Factory Design Pattern)

class AdmitCard  // ABstract Class
{
public:

    virtual void show() = 0;
};

class Fee        // ABstract Class
{
public:

    virtual void printFee() = 0;
};

class Info      // ABstract Class
{
public:

    virtual AdmitCard* getAdmitCard(string) = 0;
    virtual Fee* getFeeCalculator(string) = 0;
};

// Admit Card begin

class DelhiAdmitCard : public AdmitCard
{
public:

    void show()
    {
        cout<<"DELHI ADMIT CARD";
    }
};


class KanpurAdmitCard : public AdmitCard
{
public:

    void show()
    {
        cout<<"KANPUR ADMIT CARD";
    }
};

class kietAdmitCard : public AdmitCard
{
public:

    void show()
    {
        cout<<"KIET ADMIT CARD";
    }
};

class jssAdmitCard : public AdmitCard
{
public:

    void show()
    {
        cout<<"JSS ADMIT CARD";
    }
};

// Admit Card over

// Fee begin

class DelhiFeeCalculator : public Fee
{
public:

    void printFee()
    {
        cout<<"DELHI FEE";
    }
};


class KanpurFeeCalculator : public Fee
{
public:
    
    void printFee()
    {
        cout<<"KANPUR FEE";
    }
};

class kietFeeCalculator : public Fee
{
public:
    
    void printFee()
    {
        cout<<"KIET FEE";
    }
};

class jssFeeCalculator : public Fee
{
public:
    
    void printFee()
    {
        cout<<"JSS FEE";
    }
};

// Fee ends


class IIT : public Info
{
public:

    AdmitCard* getAdmitCard(string course)
    {
        if(course == "CSE")
            return new DelhiAdmitCard();
        else if(course == "IT")
            return new KanpurAdmitCard();
    }

    Fee* getFeeCalculator(string course)
    {
        if(course == "CSE")
            return new DelhiFeeCalculator();
        else if(course == "IT")
            return new KanpurFeeCalculator();
    }
};

class AKTU : public Info
{
public:

    AdmitCard* getAdmitCard(string course)
    {
        if(course == "CSE")
            return new kietAdmitCard();
        else if(course == "IT")
            return new jssAdmitCard();
    }

    Fee* getFeeCalculator(string course)
    {
        if(course == "CSE")
            return new kietFeeCalculator();
        else if(course == "IT")
            return new jssFeeCalculator();
    }
};


class UniversityFactory  // Factory above another factory(IIT / AKTU)
{
public:

    int cutOff = 100;

    Info* getUniversity(int marks)
    {
        if(marks > cutOff)	
            return new IIT();
        else
            return new AKTU();
    }

};


int main()
{

    UniversityFactory univFactory;

    Info* univ = univFactory.getUniversity(15);

    univ -> getFeeCalculator("CSE") -> printFee();

    cout<<"\n";
    
    univ -> getAdmitCard("CSE") -> show();

    return 0;
}