/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantSlotEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantCalendarRepository extends JpaRepository<ConsultantSlotEntity, Long> {

}
