package com.asrmanalo.store.repositories;

import com.asrmanalo.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}