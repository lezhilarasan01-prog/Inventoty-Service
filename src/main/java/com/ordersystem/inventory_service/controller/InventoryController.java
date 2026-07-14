package com.ordersystem.inventory_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ordersystem.inventory_service.model.InventoryItem;
import com.ordersystem.inventory_service.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

				@Autowired
				private InventoryService inventoryService;
					
				@GetMapping
				public List<InventoryItem> getAllUsers(){
					return inventoryService.getAllItems();
				}
				
				@GetMapping("/{id}")
				public InventoryItem getById(@PathVariable Integer id) {
					return inventoryService.getItemById(id);
				}
				@PostMapping
				public InventoryItem createItem(@RequestBody InventoryItem item) {
					return inventoryService.createItem(item);
				}
				
				@DeleteMapping("/{id}")
				public void deleteItem(@PathVariable Integer id) {
					inventoryService.deleteById(id);
				}
}
