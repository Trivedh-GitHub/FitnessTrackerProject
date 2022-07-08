package fitnesstracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Report {
	@Id
	@NotNull
	private int reportId;
	@NotBlank(message = "name is mandatory")
	private int reportName;
	@OneToOne 
	@JoinColumn(name ="activity_name")
	private Activity activity;
	@OneToOne
	@JoinColumn(name = "diet_name")
	private Diet diet;
	
	public int getReportName() {
		return reportName;
	}
	public void setReportName(int reportName) {
		this.reportName = reportName;
	} 
	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", reportName=" + reportName + "]";
	}
}
