package br.edu.infnet.testes;

import br.edu.infnet.app.DespachoPedido;
import br.edu.infnet.app.Endereco;
import br.edu.infnet.app.Pedido;
import br.edu.infnet.app.Prioridade;

public class PedidoTeste {

	public static void main(String[] args) {
		
		System.out.println("PRIORIDADE  DATA/HORA            CÓDIGO    CLIENTE                 QTD   VALOR      ENDEREÇO");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		
		DespachoPedido[] despachos = new DespachoPedido[4];
		
		System.out.println("=== PEDIDO ===");
		
		Endereco endElberth = new Endereco("rua tal", "cidade tal", "20010-020");
		
		Pedido pedidoElberth = new Pedido();
		pedidoElberth.setCodigo("ELM1234");
		pedidoElberth.setCliente("Elberth");
		pedidoElberth.setQuantidade(2);
		pedidoElberth.setValor(25.50);
		pedidoElberth.setPrioridade(Prioridade.URGENTE);
		pedidoElberth.setEndereco(endElberth);
		pedidoElberth.impressao();

		despachos[0] = new DespachoPedido(pedidoElberth.getCodigo(), pedidoElberth.getDataCriacao());
		
		Endereco endZeGuilherme = new Endereco("rua do gui", "cidade gui", "22010-020");
		
		Pedido pedidoZeGuilherme = new Pedido("JOS3456", "José Gui");
		pedidoZeGuilherme.setQuantidade(2);
		pedidoZeGuilherme.setValor(25.50);
		pedidoZeGuilherme.setPrioridade(Prioridade.URGENTE);
		pedidoZeGuilherme.setEndereco(endZeGuilherme);
		pedidoZeGuilherme.impressao();
		despachos[1] = new DespachoPedido(pedidoZeGuilherme.getCodigo(), pedidoZeGuilherme.getDataCriacao());

		try {
			Pedido pedidoAnna = new Pedido("ABC1234", "Annnnna", 4);
			pedidoAnna.setValor(0);
			pedidoAnna.setPrioridade(Prioridade.LEVE);
			pedidoAnna.impressao();
		} catch (IllegalArgumentException e) {
			System.err.println("[error] " + e.getMessage());
		}
		
		Endereco endLidiano = new Endereco("rua do lid", "cidade lid", "23010-020");

		Pedido pedidoLidiano = new Pedido("LID1234", "Lidiano", 8, 24.25);
		pedidoLidiano.setPrioridade(Prioridade.LEVE);
		pedidoLidiano.setEndereco(endLidiano);
		pedidoLidiano.impressao();
		despachos[2] = new DespachoPedido(pedidoLidiano.getCodigo(), pedidoLidiano.getDataCriacao());
		
		Endereco endPedido = new Endereco("rua do pedido", "cidade pedido", "24010-020");

		Pedido oPedido = new Pedido("FLA0000", "Sandoval", 12, 10);
		oPedido.setEndereco(endPedido);
		System.out.println("A data de criação do pedido " + oPedido.getCodigo() + " é " + oPedido.getDataCriacao());
		despachos[3] = new DespachoPedido(oPedido.getCodigo(), oPedido.getDataCriacao());

		System.out.println("=== RELATÓRIO DE PEDIDOS DESPACHADOS ===");
		for(DespachoPedido despacho : despachos) {
			System.out.println(despacho);
		}
		System.out.println("=== TOTAL DE PEDIDOS: " + Pedido.getTotalPedidos() + " ===");
	}
}