package br.com.brunofernandes.mvc.mundi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.brunofernandes.mvc.mundi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Apple iPhone 12 (128 GB)");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/711wsjBtWeL._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Novo-Apple-iPhone-128-Branco/dp/B08L5S4CRB/ref=sr_1_7?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=31EHZCHEEP107&dchild=1&keywords=iphone+12&qid=1622517115&sprefix=iphone%2Caps%2C317&sr=8-7");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
