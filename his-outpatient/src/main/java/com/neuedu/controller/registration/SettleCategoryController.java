package com.neuedu.controller.registration;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.service.registration.SettleCategoryService;

@RestController
@CrossOrigin
public class SettleCategoryController {
	@Autowired
	private SettleCategoryService settleCategoryService;
	@RequestMapping("getSettleCategory")
	public List<Map<String,Object>> getSettleCategory(){
		return settleCategoryService.getSettleCategory();
	}
}
