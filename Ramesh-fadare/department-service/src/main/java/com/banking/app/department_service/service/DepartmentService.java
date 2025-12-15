package com.banking.app.department_service.service;

import com.banking.app.department_service.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto  saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepatmentbyDepartmentCode(String departmentCode);
}
