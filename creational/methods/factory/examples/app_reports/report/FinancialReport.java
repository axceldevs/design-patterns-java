package creational.methods.factory.examples.app_reports.report;

import java.util.List;

import creational.methods.factory.examples.app_reports.config.FinancialRowMapper;
import creational.methods.factory.examples.app_reports.config.ReaderFile;
import creational.methods.factory.examples.app_reports.enums.ReportType;
import creational.methods.factory.examples.app_reports.model.Financial;

public class FinancialReport implements Report {

    @Override
    public String generateReport() {
        ReaderFile<Financial> reader = new ReaderFile<>();
        ReportType reportType = ReportType.FINANCIAL;
        List<Financial> finances = reader.readFile(reportType, new FinancialRowMapper());
        return generateReportContent(finances);
    }

    private String generateReportContent(List<Financial> finances) {
        // Generar reporte
        StringBuilder report = new StringBuilder();
        report.append("=== REPORTE FINANCIERO ===\n");
        report.append(String.format("%-15s %-12s %-10s %-25s %-15s\n", 
            "Transaction ID", "Date", "Type", "Concept", "Amount"));
        report.append("-".repeat(80)).append("\n");
        
        double totalIngreso = 0;
        double totalEgreso = 0;
        
        for (Financial f : finances) {
            report.append(String.format("%-15s %-12s %-10s %-25s %,15.0f\n",
                f.getTransactionId(), f.getDate(), f.getType(), f.getConcept(), f.getAmount()));
            
            if ("INGRESO".equals(f.getType())) {
                totalIngreso += f.getAmount();
            } else {
                totalEgreso += f.getAmount();
            }
        }
        
        report.append("-".repeat(80)).append("\n");
        report.append(String.format("Total Ingresos: %,15.0f\n", totalIngreso));
        report.append(String.format("Total Egresos:  %,15.0f\n", totalEgreso));
        report.append(String.format("Neto:           %,15.0f\n", totalIngreso - totalEgreso));
        
        return report.toString();
    }

}
