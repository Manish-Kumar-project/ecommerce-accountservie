package com.ecommerce.accountservice.controller;

import com.ecommerce.accountservice.Entities.Address;
import com.ecommerce.accountservice.Entities.IdentityProof;
import com.ecommerce.accountservice.Entities.Member;
import com.ecommerce.accountservice.modles.*;
import com.ecommerce.accountservice.repository.MemberRepository;
import com.ecommerce.accountservice.repository.impl.MemberRepositoryImp;
import com.ecommerce.accountservice.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/member")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberRepositoryImp memberRepositoryImp;

    @Autowired
    private MemberServiceImpl memberService;

    @PostMapping(value = "/customer")
    public Member saveCustomer(@RequestBody Member member){
        memberService.saveMember(member);
        return member;

    }

    @PostMapping(value = "/address")
    public void saveCustomer(@RequestBody List<Address> addresses){
        memberService.addAddress(addresses);
    }

    @PostMapping(value = "/idproofs")
    public void saveIdProof(@RequestBody List<IdentityProof> identityProofs){
        memberService.addIdentityPrrof(identityProofs);
    }

    @GetMapping(value = "/get")
    public List<MemberModel> getAll(){
        List<MemberModel> memberModels = memberRepositoryImp.memberQuery();
        return memberModels;
    }
    @GetMapping(value = "/member/address")
    public ResponseEntity<List<AddressModel>> getAllAddress(Integer memberId){
        List<AddressModel> addressModels = memberService.getAllAddress(233);
        return new ResponseEntity<List<AddressModel>>(addressModels, HttpStatus.OK);
    }
    @GetMapping(value = "/member/idproof")
    public ResponseEntity<List<IdentityProofModel>> getAllIdProofs(Integer memberId){
        List<IdentityProofModel> identityProofModels = memberService.getAllIdProofs(233);
        return new ResponseEntity<List<IdentityProofModel>>(identityProofModels, HttpStatus.OK);
    }
    @PostMapping(value = "member/update/address")
    public ResponseEntity<String> updateMemberAddress(@RequestBody AddressRequest addressRequest){
        String message = memberService.updateMemberAddress(addressRequest);
        return new ResponseEntity<String>(message,HttpStatus.OK);
    }
    @PostMapping(value = "member/update/idproof")
    public ResponseEntity<String> updateMemberIdentityProof(@RequestBody IdentityProofRequest identityProofRequest){
        String message = memberService.updateMemberIdentityProof(identityProofRequest);
        return new ResponseEntity<String>(message,HttpStatus.OK);
    }
}
