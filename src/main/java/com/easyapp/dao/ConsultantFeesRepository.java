/**
 * 
 */
package com.easyapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantFees;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantFeesRepository extends JpaRepository<ConsultantFees, Long> {

}
