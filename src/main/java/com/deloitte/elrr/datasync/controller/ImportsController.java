package com.deloitte.elrr.datasync.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.elrr.datasync.dto.ImportDTO;
import com.deloitte.elrr.datasync.svc.ImportsCreatorSvc;

import lombok.extern.slf4j.Slf4j;

//@CrossOrigin(origins =  {{"http://ec2-18-116-20-188.us-east-2.compute.amazonaws.com:3001", "http://ec2-18-116-20-188.us-east-2.compute.amazonaws.com:5000"})

@RestController
@RequestMapping("api")
@Slf4j
public class ImportsController {

	@Autowired
	ImportsCreatorSvc svc;

	// @CrossOrigin(origins = {reactUrl1})
	@GetMapping("/getImports")
	public ImportDTO getImports(@RequestParam(value = "name", required = true) String importsName) {

		return svc.getImports(importsName);
	}

	@GetMapping("/getAllImports")
	public List<ImportDTO> getAllImports() {

		return svc.getAllImports();
	}

}
