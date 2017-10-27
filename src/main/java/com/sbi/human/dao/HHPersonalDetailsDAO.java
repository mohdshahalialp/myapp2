package com.sbi.human.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.human.entity.HHPersonalDetailsEntity;

@Repository
public interface HHPersonalDetailsDAO extends JpaRepository<HHPersonalDetailsEntity, Integer> {

}
