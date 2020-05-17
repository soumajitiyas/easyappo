package com.easyapp.dao.repository;

import com.easyapp.dao.entity.ConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigRepository extends JpaRepository<ConfigEntity, Long> {

}