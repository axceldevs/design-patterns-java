package creational.methods.factory.examples.app_reports.factory;

import creational.methods.factory.examples.app_reports.report.Report;

public abstract class ReportFactory {
    
    public String viewReport() {
        Report report = createReport();
        return report.generateReport();
    }

    public abstract Report createReport();
}
