
// Simulador de Checkout: Aplique um desconto no item mais caro de três e imprima um resumo formatado.

public class EXE43 {
    public static void main(String[] args) {
        double item1 = 29.99;
        double item2 = 49.99;
        double item3 = 19.99;

        double maxPrice = Math.max(item1, Math.max(item2, item3));
        double discount = maxPrice * 0.10; // Desconto de 10%
        double discountedPrice = maxPrice - discount;

        System.out.println("Resumo do Checkout:");
        System.out.printf("Item 1: $%.2f%n", item1);
        System.out.printf("Item 2: $%.2f%n", item2);
        System.out.printf("Item 3: $%.2f%n", item3);
        System.out.printf("Desconto aplicado no item mais caro: $%.2f%n", discount);
        System.out.printf("Preço do item mais caro após desconto: $%.2f%n", discountedPrice);
    }
}
