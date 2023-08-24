package org.example;

public class Man extends Person {
    public Man(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired() {
        return age >= 65;
    }

    @Override
    public void registeredPartner(Person partner) {
        if(partner instanceof Woman) {
            this.partner = partner;
            partner.partner = this;
            partner.lastName = this.lastName;
        }
    }

    @Override
    public void deregisterPartnership(boolean backLastname) {
        if(backLastname && partner instanceof Woman) {
            partner.lastName = ((Woman) partner).getMaidenName();
        }

        partner.partner = null;
        this.partner = null;

    }

}









