package com.ecommerce.accountservice.service;

import com.ecommerce.accountservice.Entities.Address;
import com.ecommerce.accountservice.Entities.IdentityProof;
import com.ecommerce.accountservice.Entities.Member;
import com.ecommerce.accountservice.modles.AddressModel;
import com.ecommerce.accountservice.modles.AddressRequest;
import com.ecommerce.accountservice.modles.IdentityProofModel;
import com.ecommerce.accountservice.modles.IdentityProofRequest;
import com.ecommerce.accountservice.repository.AddressRepository;
import com.ecommerce.accountservice.repository.MemberRepository;
import com.ecommerce.accountservice.repository.impl.MemberRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private MemberRepositoryImp memberRepositoryImp;

    public Member saveMember(Member member) {
        Member member1 = new Member();
        member1.setFirstName(member.getFirstName());
        member1.setMemberId(member.getMemberId());
        member1.setLastName(member.getLastName());
        member1.setEmail(member.getEmail());
        member1.setPhone(member.getPhone());
        member1.setSecondaryPhone(member.getSecondaryPhone());
        member1.setDateOfBirth(member.getDateOfBirth());
        member1.setGender(member.getGender());
        member1.setCreatedDate(new Date());

//		Address address = new Address("test","test",member);
//		Address address1 = new Address("aa","bb",member);
        List<Address> addresses = new ArrayList<>();
        List<IdentityProof> proofs = new ArrayList<>();
//		addresses.
        for (Address address : member.getListOfAddress()) {
            Address address1 = new Address(address.getStreet(), address.getColony(), member1);
            addresses.add(address1);
        }
        for (IdentityProof proof : member.getListOfIdentityProof()) {
            IdentityProof idProof = new IdentityProof(proof.getTypeOfProof(), proof.getIdNumber(), member1);
            proofs.add(idProof);
        }

//		addresses.add(address1);
        member1.setListOfAddress(addresses);
        member1.setListOfIdentityProof(proofs);
        memberRepository.save(member1);
        return member1;
    }


    public void addAddress(List<Address> addresses) {
        List<Member> all = memberRepository.findAll();
        List<Address> memberAddress = new ArrayList<>();
        Member member = memberRepository.findByMemberId(1080);
        Member member1 = new Member();
        member1.setMemberId(member.getMemberId());
        member1.setFirstName(member.getFirstName());
        member1.setLastName(member.getLastName());
        member1.setEmail(member.getEmail());
        member1.setPhone(member.getPhone());
        member1.setSecondaryPhone(member.getSecondaryPhone());
        member1.setDateOfBirth(member.getDateOfBirth());
        member1.setGender(member.getGender());
        member1.setId(member.getId());
        for (Address address : addresses) {
            Address address1 = new Address(address.getStreet(), address.getColony(), member1);
            memberAddress.add(address1);
        }
        member1.setListOfAddress(memberAddress);
        //    addressRepository.saveAll(addresses);
        memberRepository.save(member1);

    }

    public void addIdentityPrrof(List<IdentityProof> proofs) {
        List<Member> all = memberRepository.findAll();
        List<IdentityProof> identityProofs = new ArrayList<>();
        Member member = memberRepository.findByMemberId(2008);
        Member member1 = new Member();
        member1.setMemberId(member.getMemberId());
        member1.setFirstName(member.getFirstName());
        member1.setLastName(member.getLastName());
        member1.setEmail(member.getEmail());
        member1.setPhone(member.getPhone());
        member1.setSecondaryPhone(member.getSecondaryPhone());
        member1.setDateOfBirth(member.getDateOfBirth());
        member1.setGender(member.getGender());
        member1.setId(member.getId());
        for (IdentityProof proof : proofs) {
            IdentityProof identityProof = new IdentityProof(proof.getTypeOfProof(), proof.getIdNumber(), member1);
            identityProofs.add(identityProof);
        }
        member1.setListOfIdentityProof(identityProofs);
        //    addressRepository.saveAll(addresses);
        memberRepository.save(member1);

    }

    public List<AddressModel> getAllAddress(Integer memberId) {
        return memberRepositoryImp.getAllAddress(memberId);
    }

    public List<IdentityProofModel> getAllIdProofs(Integer memberId) {
        return memberRepositoryImp.getAllIdProofs(memberId);
    }

    public String updateMemberAddress(AddressRequest addressRequest) {
        String message = memberRepositoryImp.updateMemberAddress(addressRequest);
        return message;
    }
    public String updateMemberIdentityProof(IdentityProofRequest identityProofRequest) {
        String message = memberRepositoryImp.updateMemberIdentityProof(identityProofRequest);
        return message;
    }

}

