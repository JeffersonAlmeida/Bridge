package bridge;

public class ImageButton extends ComponentesUI {

	public ImageButton(int largura, int altura) {
		super(largura, altura);
	}

	@Override
	public void operation() {
		getOperatingSystem().operationImpl();
	}

}
