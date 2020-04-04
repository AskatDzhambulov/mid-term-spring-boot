package com.exam.midterm.repository;
import com.exam.midterm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByEmailAddress(String emailAddress);

}
