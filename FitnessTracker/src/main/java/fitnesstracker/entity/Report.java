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
	private String reportName;
	@OneToOne 
	@JoinColumn(name ="activity_name")
	private Activity activity;
	@OneToOne
	@JoinColumn(name = "diet_name")
	private Diet diet;
	
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	} 
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public Diet getDiet() {
		return diet;
	}
	public void setDiet(Diet diet) {
		this.diet = diet;
	}
	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", reportName=" + reportName + "]";
	}
}
