#include <bits/stdc++.h>
using namespace std;


class User
{
    int id;

public:

    User(int id)
    {
        this -> id = id;
    }

    void notify(string message)
    {
        cout<<"User "<<id<<" recieved "<<message<<"\n"; 
    }
};


class Group
{

    list < User* > Users;

public:

    void subscribe(User* user)
    {
        Users.push_back(user);
    }

    void unSubscribe(User* user)
    {
        Users.remove(user);
    }

    void notify(string message)
    {
        for(auto user : Users)
            user -> notify(message);
    }

};


int main()
{

    User* user1 = new User(1);
    User* user2 = new User(2);
    User* user3 = new User(3);

    Group* group = new Group();

    group -> subscribe(user1);
    group -> subscribe(user2);
    group -> subscribe(user3);

    group -> notify("First message");

    group -> unSubscribe(user1);

    group -> notify("Second message");

    return 0;
}