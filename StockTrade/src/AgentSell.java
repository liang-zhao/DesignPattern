import java.util.HashMap;


public class AgentSell implements Command{

	String symbol;
	int amount;
	StockTrade market;
	
	
	public AgentSell(String symbol, int amount, HashMap<String, StockTrade> map){
		
		this.symbol = symbol; // get symbol from client
		this.amount = amount; // get amount from client    
		this.market = map.get(symbol); //look up market from map
				
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		market.sell(symbol, amount);
	}


}
