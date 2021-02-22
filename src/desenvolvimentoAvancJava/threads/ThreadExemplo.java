package desenvolvimentoAvancJava.threads;

public class ThreadExemplo {

    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPDF = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPDF);

        iniciarGeradorPDF.start();
        iniciarBarraDeCarregamento.start();

    }

}

class GeradorPDF extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Iniciar geração de PDF:");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF gerado com sucesso!");
    }
}

class BarraDeCarregamento extends Thread {
    private Thread iniciarGeradorPDF;

    public BarraDeCarregamento(Thread iniciarGeradorPDF) {
        this.iniciarGeradorPDF = iniciarGeradorPDF;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);

                if (!iniciarGeradorPDF.isAlive()) {
                    break;
                }
                System.out.println("Loading...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
