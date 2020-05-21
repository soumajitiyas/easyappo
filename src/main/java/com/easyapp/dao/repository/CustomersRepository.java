/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.CustomerEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface CustomersRepository extends JpaRepository<CustomerEntity, Long>  {

}
