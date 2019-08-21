package com.wuhan.service.impl;

import com.wuhan.dao.TestDao;
import com.wuhan.domain.Iteams;

import com.wuhan.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Autowired
    DataSource ds;
    public void save() {
        System.out.println (ds);
    }


    public List<Iteams> find() {

        return testDao.findAll ();
    }
}
