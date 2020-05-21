/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.AppointmentEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Long>  {

}
