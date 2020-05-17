/**
 * 
 */
package com.easyapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.CustomerPayment;

/**
 * @author DELL
 *
 */
@Repository
public interface CustomerPaymentRepository extends JpaRepository<CustomerPayment, Long> {

}
