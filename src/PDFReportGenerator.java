class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void formatData() {
        System.out.println("Formateando datos en estilo PDF...");
    }

    @Override
    protected void exportReport() {
        System.out.println("Exportando reporte en formato PDF...");
    }
}
