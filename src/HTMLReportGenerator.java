class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatData() {
        System.out.println("Formateando datos en estilo HTML...");
    }

    @Override
    protected void exportReport() {
        System.out.println("Exportando reporte en formato HTML...");
    }
}