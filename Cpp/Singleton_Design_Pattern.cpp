#include <bits/stdc++.h>
using namespace std;

class Singleton
{
private:
    static Singleton* obj;

    int val;

    Singleton() 
    {
        val = 0;
    }

public:

    static Singleton* getInstance()
    {
        if(obj == NULL)
            obj = new Singleton();

        return obj;
    }

    void setVal(int val)
    {
        this -> val = val;
    }

    int getVal()
    {
        return this -> val;
    }
}; 

Singleton* Singleton::obj = 0;



int main()
{
    Singleton* s = s -> getInstance();

    // cout<<s->getVal();

    s->setVal(53);

    cout<<s->getVal();

    cout<<"\n";

    Singleton* s1 = s1 -> getInstance();

    cout<<s1->getVal();
    
    return 0;
}