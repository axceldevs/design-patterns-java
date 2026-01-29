package creational.methods.factory.examples.app_reports.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import creational.methods.factory.examples.app_reports.enums.ReportType;


public class ReaderFile<T> {

    private List<T> content;

    public ReaderFile() {
        this.content = new ArrayList<>();
    }

    public List<T> getContent() {
        return content;
    }

    public List<T> readFile(ReportType type, RowMapper<T> mapper) {
        String pathFile = "creational/methods/factory/examples/app_reports/data/" + type.getReportType() + ".csv";

        try (FileInputStream file = new FileInputStream(pathFile)) {
            byte[] data = new byte[file.available()];
            file.read(data);
            String fileContent = new String(data);
            String[] lines = fileContent.split("\n");
            String[] headers = lines[0].split(",");
            for (int i = 1; i < lines.length; i++) {
                String[] values = lines[i].split(",");
                T row = mapper.mapRow(headers, values);
                this.content.add(row);
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo");
            e.printStackTrace();
        }

        return this.content;
    }
}