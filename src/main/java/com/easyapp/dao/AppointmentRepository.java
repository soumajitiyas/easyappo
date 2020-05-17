/**
 * 
 */
package com.easyapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.Appointment;

/**
 * @author DELL
 *
 */
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long>  {

}
