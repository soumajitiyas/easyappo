/**
 * 
 */
package com.easyapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantSlot;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantCalendarRepository extends JpaRepository<ConsultantSlot, Long> {

}