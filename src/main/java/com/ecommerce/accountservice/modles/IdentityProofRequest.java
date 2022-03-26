package com.ecommerce.accountservice.modles;

public class IdentityProofRequest {
    private String typeOfProof;
    private String idNumber;

    public IdentityProofRequest() {
    }

    public IdentityProofRequest(String typeOfProof, String idNumber) {
        this.typeOfProof = typeOfProof;
        this.idNumber = idNumber;
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
        return "IdentityProofRequest{" +
                "typeOfProof='" + typeOfProof + '\'' +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
