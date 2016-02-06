package jobScheduler;

public class AIXServer extends Server {

	AIXServer(double cpu, double memory) {
		super(cpu, memory);
		// TODO Auto-generated constructor stub
	}

	@Override
	double checkCPU() {
		System.out.println("AIX checking CPU...");
		return this.CPU-this.CPU_ocupied;
	}

	@Override
	double checkMemory() {
		System.out.println("AIX checking Memory...");
		return this.Memory-this.Memory_ocupied;
	}

	@Override
	void checkJobStatus(jobScheduler.Job job) {
		System.out.println("AIX checing job status...");
		System.out.println("Job is whether running, failed or completed");
		
	}

}
