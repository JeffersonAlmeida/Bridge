package bridge;

public abstract class ComponentesUI {
	
	private int largura;
	private int altura;
	private OperatingSystem operatingSystem;
	
	
	public ComponentesUI(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		// Neste ponto seria otimo descobrir o sistema operacioanal em uso
		operatingSystem = Factory.getInstance().createOperatingSystem("WindowsXp");
	}
	public abstract void operation();
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}	
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
}
