package fitnesstracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Report {
	@Id
	private int reportId;
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
