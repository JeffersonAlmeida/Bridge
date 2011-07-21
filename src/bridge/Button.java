package bridge;

public class Button extends ComponentesUI {

	
	public Button(int largura, int altura) {
		super(largura, altura);
	}

	@Override
	public void operation() {
		getOperatingSystem().operationImpl();
	}

}
