package creational.methods.factory.examples.app_reports.config;

import creational.methods.factory.examples.app_reports.model.Financial;

public class FinancialRowMapper implements RowMapper<Financial> {

    @Override
    public Financial mapRow(String[] headers, String[] values) {
        Financial financial = new Financial();
        financial.setTransactionId(values[0]);
        financial.setDate(values[1]);
        financial.setType(values[2]);
        financial.setConcept(values[3]);
        financial.setAmount(Float.parseFloat(values[4]));
        return financial;
    }

}
