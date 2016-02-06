import java.util.ArrayList;



public class Broker  {
	
	StockTrade stocktrade;
	double Time;
	int Weekday;
	Command command;
	ArrayList<Command> WaitList = new ArrayList<Command>(); // used to store the queued commands
	
	
	
	public Broker(StockTrade stocktrade){
		
		//set which stock market the broker serving
		this.stocktrade = stocktrade;

		
	}
	
	public void getCommand(Command command){
		// get the command
		this.command = command;
	}
	
	public void applyCommand(){
		// get time
		this.Time = Clock.Time;
		this.Weekday = Clock.Weekday;
		
		//if market open, execute; if closed queue the command
		if (Time >= stocktrade.OpenTime && Time <= stocktrade.CloseTime && Weekday == 1){
			command.execute();
			for (Command c : WaitList){
				c.execute();
						
			}
			WaitList.clear();
			System.out.println("Trade succeeded!");

		}
		else{
			WaitList.add(command);
			System.out.println("Market closed, trade pending.");  
			
		}
		
	}
}
