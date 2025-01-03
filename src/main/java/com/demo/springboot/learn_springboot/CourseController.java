package com.demo.springboot.learn_springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


//courses
//build the rest api

//    [
//            {
//            "id" : 1,
//            "name": "Learn AWS",
//            "author": "in28minutes"
//            }
//            ]
@RestController
public class CourseController {

        @RequestMapping("/courses")
        public List<Course> retrieveAllCourses(){
            return Arrays.asList(
                    new Course(1,"LearnAWS","in28minutes"),
                    new Course(2,"LearnDevops", "in28minutes"),
                    new Course(3,"Azure", "in28minutes")



            );
        }




}
