package creational.methods.factory.examples.app_reports.config;

public interface RowMapper<T> {
    T mapRow(String[] headers, String[] values);
}
