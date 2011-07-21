package bridge;

public class Factory {
	private static Factory factory;
	
	private Factory() {
		super();
	}
	
	public OperatingSystem createOperatingSystem(String type){
		OperatingSystem operatingSystem = null;
		if(type.equals("Ubuntu")){
			operatingSystem = new Ubuntu();
		}else if(type.equals("WindowsXp")){
			operatingSystem = new WindowsXP();
		}
		return operatingSystem;
	}
	
	public static Factory getInstance(){
		if(factory==null){
			factory = new Factory();
		}
		return factory;
	}
}
