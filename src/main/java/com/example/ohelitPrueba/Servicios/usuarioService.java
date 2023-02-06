package com.example.ohelitPrueba.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ohelitPrueba.Modelos.usuarioModel;
import com.example.ohelitPrueba.Repositorios.usuarioRepository;

// dev_JB - ponemos la etqueta @Service para definir que es un servicio
@Service
public class usuarioService {

    // dev_JB - ponemos la etiqueta @Autowired para importar las intefaces que tenemos creadas
    @Autowired
    usuarioRepository usuarioRepository;

    // dev_JB - creamos el primer metodo listar todos los usuarios
    public ArrayList<usuarioModel> listarUsuarios(){
        return (ArrayList<usuarioModel>) usuarioRepository.findAll();
    }

    // dev_JB - creamos el segundo metodo ver detalle de un usuario
    public Optional<usuarioModel> detalleUsuario(Long id){
        return usuarioRepository.findById(id);
    }

    // dev_JB - creamos el tercer metodo crear un usuario
    public usuarioModel crearUsuario(usuarioModel producto){
        return usuarioRepository.save(producto);
    }

    // dev_JB - creamos el tercer metodo eliminar un usuario
    public boolean eliminarUsuario(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
