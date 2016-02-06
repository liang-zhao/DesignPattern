package jobScheduler;

public class LinuxServer extends Server{

	LinuxServer(double cpu, double memory) {
		super(cpu, memory);
		// TODO Auto-generated constructor stub
	}

	@Override
	double checkCPU() {
		System.out.println("Linux checking CPU...");
		return this.CPU-this.CPU_ocupied;
	}

	@Override
	double checkMemory() {
		System.out.println("Linux checking Memory...");
		return this.Memory-this.Memory_ocupied;
	}

	@Override
	void checkJobStatus(jobScheduler.Job job) {
		System.out.println("Linux checing job status...");
		System.out.println("Job is whether running, failed or completed");
		
	}

}
