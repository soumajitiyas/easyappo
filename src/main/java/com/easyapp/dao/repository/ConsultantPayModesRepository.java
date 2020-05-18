/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantPayModesEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantPayModesRepository extends JpaRepository<ConsultantPayModesEntity, Long> {

}
