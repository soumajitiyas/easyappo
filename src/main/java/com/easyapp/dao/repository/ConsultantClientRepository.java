/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantClientEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantClientRepository extends JpaRepository<ConsultantClientEntity, Long> {

}
