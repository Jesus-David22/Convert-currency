package calculos;

public class CurrencyConverter {
        private double dollarPrice;
    
        public CurrencyConverter(double dollarPrice) {
            this.dollarPrice = dollarPrice;
        }
    
        public double convertDollarsToReais(double dollars) {
            double totalWithoutIOF = dollars * dollarPrice;
            double totalWithIOF = totalWithoutIOF + (totalWithoutIOF * 0.06);
    
            return totalWithIOF;
        }
}
