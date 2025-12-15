package com.banking.app.department_service.service.impl;

import com.banking.app.department_service.dto.DepartmentDto;
import com.banking.app.department_service.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.banking.app.department_service.repository.DepartmentRepository;
import com.banking.app.department_service.service.DepartmentService;

import java.util.Optional;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        //convert department dto to department jpa entity
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentCode(),
                departmentDto.getDepartmentDescription()
        );
        Department saveddepartmrent = departmentRepository.save(department);


        DepartmentDto savedDepartmentDto = new DepartmentDto(
                saveddepartmrent.getId(),
                saveddepartmrent.getDepartmentName(),
                saveddepartmrent.getDepartmentCode(),
                saveddepartmrent.getDepartmentDescription()


        );

        return savedDepartmentDto;

    }

  //  @Override
//    public DepartmentDto getDepatmentbyDepartmentCode(String departmentCode) {
//        return null;
//    }

    @Override
    public DepartmentDto getDepatmentbyDepartmentCode(String deparmentCode) {

      Department department= departmentRepository.findByDepartmentCode(deparmentCode);

     DepartmentDto departmentDto = new DepartmentDto(
             department.getId(),
             department.getDepartmentName(),
             department.getDepartmentCode(),
             department.getDepartmentDescription());
     //)
        return  departmentDto;


    }
}
