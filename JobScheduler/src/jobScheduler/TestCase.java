package jobScheduler;

public class TestCase {

	public static void main(String[] args) {
		Server [] serverlist = new Server[4]; //create 4 different type of servers
		serverlist[0] = new LinuxServer(3.5, 32);
		serverlist[1] = new AIXServer(3.2, 16);
		serverlist[2] = new SolarisServer(3.0, 16);
		serverlist[3] = new WindowsServer(4.0, 64);
		
		Scheduler scheduler = new Scheduler(serverlist);
		
		Job job1 = new Job("001","job1", 3, 1.1, 4, "some command");
		
		scheduler.Clock = 3; //set time
		scheduler.getJob(job1);
		scheduler.runJob(job1);
		scheduler.checkJobStatus(job1);
		
		Job job2 = new Job("002","job2", 3, 2.6, 4, "some command");
		
		scheduler.Clock = 1;
		scheduler.getJob(job2);
		scheduler.runJob(job2);
		scheduler.checkJobStatus(job2); 
		
		
		

		
		

	}

}
