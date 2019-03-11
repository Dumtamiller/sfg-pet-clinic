package com.example.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {
    private PetType petType;

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        int i;
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType(){
        return petType;
    }
}


