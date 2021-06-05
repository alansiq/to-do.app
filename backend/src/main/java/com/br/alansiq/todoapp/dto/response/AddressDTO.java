package com.br.alansiq.todoapp.dto.response;

public class AddressDTO {
    private String streetName;
    private String zipCode;
    private int number;

    public AddressDTO(String streetName, String zipCode, int number) {
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
