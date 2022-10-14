package lk.PosSystem.EmployeeManagement.controller;



import lk.PosSystem.EmployeeManagement.business.custom.EmployeeBO;
import lk.PosSystem.EmployeeManagement.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeBO EmployeeBO;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ResponseEntity<List<EmployeeDTO>> getEmployees() throws Exception{
    return new ResponseEntity<List<EmployeeDTO>>(EmployeeBO.findAllEmployees(), HttpStatus.OK);
    }
}
