package com.ordersystem.inventory_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ordersystem.inventory_service.model.InventoryItem;

public interface InventoryRepository extends JpaRepository<InventoryItem, Integer> {

}
