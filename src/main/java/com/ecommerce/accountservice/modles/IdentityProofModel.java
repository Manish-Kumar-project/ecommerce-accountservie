package com.ecommerce.accountservice.modles;

public class IdentityProofModel {
    private String typeOfProof;
    private String idNumber;

    public IdentityProofModel(String typeOfProof, String idNumber) {
        this.typeOfProof = typeOfProof;
        this.idNumber = idNumber;
    }

    public IdentityProofModel() {
    }

    public String getTypeOfProof() {
        return typeOfProof;
    }

    public void setTypeOfProof(String typeOfProof) {
        this.typeOfProof = typeOfProof;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "IdentityProofModel{" +
                "typeOfProof='" + typeOfProof + '\'' +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
