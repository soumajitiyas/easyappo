/**
 * 
 */
package com.easyapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.Consultant;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantsRepository extends JpaRepository<Consultant, Long>  {
	
	@Query("SELECT c FROM Consultant c inner join UserDetails u on c.userDetails = u.id WHERE u.email = ?1")
	Consultant findConsultantByEmail(String email);
	
	@Query("SELECT c FROM Consultant c inner join UserDetails u on c.userDetails = u.id WHERE u.primaryNumber = ?1")
	Consultant findConsultantByContact(String primaryNumber);
}
