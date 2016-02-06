import java.util.HashMap;


public class StockTradeTest {


	public static void main(String[] args) {
		HashMap <String,StockTrade> MapOfMarket = new HashMap<String,StockTrade>(); // Map of stock and market
		
		// stock market objects containing open and close time
		StockTrade NASDAQ = new StockTrade(14.5, 21.0); 
		StockTrade NYSE = new StockTrade(14.5,21.0);
		StockTrade HKE = new StockTrade(1.5, 8.0);
		
		// each stock market has a corresponding broker
		Broker brokerNASDAQ = new Broker(NASDAQ);
		Broker brokerNYSE = new Broker(NYSE);
		Broker brokerHKE = new Broker(HKE);
		
		//input stock-market relationship		
		MapOfMarket.put("GOOG", NASDAQ);
		MapOfMarket.put("AAPL", NASDAQ);
		MapOfMarket.put("IBM", NYSE);
		MapOfMarket.put("KO", NYSE);
		MapOfMarket.put("4335", HKE);
		MapOfMarket.put("4338", HKE);
		
		//create command objects
		AgentBuy command1 = new AgentBuy("GOOG", 4596, MapOfMarket);
		AgentSell command2 = new AgentSell("IBM", 7894, MapOfMarket);
		AgentBuy command3 = new AgentBuy("4338", 1646, MapOfMarket);
		AgentSell command4 = new AgentSell("AAPL", 7643, MapOfMarket);
		AgentBuy command5 = new AgentBuy("KO", 9673, MapOfMarket);
		AgentSell command6 = new AgentSell("4335", 3002, MapOfMarket);
		
		//set time
		Clock.setTime(1, 16.0);
		
		//broker get and apply the commands
		brokerNASDAQ.getCommand(command1);
		brokerNASDAQ.applyCommand();
		brokerNYSE.getCommand(command2);
		brokerNYSE.applyCommand();
		brokerHKE.getCommand(command3);
		brokerHKE.applyCommand();
		
		Clock.setTime(0, 5.0);
		brokerNASDAQ.getCommand(command4);
		brokerNASDAQ.applyCommand();
		brokerNYSE.getCommand(command5);
		brokerNYSE.applyCommand();
		brokerHKE.getCommand(command6);
		brokerHKE.applyCommand();
		
		Clock.setTime(1, 15.0);
		brokerNASDAQ.getCommand(command1);
		brokerNASDAQ.applyCommand();
		brokerNYSE.getCommand(command2);
		brokerNYSE.applyCommand();
		brokerHKE.getCommand(command3);
		brokerHKE.applyCommand();
		

		
		
		

		
		
		

	}

}
