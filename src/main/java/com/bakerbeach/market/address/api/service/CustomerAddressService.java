package com.bakerbeach.market.address.api.service;

import java.util.List;
import java.util.Map;

import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.core.api.model.CustomerAddress;

public interface CustomerAddressService {

	void saveOrUpdate(CustomerAddress address) throws CustomerAdressServiceException;

	List<CustomerAddress> findByCustomer(Customer customer) throws CustomerAdressServiceException;
	
	Map<String,CustomerAddress> findDefaultsByCustomer(Customer customer) throws CustomerAdressServiceException;
	
	CustomerAddress findBillingDefaultByCustomer(Customer customer) throws CustomerAdressServiceException;
	
	CustomerAddress findShippingDefaultByCustomer(Customer customer) throws CustomerAdressServiceException;

}
