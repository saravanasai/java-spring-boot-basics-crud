package com.zerocode.firstspringapp.service;

import com.zerocode.firstspringapp.entity.Department;
import com.zerocode.firstspringapp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImplementation implements  DepartmentService{

    @Autowired
    private DepartmentRepository repository;
    @Override
    public Department insertDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public List<Department> all() {
        return repository.findAll();
    }

    @Override
    public Department find(Long Id) {
        return repository.findById(Id).get();
    }

    @Override
    public void destroy(Long id) {
       repository.deleteById(id);
    }

    @Override
    public Department update(Long id, Department department) {

        Department departmentInstance = repository.findById(id).get();

        departmentInstance.setDepartmentName(department.getDepartmentName());
        departmentInstance.setDepartmentCode(department.getDepartmentCode());


        return repository.save(departmentInstance);
    }
}
