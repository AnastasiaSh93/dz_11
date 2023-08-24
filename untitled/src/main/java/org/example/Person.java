package org.example;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected Person partner;

    public Person(String firstName, String lastName, int age, Person partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;


    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public String getLastName(){
        return lastName;
    }


    abstract boolean isRetired();
    abstract void registeredPartner(Person partner);
    abstract void deregisterPartnership(boolean backLastname);



}


