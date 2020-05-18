/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantsRepository extends JpaRepository<ConsultantEntity, Long>  {
	
	@Query("SELECT c FROM Consultant c inner join UserDetails u on c.userDetails = u.id WHERE u.email = ?1")
    ConsultantEntity findConsultantByEmail(String email);
	
	@Query("SELECT c FROM Consultant c inner join UserDetails u on c.userDetails = u.id WHERE u.primaryNumber = ?1")
    ConsultantEntity findConsultantByContact(String primaryNumber);
}
