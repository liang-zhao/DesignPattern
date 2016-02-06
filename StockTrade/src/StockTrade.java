
class StockTrade {
	
    double OpenTime;
    double CloseTime;
	
    StockTrade(double opentime, double closetime){
		this.OpenTime = opentime;
		this.CloseTime = closetime;
	}
	
	public  void buy(String symbol, int amount) {
        System.out.println("Buy " + amount + " " + symbol + " stocks" );
    }
    public  void sell(String symbol, int amount) {
        System.out.println("Sell " + amount + " " + symbol + " stocks");
    }
}
