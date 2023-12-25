package chapter13;

public class Computer implements USB {

	private String model;
	private int diskSize;

	public Computer(String model, int diskSize) {
		this.model = model;
		this.diskSize = diskSize;
	}

	@Override
	public void tramsmitData() {
		System.out.println("ハードディスクのファイルを転送します");

	}

}
