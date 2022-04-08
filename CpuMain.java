package s2java;
class Cpu{
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache(){
			return 5.6;
			
		}
	}
	static class Ram{
		double mempry;
		String manufacturer;
		double getClockSpeed(){
			return 4.9;
		}
	}
}
public class CpuMain {

	public static void main(String[] args) {
		Cpu objcpu=new Cpu();
		Cpu.Processor objproc=objcpu.new Processor();
		Cpu.Ram objram=new Cpu.Ram();
		System.out.println("Processor Cache = "+objproc.getCache());
		System.out.print("Ram Clock Speed = "+objram.getClockSpeed());
	}
}
