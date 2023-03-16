package Package1;

public class persona extends Quien {

	private Boolean bigote;
	private Boolean rubio;
	private Boolean coreano;
	private Boolean peinado;
	
	public persona (String n, Boolean b, Boolean r, Boolean c, Boolean p) {
		super(n);
		this.setBigote(b);
		this.setRubio(r);
		this.setCoreano(c);
		this.setPeinado(p);
	}

	public Boolean getBigote() {
		return bigote;
	}

	public void setBigote(Boolean bigote) {
		this.bigote = bigote;
	}

	public Boolean getRubio() {
		return rubio;
	}

	public void setRubio(Boolean rubio) {
		this.rubio = rubio;
	}

	public Boolean getCoreano() {
		return coreano;
	}

	public void setCoreano(Boolean coreano) {
		this.coreano = coreano;
	}

	public Boolean getPeinado() {
		return peinado;
	}

	public void setPeinado(Boolean peinado) {
		this.peinado = peinado;
	}
	
	
	
}
