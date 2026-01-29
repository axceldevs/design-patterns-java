package creational.methods.factory.examples.app_reports.enums;

public enum ReportType {
    FINANCIAL("finance"),
    SALES("sales"),
    INVENTORY("inventory");

    private String reportType;
    
    ReportType(String reportType) {
        this.reportType = reportType;
    }
    
    public String getReportType() {
        return reportType;
    }
}
