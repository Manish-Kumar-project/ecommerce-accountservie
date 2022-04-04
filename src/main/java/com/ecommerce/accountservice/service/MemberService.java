package com.ecommerce.accountservice.service;

import com.ecommerce.accountservice.Entities.Address;
import com.ecommerce.accountservice.Entities.IdentityProof;
import com.ecommerce.accountservice.Entities.Member;
import com.ecommerce.accountservice.modles.AddressModel;
import com.ecommerce.accountservice.modles.AddressRequest;
import com.ecommerce.accountservice.modles.IdentityProofModel;
import com.ecommerce.accountservice.modles.IdentityProofRequest;

import java.util.List;

public interface MemberService {
     Member saveMember(Member member);
     void addAddress(List<Address> addresses);
     void addIdentityPrrof(List<IdentityProof> proofs);
     List<AddressModel> getAllAddress(Integer memberId);
     List<IdentityProofModel> getAllIdProofs(Integer memberId);
     String updateMemberAddress(AddressRequest addressRequest);
     String updateMemberIdentityProof(IdentityProofRequest identityProofRequest);
}
