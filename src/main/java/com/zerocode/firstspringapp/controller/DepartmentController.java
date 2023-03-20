package com.zerocode.firstspringapp.controller;

import com.zerocode.firstspringapp.entity.Department;
import com.zerocode.firstspringapp.service.DepartmentService;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService Departmentservice;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @GetMapping("/departments")
    public List<Department> index(){
        LOGGER.info("index method is called");
        return Departmentservice.all();
    }
    @PostMapping("/departments")
   public  Department store(@Valid @RequestBody Department department) {

        return  Departmentservice.insertDepartment(department);
   }

   @GetMapping("/departments/{id}")
    public Department show(@PathVariable("id") Long Id){

        return  Departmentservice.find(Id);
   }


   @PutMapping("/departments/{id}")
   public Department update(@PathVariable("id" ) Long Id, @RequestBody Department department){

        return Departmentservice.update(Id,department);

   }
   @DeleteMapping("/departments/{id}")
    public String destroy(@PathVariable("id") Long Id){

        Departmentservice.destroy(Id);

        return "Department deleted successfully";
   }
}
