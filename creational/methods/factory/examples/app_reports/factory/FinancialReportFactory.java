package creational.methods.factory.examples.app_reports.factory;

import creational.methods.factory.examples.app_reports.report.FinancialReport;
import creational.methods.factory.examples.app_reports.report.Report;

public class FinancialReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new FinancialReport();
    }
}
