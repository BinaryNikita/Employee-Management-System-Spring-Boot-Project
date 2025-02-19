package com.employeeproject.employeeprojectdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long id;
    private String name;
    private String phone;
    private String email;

public Long getId(){
    return this.id;
}

}
