/**
 * 
 */
package com.easyapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyapp.dao.entity.PaymentMode;

/**
 * @author DELL
 *
 */
public interface PaymentModeRepository extends JpaRepository<PaymentMode, Long> {

}
