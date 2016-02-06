package jobScheduler;
// class for the jobs.
public class Job {
	String ID;
	String Name;
	int StartTime;
	double CPU_r;
	double Memory_r;
	String Command;
    
	public Job(String id, String name, int startTime, double cpu_r, double memory_r, String command){
		this.ID = id;
		this.Name = name;
		this.StartTime = startTime;
		this.CPU_r = cpu_r;
		this.Memory_r = memory_r;
		this.Command = command;
    	
    }
	
	
}
