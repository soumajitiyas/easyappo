/**
 * 
 */
package com.easyapp.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantDailyScheduleEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantDailyScheduleRepository extends JpaRepository<ConsultantDailyScheduleEntity, Long> {
	
	@Query("SELECT cds FROM ConsultantDailyScheduleEntity cds WHERE cds.consultant = ?1")
	List<ConsultantDailyScheduleEntity> findDailySchedulesByConsultantId(Long consultantId);

}
