package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJVMReport(String jsonFile) {

		File file = new File("C:\\Users\\Kulasekaran\\eclipse-workspace\\Adactin_hotel\\target");

		net.masterthought.cucumber.Configuration configuration = new net.masterthought.cucumber.Configuration(file,
				"Adactin Project");

		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("TEster", "kula");

		List<String> jsonfiles = new ArrayList<>();
		jsonfiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);

		builder.generateReports();

	}

}
