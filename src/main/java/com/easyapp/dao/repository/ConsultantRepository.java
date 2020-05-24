/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantRepository extends JpaRepository<ConsultantEntity, Long>  {
	
}
