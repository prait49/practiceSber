package org.example.ObjectStreamsSerialisation;

import java.io.Serializable;
import java.util.List;

public class Clients implements Serializable {

    private String name;
    private ContactPerson contactPerson;
    private List<Requisites> requisites;

    public Clients(String name, ContactPerson contactPerson, List<Requisites> requisites) {
        this.name = name;
        this.contactPerson = contactPerson;
        this.requisites = requisites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    public List<Requisites> getRequisites() {
        return requisites;
    }

    public void setRequisites(List<Requisites> requisites) {
        this.requisites = requisites;
    }

    @Override
    public String toString() {
        return name + ", " + contactPerson.getName() + ", " + requisites.toString();
    }


}
