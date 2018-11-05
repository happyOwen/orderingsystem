package com.example.orderingsystem.repository;

import com.example.orderingsystem.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster,Long> {
}
