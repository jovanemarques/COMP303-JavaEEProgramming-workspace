package ca.centennialcollege.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Program {
	@Id
	private String programCode;
	private String programName;
	private String duration;
	private Float fee;

	public String getProgramCode() {
		return programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Float getFee() {
		return fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}
}
