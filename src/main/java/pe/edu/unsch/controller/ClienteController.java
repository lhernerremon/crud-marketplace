package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.unsch.entities.Cliente;
import pe.edu.unsch.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	
	//List
	@RequestMapping("/")
	public String list(Model model) {
		model.addAttribute("list",clienteService.getAll());
		return "index";
	}
	
	
	//update
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") int id, Model model) {
		if(id != 0) {
			model.addAttribute("cliente", clienteService.get(id));
		}else {
			model.addAttribute("cliente", new Cliente());
		}
		return "save";
	}
	
	//create
	@PostMapping("/save")
	public String save(Cliente cliente, Model model) {
		clienteService.save(cliente);
		return "redirect:/";
	}
	
	
	//delete
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id, Model model) {
		clienteService.delete(id);
		return "redirect:/";
	}
}
