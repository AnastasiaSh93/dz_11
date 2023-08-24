package org.example;

public class Woman extends Person {
    private String maidenName;
    public Woman(String firstName, String lastName, int age, Person partner, String maidenName) {
        super(firstName, lastName, age, partner);
        this.maidenName = maidenName;
    }

    public String getMaidenName(){
        return maidenName;
    }

    @Override
    public boolean isRetired() {
        return age >= 60;
    }

    @Override
    public void registeredPartner(Person partner) {
        if(partner instanceof Man) {
            this.partner = partner;
            partner.partner = this;
            this.lastName = partner.lastName;
        }

    }

    @Override
    public void deregisterPartnership(boolean backLastname) {
        if(backLastname) {
            this.lastName = maidenName;
        }
        partner.partner = null;
        this.partner = null;
    }


}


