package com.aluguelVeiculos.powebsys.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.aluguelVeiculos.powebsys.model.Usuario;
import com.aluguelVeiculos.powebsys.model.UsuarioRepository;
@Controller
public class UsuarioController {
	
	private UsuarioRepository usur;
	public UsuarioController(UsuarioRepository usur) {
		this.usur = usur;
	}
	@GetMapping("usuario/usuarios")
	public String usuarios(Model model) {
		model.addAttribute("listaUsuarios",usur.findAll());
		return "usuario/usuarios/index";
	}
	@GetMapping("usuario/usuarios/nova")
	public String novoUsuario(@ModelAttribute("usuario") Usuario usuario) {
		return "usuario/usuarios/form";
	}
	@PostMapping("usuario/usuarios/salvar")
	public String salvarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usur.save(usuario);
		return "redirect:/usuario/usuarios";
	}
	@GetMapping("usuario/usuarios/{id}")
	public String alterarUsuario(@PathVariable("id") Long id, Model model) {
		Optional<Usuario> usuOpt = usur.findById(id);
		if(!usuOpt.isPresent()) {
			throw new IllegalArgumentException("Usuario invalido");
		}
		model.addAttribute("usuario",usuOpt.get());
		return "usuario/usuarios/form";
	}
	@GetMapping("usuario/usuarios/excluir/{id}")
	public String excluirUsuario(@PathVariable("id") Long id, Model model) {
		Optional<Usuario> usuOpt = usur.findById(id);
		if(!usuOpt.isPresent()) {
			throw new IllegalArgumentException("Usuario invalido");
		}
		else
			usur.delete(usuOpt.get());
		return "redirect:/usuario/usuarios";
	}
	

}
