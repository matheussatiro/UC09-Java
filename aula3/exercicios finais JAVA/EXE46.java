
// Formatador de Data: Receba dia, mês, ano e imprima no formato DD/MM/AAAA com dois dígitos.

public class EXE46 {
    public static void main(String[] args) {
        int dia = 1;
        int mes = 2;
        int ano = 2026;

        String dataFormatada = String.format("%02d/%02d/%04d", dia, mes, ano);
        System.out.println("Data formatada: " + dataFormatada);
    }
}
