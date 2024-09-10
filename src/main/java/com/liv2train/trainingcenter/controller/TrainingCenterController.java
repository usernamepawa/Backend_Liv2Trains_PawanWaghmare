package com.liv2train.trainingcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liv2train.trainingcenter.dto.TrainingCenterDto;
import com.liv2train.trainingcenter.model.TrainingCenter;
import com.liv2train.trainingcenter.service.TrainingCenterService;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/api/training-center")
public class TrainingCenterController {
	

 @Autowired
 private TrainingCenterService service;

 @PostMapping
 public ResponseEntity<TrainingCenter> createTrainingCenter(@RequestBody TrainingCenterDto dto) {
  TrainingCenter createdCenter = service.createTrainingCenter(dto);
 return ResponseEntity.ok(createdCenter);
	    }

	@GetMapping
	public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
   List<TrainingCenter> centers = service.getAllTrainingCenters();
	     return ResponseEntity.ok(centers);
	    }
	}


