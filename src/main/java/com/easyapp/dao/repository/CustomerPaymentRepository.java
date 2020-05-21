/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.CustomerPaymentEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface CustomerPaymentRepository extends JpaRepository<CustomerPaymentEntity, Long> {

}
