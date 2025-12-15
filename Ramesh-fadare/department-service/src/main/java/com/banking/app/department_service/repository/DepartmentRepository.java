package com.banking.app.department_service.repository;

import com.banking.app.department_service.dto.DepartmentDto;
import com.banking.app.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

  //  Department findBygetDepartmentCode(String departmentCode);

  //  public interface DepartmentRepository extends JpaRepository<Department, Long> {
        Department findByDepartmentCode(String departmentCode);  // ✅ matches field name
  //  }

}
