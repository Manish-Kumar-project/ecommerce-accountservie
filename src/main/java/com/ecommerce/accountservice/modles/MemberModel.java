package com.ecommerce.accountservice.modles;

import com.ecommerce.accountservice.Entities.IdentityProof;

import java.util.List;

public class MemberModel {
    private Integer memberId;
    private String firstName;
    private String lastName;
    private String createdDate;
    private String area;
    private String street;
    private List<AddressModel> listOfAddress;
    private List<IdentityProofModel> listOfIdProofs;

    public MemberModel(Integer memberId, String firstName, String lastName, String createdDate, String area, String street, List<AddressModel> listOfAddress, List<IdentityProofModel> listOfIdProofs) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdDate = createdDate;
        this.area = area;
        this.street = street;
        this.listOfAddress = listOfAddress;
        this.listOfIdProofs = listOfIdProofs;
    }

    public MemberModel() {
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public List<AddressModel> getListOfAddress() {
        return listOfAddress;
    }

    public void setListOfAddress(List<AddressModel> listOfAddress) {
        this.listOfAddress = listOfAddress;
    }

    public List<IdentityProofModel> getListOfIdProofs() {
        return listOfIdProofs;
    }

    public void setListOfIdProofs(List<IdentityProofModel> listOfIdProofs) {
        this.listOfIdProofs = listOfIdProofs;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "MemberModel{" +
                "memberId=" + memberId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", listOfAddress=" + listOfAddress +
                ", listOfIdProofs=" + listOfIdProofs +
                '}';
    }
}
