package com.zerocode.firstspringapp.service;

import com.zerocode.firstspringapp.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department insertDepartment(Department department);

   public List<Department> all();

    public Department find(Long Id);

    public void destroy(Long id);

    public Department update(Long id, Department department);
}
