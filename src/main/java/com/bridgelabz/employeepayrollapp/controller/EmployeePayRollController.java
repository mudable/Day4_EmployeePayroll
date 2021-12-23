package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

@RestController
@RequestMapping("/employeePayrollservice")
/*@RequestMapping:Used to set the class level URL.
 */
public class EmployeePayRollController {
/*@RequestMapping:Used to take the URL for displaying message.
 * return:message.
 */
	@RequestMapping(value = { "/get" })
	public ResponseEntity<String> getEmployeePayrollData() {
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}
/*@GetMapping:used to pass the URL With Id.
 * return:pass the message for particular id.
 */
	@GetMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId) {
		return new ResponseEntity<String>("Get Call Success for Id: " + empId, HttpStatus.OK);
	}
/*@PostMapping:used to pass the URL
 * @RequestBody:pass the object.
 * return:created fields with the values.
 */
	@PostMapping("/create")
	public ResponseEntity<String> getEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
		return new ResponseEntity<String>("Created Employee Payroll Data for: " + empPayrollDTO, HttpStatus.OK);
	}
/*@PutMapping:use to update the specified value.
 * return:updated value.
 */
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
		return new ResponseEntity<String>("Updated Employee Payroll Data for: " + empPayrollDTO, HttpStatus.OK);
	}
/*DeleteMapping: use to pass the URL with id.
 * return: delete the data of particular id.
 */
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
		return new ResponseEntity<String>("Delete call success for id: " + empId, HttpStatus.OK);
	}
}