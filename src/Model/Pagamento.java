package Model;

public class Pagamento {
    private int cartaod;
    private int cartaoc;
    private int pix;
    private int ted;
    private int boleto;
    
    public Pagamento() { }

	public Pagamento(int cartaod, int cartaoc, int pix, int ted, int boleto) {
		super();
		this.cartaod = cartaod;
		this.cartaoc = cartaoc;
		this.pix = pix;
		this.ted = ted;
		this.boleto = boleto;
	}

	public int getCartaod() {
		return cartaod;
	}

	public void setCartaod(int cartaod) {
		this.cartaod = cartaod;
	}

	public int getCartaoc() {
		return cartaoc;
	}

	public void setCartaoc(int cartaoc) {
		this.cartaoc = cartaoc;
	}

	public int getPix() {
		return pix;
	}

	public void setPix(int pix) {
		this.pix = pix;
	}

	public int getTed() {
		return ted;
	}

	public void setTed(int ted) {
		this.ted = ted;
	}

	public int getBoleto() {
		return boleto;
	}

	public void setBoleto(int boleto) {
		this.boleto = boleto;
	}
    
}
