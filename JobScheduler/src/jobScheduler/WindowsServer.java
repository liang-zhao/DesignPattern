package jobScheduler;

public class WindowsServer extends Server {

	public WindowsServer(double cpu, double memory) {
		super(cpu, memory);
		// TODO Auto-generated constructor stub
	}

	@Override
	double checkCPU() {
		System.out.println("Windows checking CPU...");
		return this.CPU-this.CPU_ocupied;
	}

	@Override
	double checkMemory() {
		System.out.println("Windows checking Memory...");
		return this.Memory-this.Memory_ocupied;
	}

	@Override
	void checkJobStatus(jobScheduler.Job job) {
		System.out.println("Windows checing job status...");
		System.out.println("Job is whether running, failed or completed");
		
	}

}
