package com.ordersystem.inventory_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordersystem.inventory_service.model.InventoryItem;
import com.ordersystem.inventory_service.repository.InventoryRepository;

@Service
public class InventoryService {

			@Autowired
			private InventoryRepository inventoryRepository;
			
			public List<InventoryItem> getAllItems(){
				return inventoryRepository.findAll();
			}
			
			public InventoryItem getItemById(Integer id) {
				return inventoryRepository.findById(id).orElse(null);
			}
			
			public InventoryItem createItem(InventoryItem item) {
				return inventoryRepository.save(item);
			}
			
			public void deleteById(Integer id) {
				inventoryRepository.deleteById(id);
			}
}
