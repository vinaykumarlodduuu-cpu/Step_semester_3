
package Week1;

public class WarehouseInventoryBalancer {

    static void analyzeInventory(int[] quantities) {

        int sectionATotal = 0;
        int sectionBTotal = 0;

        int highestQuantity = quantities[0];
        int highestIndex = 0;

        for (int i = 0; i < quantities.length; i++) {

            if (i % 2 == 0) {
                sectionATotal += quantities[i];
            } else {
                sectionBTotal += quantities[i];
            }

            if (quantities[i] > highestQuantity) {
                highestQuantity = quantities[i];
                highestIndex = i;
            }
        }

        System.out.println("Section A Total: " + sectionATotal);
        System.out.println("Section B Total: " + sectionBTotal);

        if (sectionATotal == sectionBTotal) {
            System.out.println("Inventory Status: Balanced");
        } else {
            System.out.println("Inventory Status: Not Balanced");
        }

        System.out.println("Highest Quantity: " + highestQuantity);
        System.out.println("Highest Quantity Index: " + highestIndex);
    }

    public static void main(String[] args) {

        int[] quantities = {20, 30, 40, 30, 25, 25};

        analyzeInventory(quantities);
    }
}