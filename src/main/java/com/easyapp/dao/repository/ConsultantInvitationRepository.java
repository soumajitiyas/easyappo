/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ConsultantInvitationEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface ConsultantInvitationRepository extends JpaRepository<ConsultantInvitationEntity, Long>{ 

}
