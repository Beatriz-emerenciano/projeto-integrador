package com.appcadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.web.servlet.ModelAndView;

 import com.appcadastro.cadastro.models.usuario;
 import com.appcadastro.repository.usuarioRepository;
 
public class usuarioControler {
	
	@Autowired
	 private usuarioRepository fr;
	
	 @RequestMapping(value = "/usuario", method = RequestMethod.GET)
	 public String abrirusuario() {
	 return "usuario/usuario";
	 }
	
	 @RequestMapping(value = "/usuario", method = RequestMethod.POST)
	 public String gravarfuncionario(usuario usuario) {
	 fr.save(usuario);
	 return "redirect:/usuario";
	 }


}
