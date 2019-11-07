package ca.centennialcollege.model;

import java.util.Date;

public class Enrollment {
	private Integer applicationNo;
	private Student student;
	private Program program;
	private Date startDate;
	private Float amountPaid;
	private Boolean status;
	
	public Program getProgramCode() {
		return program;
	}
	public void setProgramCode(Program program) {
		this.program = program;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Float getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(Float amountPaid) {
		this.amountPaid = amountPaid;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Integer getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(Integer applicationNo) {
		this.applicationNo = applicationNo;
	}
}
