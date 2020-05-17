/**
 * 
 */
package com.easyapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.AppointmentStatus;

/**
 * @author SOUMAJIT
 *
 */
@Repository
public interface AppointmentStatusRepository extends JpaRepository<AppointmentStatus, Long> {

}
