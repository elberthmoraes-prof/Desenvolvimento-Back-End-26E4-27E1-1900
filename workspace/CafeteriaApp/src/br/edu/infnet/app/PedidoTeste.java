package br.edu.infnet.app;

public class PedidoTeste {

	public static void main(String[] args) {
		
		System.out.println("=== PEDIDO ===");
		
		Pedido pedidoElberth = new Pedido();
		pedidoElberth.codigo = "ELM1234";
		pedidoElberth.cliente = "Elberth";
		pedidoElberth.quantidade = 2;
		pedidoElberth.valor = 25.50;
		pedidoElberth.impressao();
		
		Pedido pedidoAnna = new Pedido();
		pedidoAnna.codigo = "ABC1234";
		pedidoAnna.cliente = "Annnnna";
		pedidoAnna.quantidade = 4;
		pedidoAnna.valor = 13.13;
		pedidoAnna.impressao();

		Pedido pedidoLidiano = new Pedido();
		pedidoLidiano.codigo = "LID1234";
		pedidoLidiano.cliente = "Lidiano";
		pedidoLidiano.quantidade = 8;
		pedidoLidiano.valor = 24.25;
		pedidoLidiano.impressao();	
	}
}