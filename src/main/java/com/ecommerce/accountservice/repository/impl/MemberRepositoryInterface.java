package com.ecommerce.accountservice.repository.impl;

import com.ecommerce.accountservice.modles.*;

import java.util.List;

public interface MemberRepositoryInterface {
     List<MemberModel> memberQuery();
     List<AddressModel> getAllAddress(Integer memberId);
     List<IdentityProofModel> getAllIdProofs(Integer memberId);
     String updateMemberAddress(AddressRequest addressRequest);
     String updateMemberIdentityProof(IdentityProofRequest identityProofRequest);
}
