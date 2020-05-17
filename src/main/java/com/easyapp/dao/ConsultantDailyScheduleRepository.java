/**
 * 
 */
package com.easyapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantDailySchedule;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantDailyScheduleRepository extends JpaRepository<ConsultantDailySchedule, Long> {
	
	@Query("SELECT cds FROM ConsultantDailySchedule cds WHERE cds.consultant = ?1")
	List<ConsultantDailySchedule> findDailySchedulesByConsultantId(Long consultantId);

}
