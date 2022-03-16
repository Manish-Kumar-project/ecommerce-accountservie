package com.ecommerce.accountservice.repository.Mappers;

import com.ecommerce.accountservice.Entities.Address;
import com.ecommerce.accountservice.modles.MemberModel;

import javax.persistence.Tuple;
import java.math.BigInteger;
import java.util.Locale;

public class ConvertTupletoModel {

    public static MemberModel convertToMemberModel(Tuple tuple) {
        MemberModel memberModel = new MemberModel();
        if (tuple.get("first_name") != null) {
            String id = (String) tuple.get("first_name");
            memberModel.setFirstName( id.toLowerCase());
        }
        if (tuple.get("last_name") != null) {
            String lastName = (String) tuple.get("last_name");
            memberModel.setLastName(lastName.toLowerCase());
        }
        if (tuple.get("area") != null) {

            String area = (String) tuple.get("area");

            memberModel.setArea(area);
        }
        if (tuple.get("street") != null) {
            String street = (String) tuple.get("street");
            memberModel.setStreet(street.toLowerCase());
        }
        return memberModel;
    }
}
