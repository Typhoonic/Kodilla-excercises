package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Repository
@Transactional
public interface TaskFinancialDetailsDao extends CrudRepository<TaskFinancialDetails, Integer> {

    List<TaskFinancialDetails> findByPaid(boolean paid);

}
