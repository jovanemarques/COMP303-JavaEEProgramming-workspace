package ca.centennialcollege.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Enrollment {
	@Id
	@GeneratedValue(strategy =  IDENTITY)
	private Integer applicationNo;
	private Integer studentId;
	private String programCode;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	private Float amountPaid;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
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
	public Integer getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(Integer applicationNo) {
		this.applicationNo = applicationNo;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getProgramCode() {
		return programCode;
	}
	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}
}
