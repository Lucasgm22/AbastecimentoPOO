public class Supply {

    private static final String GAS_STATION_CODE_REGEX = "^[a-zA-Z0-9]+$";
    private static final String GAS_PUMP_CODE_REGEX = "^[0-9]+$";


    private String gasStationCode;
    private String gasPumpCode;
    private GasType gasType;
    private Double quantitySuplied;
    private Double pricePerLiter;
    private Double discount;

    public Supply(String gasStationCode, String gasPumpCode, GasType gasType, Double quantitySuplied, Double pricePerLiter, Double discount) {
        setGasStationCode(gasStationCode);
        setGasPumpCode(gasPumpCode);
        this.gasType = gasType;
        setQuantitySuplied(quantitySuplied);
        setPricePerLiter(pricePerLiter);
        setDiscount(discount);
    }

    public Supply(String gasStationCode, String gasPumpCode, GasType gasType, Double quantitySuplied, Double pricePerLiter) {
        setGasStationCode(gasStationCode);
        setGasPumpCode(gasPumpCode);
        this.gasType = gasType;
        setQuantitySuplied(quantitySuplied);
        setPricePerLiter(pricePerLiter);
        setDiscount(0.0);
    }

    private void setGasStationCode(String gasStationCode) {
        if (!gasStationCode.matches(GAS_STATION_CODE_REGEX)) {
            throw new IllegalArgumentException("Gas Station Code provide does not match with rule of formation of code");
        }
        this.gasStationCode = gasStationCode;
    }

    private void setGasPumpCode(String gasPumpCode) {
        if (!gasPumpCode.matches(GAS_PUMP_CODE_REGEX)) {
            throw new IllegalArgumentException("Gas Pump Code provide does not match with rule of formation of code");
        }
        this.gasPumpCode = gasPumpCode;
    }

    private void setQuantitySuplied(Double quantitySuplied) {
        if (quantitySuplied == null || quantitySuplied <= 0.0) {
            throw new IllegalArgumentException("Quantity suplied must be positive");
        }
        this.quantitySuplied = quantitySuplied;
    }

    private void setPricePerLiter(Double pricePerLiter) {
        if (pricePerLiter == null || pricePerLiter <= 0.0) {
            throw new IllegalArgumentException("Price per liter must be positive");
        }
        this.pricePerLiter = pricePerLiter;
    }

    private void setDiscount(Double discount) {
        if (discount == null || discount < 0.0) {
            throw new IllegalArgumentException("Discount must non negative");
        }
        this.discount = discount;
    }


    public Double getGrossCost() {
        return this.quantitySuplied * this.pricePerLiter;
    }


    public Double getLiquidCost() {
        return getGrossCost() - this.discount;
    }
}