package aula11.enumeracao.exemplo1;

public class PedidoTeste {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(1,"28/04/2026");
		pedido1.imprimirDados();
		
		pedido1.alterarStatusPedido(Status.PROCESSANDO);
		pedido1.imprimirDados();
		
		pedido1.alterarStatusPedido(Status.ENVIADO);
		pedido1.imprimirDados();
		
		pedido1.alterarStatusPedido(Status.ENTREGUE);
		pedido1.imprimirDados();
	}

}
