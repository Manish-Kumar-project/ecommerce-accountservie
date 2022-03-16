package com.ecommerce.accountservice.repository.impl;

import com.ecommerce.accountservice.modles.MemberModel;
import com.ecommerce.accountservice.repository.Mappers.ConvertTupletoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;
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
}
