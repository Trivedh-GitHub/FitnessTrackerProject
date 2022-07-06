package fitnesstracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Report {
	@Id
	private int reportId;
	private int reportName;
	
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
