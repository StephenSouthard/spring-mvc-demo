package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// This is a custom validation rule
// Do the logic in the isValid(String, ConstraintValidatorContext)
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext ConstraintValidatorContext) {

		boolean result;

		if (theCode == null) {
			return true;
		}

		result = theCode.startsWith(coursePrefix);

		return result;
	}

}
