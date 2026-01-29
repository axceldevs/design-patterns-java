package creational.methods.factory.examples.app_reports;

import creational.methods.factory.examples.app_reports.config.Configurator;
import creational.methods.factory.examples.app_reports.enums.ReportType;

public class Demo {
    public static void main(String[] args) {
        ReportType reportType = ReportType.FINANCIAL;
        String report = Configurator.getReportType(reportType).viewReport();
        System.out.println(report);
    }
}
