abstract class ReportGenerator {
    // Template Method: estructura básica de la generación de reportes
    public final void generateReport() {
        collectData();
        formatData();
        exportReport();
    }

    // Método común para todas las subclases
    protected void collectData() {
        System.out.println("Recopilando datos del sistema...");
    }

    // Métodos específicos para las subclases
    protected abstract void formatData(); // Cómo se formatean los datos
    protected abstract void exportReport(); // Cómo se exporta el reporte
}