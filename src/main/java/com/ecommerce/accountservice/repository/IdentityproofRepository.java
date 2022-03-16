package com.ecommerce.accountservice.repository;

import com.ecommerce.accountservice.Entities.IdentityProof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentityproofRepository extends JpaRepository<IdentityProof,Integer> {
}
