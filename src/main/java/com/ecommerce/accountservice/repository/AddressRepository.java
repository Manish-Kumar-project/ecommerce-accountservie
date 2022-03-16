package com.ecommerce.accountservice.repository;

import com.ecommerce.accountservice.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
