package com.ecommerce.accountservice.Entities;

import javax.persistence.*;

@Entity
public class IdentityProof {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressId")
    private Integer identityProofId;
    private String typeOfProof;
    private String idNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "proofId")
    private Member member;

    public IdentityProof() {
    }

    public IdentityProof(String typeOfProof, String idNumber, Member member) {
        this.typeOfProof = typeOfProof;
        this.idNumber = idNumber;
        this.member = member;
    }

    public IdentityProof(Integer identityProofId, String typeOfProof, String idNumber, Member member) {
        this.identityProofId = identityProofId;
        this.typeOfProof = typeOfProof;
        this.idNumber = idNumber;
        this.member = member;
    }

    public Integer getIdentityProofId() {
        return identityProofId;
    }

    public void setIdentityProofId(Integer identityProofId) {
        this.identityProofId = identityProofId;
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

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
