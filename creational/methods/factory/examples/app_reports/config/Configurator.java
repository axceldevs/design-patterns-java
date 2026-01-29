package creational.methods.factory.examples.app_reports.config;

import creational.methods.factory.examples.app_reports.enums.ReportType;
import creational.methods.factory.examples.app_reports.factory.FinancialReportFactory;

public class Configurator {
    public static FinancialReportFactory getReportType(ReportType key) {
        switch (key) {
            case FINANCIAL:
                return new FinancialReportFactory();
            case SALES:
                return new FinancialReportFactory();
            case INVENTORY:
                return new FinancialReportFactory();
            default:
                return new FinancialReportFactory();
        }
    }
}