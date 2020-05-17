/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.UserDetails;

/**
 * @author SOUMAJIT
 *
 */
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
	
}
