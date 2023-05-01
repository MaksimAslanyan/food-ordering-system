package com.food.ordering.system.restaurant.servic.dataaccess.repository;


import com.food.ordering.system.restaurant.servic.dataaccess.entity.OrderApprovalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderApprovalJpaRepository extends JpaRepository<OrderApprovalEntity, UUID> {


}