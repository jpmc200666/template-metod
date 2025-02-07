public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Generando reporte en PDF:");
        ReportGenerator pdfReport = new PDFReportGenerator();
        pdfReport.generateReport();

        System.out.println("\nGenerando reporte en HTML:");
        ReportGenerator htmlReport = new HTMLReportGenerator();
        htmlReport.generateReport();

    }
}
