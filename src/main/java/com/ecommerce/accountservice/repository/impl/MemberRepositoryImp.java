package com.ecommerce.accountservice.repository.impl;

import com.ecommerce.accountservice.Entities.Address;
import com.ecommerce.accountservice.modles.*;
import com.ecommerce.accountservice.repository.Mappers.ConvertTupletoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MemberRepositoryImp {
    @Autowired
    private EntityManager entityManager;

    public List<MemberModel> memberQuery() {
        List<Tuple> tuples = new ArrayList<>();

        StringBuilder selectQuery = new StringBuilder();
        StringBuilder fromQuery = new StringBuilder();
        StringBuilder whereQuery = new StringBuilder();

        selectQuery.append("select mem.id,mem.first_name,mem.last_name,addr.area,addr.street");
        fromQuery.append(" from testdb.member mem JOIN testdb.address addr ON mem.id = addr.id_address where mem.id = 233");


        Query query = entityManager.createNativeQuery(selectQuery.toString()
                .concat(fromQuery.toString()
                        .concat(whereQuery.toString())), Tuple.class);
        tuples = (List<Tuple>) query.getResultList();
        List<MemberModel> memberModel = tuples.stream().map(ConvertTupletoModel::convertToMemberModel).collect(Collectors.toList());
        return memberModel;
    }

    public List<AddressModel> getAllAddress(Integer memberId) {
        List<Tuple> tuples = new ArrayList<>();

        StringBuilder selectQuery = new StringBuilder();
        StringBuilder fromQuery = new StringBuilder();
        StringBuilder whereQuery = new StringBuilder();

        selectQuery.append("select addr.city,addr.colony,addr.pin_code,addr.area,addr.street");
        fromQuery.append(" from testdb.member mem JOIN testdb.address addr ON mem.id = addr.id_address where mem.id = 233");


        Query query = entityManager.createNativeQuery(selectQuery.toString()
                .concat(fromQuery.toString()
                        .concat(whereQuery.toString())), Tuple.class);
        tuples = (List<Tuple>) query.getResultList();
        List<AddressModel> addressModel = tuples.stream().map(ConvertTupletoModel::convertToAddressModel).collect(Collectors.toList());
        return addressModel;
    }

    public List<IdentityProofModel> getAllIdProofs(Integer memberId) {
        List<Tuple> tuples = new ArrayList<>();

        StringBuilder selectQuery = new StringBuilder();
        StringBuilder fromQuery = new StringBuilder();
        StringBuilder whereQuery = new StringBuilder();

        selectQuery.append("select idproof.id_number,idproof.type_of_proof");
        fromQuery.append(" from testdb.member mem JOIN testdb.identity_proof idproof ON mem.id = idproof.proof_id where mem.id = 233");


        Query query = entityManager.createNativeQuery(selectQuery.toString()
                .concat(fromQuery.toString()
                        .concat(whereQuery.toString())), Tuple.class);
        tuples = (List<Tuple>) query.getResultList();
        List<IdentityProofModel> identityProofModel = tuples.stream().map(ConvertTupletoModel::convertToIdentityProofModel).collect(Collectors.toList());
        return identityProofModel;
    }

    @Transactional
    public String updateMemberAddress(AddressRequest addressRequest) {
        StringBuilder updateQuery = new StringBuilder();
        String responseMessage = "";
        try {
            updateQuery.append("update  testdb.address addr set");
            updateQuery.append(" addr.area = '" + addressRequest.getArea()+"',");
            updateQuery.append(" addr.city = '" + addressRequest.getCity()+"',");
            updateQuery.append("  addr.colony = '" + addressRequest.getColony()+"',");
            updateQuery.append("  addr.street = '" + addressRequest.getStreet()+"',");
            updateQuery.append("  addr.pin_code = '" + addressRequest.getPinCode()+"'");
            updateQuery.append(" where  addr.address_id = 234 ");
            entityManager.createNativeQuery(updateQuery.toString()).executeUpdate();
        } catch (Exception exception) {
            System.out.println("Exception occured : " + exception.getStackTrace());
            responseMessage = "Exception Occured : " + exception.getStackTrace();
        }
        if (responseMessage.isEmpty()) {
            responseMessage = "Member Address is updated";
        }
        return responseMessage;
    }
    @Transactional
    public String updateMemberIdentityProof(IdentityProofRequest identityProofRequest) {
        StringBuilder updateQuery = new StringBuilder();
        String responseMessage = "";
        try {
            updateQuery.append("update  testdb.identity_proof idproof set");
            updateQuery.append(" idproof.id_number = '" + identityProofRequest.getIdNumber()+"',");
            updateQuery.append(" idproof.type_of_proof = '" + identityProofRequest.getTypeOfProof()+"'");
            updateQuery.append(" where  idproof.address_id = 238 ");
            entityManager.createNativeQuery(updateQuery.toString()).executeUpdate();
        } catch (Exception exception) {
            System.out.println("Exception occured : " + exception.getStackTrace());
            responseMessage = "Exception Occured : " + exception.getStackTrace();
        }
        if (responseMessage.isEmpty()) {
            responseMessage = "Member Identity Proof is updated";
        }
        return responseMessage;
    }
}
