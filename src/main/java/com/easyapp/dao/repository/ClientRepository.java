/**
 * 
 */
package com.easyapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyapp.dao.entity.ClientEntity;

/**
 * @author DELL
 *
 */
@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long>  {

}
