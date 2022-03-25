package com.ecommerce.accountservice.repository.Mappers;

import com.ecommerce.accountservice.Entities.Address;
import com.ecommerce.accountservice.modles.AddressModel;
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
    public static AddressModel convertToAddressModel(Tuple tuple) {
        AddressModel addressModel = new AddressModel();
        if (tuple.get("area") != null) {
            String area = (String) tuple.get("area");
            addressModel.setArea( area.toLowerCase());
        }
        if (tuple.get("colony") != null) {
            String colony = (String) tuple.get("colony");
            addressModel.setColony(colony.toLowerCase());
        }
        if (tuple.get("street") != null) {

            String street = (String) tuple.get("street");

            addressModel.setArea(street);
        }
        if (tuple.get("pin_code") != null) {
            String pinCode = (String) tuple.get("pin_code");
            addressModel.setStreet(pinCode.toLowerCase());
        }
        return addressModel;
    }
}
