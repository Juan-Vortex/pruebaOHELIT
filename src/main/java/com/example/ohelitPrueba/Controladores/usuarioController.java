package com.example.ohelitPrueba.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ohelitPrueba.Modelos.usuarioModel;
import com.example.ohelitPrueba.Servicios.usuarioService;

// dev_JB - agregamos la etiqeuta @RestController para identificar que sea un Controlador del proyecto
// dev_JB - agregamos la etiqeuta @RequestMapping("") para identificar la ruta de los endpoint
@RestController
@RequestMapping("/usuario")
// @CrossOrigin(origins = "http://localhost:4200/")
public class usuarioController {

    @Autowired
    usuarioService serviciosUsuarioService;

    @GetMapping()
    public ArrayList<usuarioModel> listarProductos(){
        return this.serviciosUsuarioService.listarUsuarios();
    }

    @GetMapping(path = "/{id}")
    public Optional<usuarioModel> detalleProducto(@PathVariable("id") Long id){
        return this.serviciosUsuarioService.detalleUsuario(id);
    }

    @PostMapping()
    public usuarioModel crearProducto(@RequestBody usuarioModel producto){
        return this.serviciosUsuarioService.crearUsuario(producto);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarProducto(@PathVariable("id") Long id){
        boolean ok = this.serviciosUsuarioService.eliminarUsuario(id);
        if (ok) {
            return "Producto eliminado con exito";
        }else{
            return "Error al eliminar el Producto";
        }
    }
    
}
