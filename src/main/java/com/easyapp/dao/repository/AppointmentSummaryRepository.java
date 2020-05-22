/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.AppointmentSummaryEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface AppointmentSummaryRepository extends JpaRepository<AppointmentSummaryEntity, Long> {

}
