package com.smarttelecom.services;

import java.util.List;

import com.smarttelecom.dto.PlanDTO;
import com.smarttelecom.entity.Plan;

public interface PlanService {
	
	public PlanDTO createPlan(PlanDTO dto);
	
	public List<PlanDTO> getAllPlans();
	
}
