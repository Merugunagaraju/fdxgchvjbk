package com.banking.app.department_service.controller;


import com.banking.app.department_service.dto.DepartmentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.banking.app.department_service.service.DepartmentService;

@Slf4j
@RestController
@RequestMapping("/api/department")
public class DepartmentContoller {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/add")
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto departmentdto = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(departmentdto, HttpStatus.CREATED);
    }


    @GetMapping("/{departmentcode}")
    public ResponseEntity<DepartmentDto> getDepartmentByDepartmentCode(@PathVariable String departmentcode) {

        DepartmentDto departmentDto = (departmentService.getDepatmentbyDepartmentCode(departmentcode));

        log.info("Successfully get the departmentByDepartmentCode " + departmentDto.getDepartmentCode());

        return new ResponseEntity<>(departmentDto, HttpStatus.ACCEPTED);
    }

}
