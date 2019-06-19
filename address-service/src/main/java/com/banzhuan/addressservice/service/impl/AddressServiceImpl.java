package com.banzhuan.addressservice.service.impl;

import com.banzhuan.addressservice.dao.AddressDao;
import com.banzhuan.addressservice.entity.Address;
import com.banzhuan.addressservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressDao addressDao;

    @Override
    public List<Address> getAllAddress() {
        return addressDao.findAll();
    }

    @Override
    public Address insertAddress(Address address) {
        return addressDao.save(address);
    }
}
