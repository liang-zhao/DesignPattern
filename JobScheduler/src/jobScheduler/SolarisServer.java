package jobScheduler;

public class SolarisServer extends Server {

	public SolarisServer(double cpu, double memory) {
		super(cpu, memory);
		// TODO Auto-generated constructor stub
	}

	@Override
	double checkCPU() {
		System.out.println("Solaris checking CPU...");
		return this.CPU-this.CPU_ocupied;
	}

	@Override
	double checkMemory() {
		System.out.println("Solaris checking Memory...");
		return this.Memory-this.Memory_ocupied;
	}

	@Override
	void checkJobStatus(jobScheduler.Job job) {
		System.out.println("Solaris checing job status...");
		System.out.println("Job is whether running, failed or completed");
		
	}

}
