package Task9;
/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class use to define destop
 */
public class Desktop extends Computer {
	
	private String cpu;
	private String ram;
	
	public Desktop(String id, double unitPrice, String manufactuer, int numberOf, String cpu, String ram) {
		super(id, unitPrice, manufactuer, numberOf);
		this.cpu = cpu;
		this.ram = ram;
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	/*
	 * Summary: use to print information computer
	 * output: String information desktop include id, manufacturer, unit price, CPU and RAM
	 */
	public String toString() {
		return "Id: " + this.Id + "\nManufacturer: " + this.manufacturer + "\nUnit price: " + this.unitPrice
				+ "\nCPU: " + this.cpu + "\nRAM: " + this.ram; 
	}
	
}
