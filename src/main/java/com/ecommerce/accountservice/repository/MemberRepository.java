package com.ecommerce.accountservice.repository;

import com.ecommerce.accountservice.Entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByMemberId(Integer id);
}
