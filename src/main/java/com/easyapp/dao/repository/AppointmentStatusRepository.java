/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.AppointmentStatusEntity;

/**
 * @author SOUMAJIT
 *
 */
@Repository
public interface AppointmentStatusRepository extends JpaRepository<AppointmentStatusEntity, Long> {

}
