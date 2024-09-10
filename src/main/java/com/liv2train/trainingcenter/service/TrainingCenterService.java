package com.liv2train.trainingcenter.service;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liv2train.trainingcenter.dto.TrainingCenterDto;
import com.liv2train.trainingcenter.model.TrainingCenter;
import com.liv2train.trainingcenter.repository.TrainingCenterRepository;
import com.liv2train.trainingcenter.util.ValidationUtil;

@Service
public class TrainingCenterService {
	
	    @Autowired
  private TrainingCenterRepository repository;

 public TrainingCenter createTrainingCenter(TrainingCenterDto dto) {
  ValidationUtil.validateEmail(dto.getContactEmail());
 ValidationUtil.validatePhone(dto.getContactPhone());

	TrainingCenter trainingCenter = new TrainingCenter();
	  trainingCenter.setCenterName(dto.getCenterName());
	   trainingCenter.setCenterCode(dto.getCenterCode());
	       // trainingCenter.setAddress(dto.getAddress());
	   trainingCenter.setStudentCapacity(dto.getStudentCapacity());
	 trainingCenter.setCoursesOffered(dto.getCoursesOffered());
	 trainingCenter.setCreatedOn(Instant.now().getEpochSecond());
	   trainingCenter.setContactEmail(dto.getContactEmail());
	   trainingCenter.setContactPhone(dto.getContactPhone());

	   return repository.save(trainingCenter);
	    }

	    public List<TrainingCenter> getAllTrainingCenters() {
	        return repository.findAll();
	    }
	}


