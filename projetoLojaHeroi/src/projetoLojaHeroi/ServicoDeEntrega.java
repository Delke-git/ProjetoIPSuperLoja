package projetoLojaHeroi;

public class ServicoDeEntrega {
	private int distancia;
	private String tipoDeEntrega;
	private Venda venda;
	//private RepositorioEntregas ServiçoDeEntrega;
	
	public ServicoDeEntrega(int distancia,String tipoDeEntrega,Venda venda) {
		this.distancia=distancia;
		this.tipoDeEntrega=tipoDeEntrega;
		this.venda=venda;
	}

	public int getDistancia() {
		return distancia;
	}

	public String getTipoDeEntrega() {
		return tipoDeEntrega;
	}

	//public Venda getVenda() {
		//return venda;
	//}
	
	public int calcularDistancia(int distanciaX,int distanciaY,int distanciaZ) {
		int calculo=0;
		if (distancia>0&&distancia<100) {
			calculo=Math.sqrt()
		}
		else if (distancia>=100&&distancia<1000) {
			
		}else if (distancia>1000) {
			
		}
	}
}

