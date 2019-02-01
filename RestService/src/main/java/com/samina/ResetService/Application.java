package com.samina.ResetService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
//http://localhost:8080/surveys/Survey1/questions/
/*	- Create a REST Service for Retrieving all questions for a survey
	 - Autowire SurveyService
	 - Create @GetMapping("/surveys/{surveyId}/questions")
	 - Use @PathVariable String surveyId
	- http://localhost:8080/surveys/Survey1/questions/
	 - How does the Bean get converted to a JSON?
	  - Auto Configuration : If Jackson jar is on the class path, message converters are auto created! (Search in log :Creating shared instance of singleton bean 'mappingJackson2HttpMessageConverter')
	
	*- Adding the second method to rest service to retrieve a specific question
- This will be a very short step
- http://localhost:8080/surveys/Survey1/questions/Question1
- Different Request Methods
  - GET - Retrieve details of a resource
  - POST - Create a new resource
  - PUT	- Update an existing resource
  - PATCH - Update part of a resource
  - DELETE - Delete a resource
	*
	*
	*
	*
	*
	*
	*/
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

	}
}
