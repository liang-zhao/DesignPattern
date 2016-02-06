package jobScheduler;

public abstract class Server {                             //abstract server class
	  double CPU; //in GHz
	  double CPU_ocupied = 0;
	  double Memory; //in GB
	  double Memory_ocupied = 0;
	  Job Job;
	  
	  Server(double cpu, double memory){                   //constructor
		  this.CPU = cpu;
		  this.Memory = memory;
		  
		  
	  }
	  
	  
	  
	  void login(){                                         //login
		  System.out.println("ssh login succesful!");
		  
	  }
	  
	  void runJob(Job job, String command){                 //run the command from job.
		 this.Job = job;
		 System.out.println("Running job " + Job.Name);
		 CPU_ocupied = CPU_ocupied + Job.CPU_r;
		 Memory_ocupied = Memory_ocupied + Job.Memory_r;
		 
		  
	  }
	  
	  abstract double checkCPU(); //check CPU remain
	  abstract double checkMemory(); // check memory remain
	  abstract void checkJobStatus(Job job); // check job status  
	  
	  
	  

}
