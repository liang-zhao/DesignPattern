package jobScheduler;
import java.util.HashMap;

public class Scheduler {
	
	int Clock;                               //internal clock
	HashMap <Job, Integer> Map = new HashMap <Job,Integer>();
	Server[] serverlist;
	
	Scheduler(Server[] serverList){          //constructor read the list of servers
		
		this.serverlist = serverList;
		
	}
	
	void getJob(Job job){
		for (int i=0; i<serverlist.length; i++){
			serverlist[i].login();
			if(serverlist[i].checkCPU() >= job.CPU_r && serverlist[i].checkMemory() >= job.Memory_r){ //check CPU and memory
				Map.put(job,i); //add the job-server pair into hash map		
				System.out.println("Assign " + job.Name + " to server" + Integer.toString(i));
				break;
			}
			
		}		
	}
	
	void runJob(Job job){
		if (Clock == job.StartTime){ //decide when to run the job
		serverlist[Map.get(job)].runJob(job,job.Command);
		}
		else System.out.println("The time is not right!");
		
	}
	
	void checkJobStatus(Job job){
		serverlist[Map.get(job)].checkJobStatus(job); //check the job status
	}
	
	

}
