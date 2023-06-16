public class SupplyTest {
    public static void main(String[] args) throws Exception {
            Supply supplyNoDiscount = new Supply("GasStation1", "001", GasType.ALCOHOL, 20.0, 5.0);

            System.out.println("SUPPLY NO DISCOUNT");
            System.out.println(String.format("GROSS COST:%.2f\nLIQUID COST: %.2f\n", supplyNoDiscount.getGrossCost(), supplyNoDiscount.getLiquidCost()));

            Supply supplyDiscount = new Supply("GasStation1", "001", GasType.GASOLINE_WITH_ADITIVES, 20.0, 5.0, 20.0);

            System.out.println("SUPPLY NO DISCOUNT");
            System.out.println(String.format("GROSS COST:%.2f\nLIQUID COST: %.2f\n", supplyDiscount.getGrossCost(), supplyDiscount.getLiquidCost()));

            try {
                Supply supplyErrorStationCode = new Supply("#ERROR", "001", GasType.ALCOHOL, 20.0, 5.0);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            try {
                Supply supplyErrorPumpCode = new Supply("GasStation1", "Pump", GasType.ALCOHOL, 20.0, 5.0);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            try {
                Supply supplyErrorQntSupplied = new Supply("GasStation1", "001", GasType.ALCOHOL, 0.0, 5.0);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            try {
                Supply supplyErrorPrice = new Supply("GasStation1", "001", GasType.ALCOHOL, 20.0, 0.0);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            try {
                Supply supplyErrorDiscount = new Supply("GasStation1", "001", GasType.ALCOHOL, 20.0, 5.0, -1.0);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
    }

}
