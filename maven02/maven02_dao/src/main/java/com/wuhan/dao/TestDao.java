package com.wuhan.dao;

import com.wuhan.domain.Iteams;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {

    List<Iteams> findAll();
}
