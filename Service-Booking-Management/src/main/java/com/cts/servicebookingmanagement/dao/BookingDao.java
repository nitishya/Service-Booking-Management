package com.cts.servicebookingmanagement.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.servicebookingmanagement.model.AppServiceReq;

@Repository
public interface BookingDao extends CrudRepository<AppServiceReq, Integer>{

	Optional<AppServiceReq> findAllById(String status);

}

