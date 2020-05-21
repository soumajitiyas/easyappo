/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantFeesEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantFeesRepository extends JpaRepository<ConsultantFeesEntity, Long> {

}
