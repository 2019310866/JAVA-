package pack1;

public class PC {

	CPU cpu;
	HardDisk disk;
	void setCPU(CPU cpu){
		this.cpu=cpu;
	}
	void setHardDisk(HardDisk disk){
		this.disk=disk;	
	}
	void show(){
		System.out.println("CPUÀŸ∂»"+cpu.getSpeed());
		System.out.println("”≤≈Ã»›¡ø"+disk.getAmount());
	}

}