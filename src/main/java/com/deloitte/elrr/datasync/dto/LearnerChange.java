package com.deloitte.elrr.datasync.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class LearnerChange {


	String 	contactEmailAddress;
	String 	name;
 	List<UserCourse>  courses;

}
