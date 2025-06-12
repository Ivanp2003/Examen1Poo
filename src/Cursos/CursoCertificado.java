package Cursos;

public class CursoCertificado extends Curso {
    private boolean certificado;

    public CursoCertificado(String nombreCurso, String paralelo, int duracionMeses, double precioBase, boolean certificado) {
        super(nombreCurso, paralelo, duracionMeses, precioBase * 1.25);
        this.certificado = certificado;
    }

    public boolean getCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Curso con Certificado");
        System.out.println("Nombre Curso: " + getNombreCurso());
        System.out.println("Paralelo Curso: " + getParalelo());
        System.out.println("Duracion Meses: " + getDuracionMeses());
        System.out.println("Precio (incluye certificado): " + getPrecio());
        System.out.println("Certificado: " + certificado);
    }
}
