package org.ricardoacevedo.kalumn.kalumn.controller;

import org.ricardoacevedo.kalumn.kalumn.bs.dao.CarreraRepository;
import org.ricardoacevedo.kalumn.kalumn.bs.dao.PersonaRepository;
import org.ricardoacevedo.kalumn.kalumn.bs.dao.PuestoRepository;
import org.ricardoacevedo.kalumn.kalumn.core.eir.bo.Alumno;
import org.ricardoacevedo.kalumn.kalumn.core.eir.bo.Carrera;
import org.ricardoacevedo.kalumn.kalumn.core.eir.bo.Empleado;
import org.ricardoacevedo.kalumn.kalumn.core.eir.bo.Puesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    private CarreraRepository carreraRepository;
    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private PuestoRepository puestoRepository;
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        Carrera c1 = new Carrera();
        Carrera c2 = new Carrera();
        c1.setDescripcion("Informatica");
        c2.setDescripcion("Electronica");

        carreraRepository.save(c1);
        carreraRepository.save(c2);

        Puesto p1 = new Puesto();
        Puesto p2 = new Puesto();
        p1.setDescripcion("Maestro de Informatica");
        p2.setDescripcion("Maestro de Mecanica");

        puestoRepository.save(p1);
        puestoRepository.save(p2);

        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();

        a1.setNombre("Ricardo");
        a1.setApellido("Acevedo");
        a1.setDireccion("2-55 8 avenida zona 16");
        a1.setTelefono("48216515");
        a1.setEmail("racevedo@gmail.com");
        a1.setFechaNacimiento("01/04/2000");
        a1.setCarne("2013-313");
        a1.setCarrera(c1);

        a2.setNombre("Henry");
        a2.setApellido("Rodriguez");
        a2.setDireccion("2-55 7avenida zona 11");
        a2.setTelefono("49315620");
        a2.setEmail("hrodriguez@gmail.com");
        a2.setFechaNacimiento("15/07/1998");
        a2.setCarne("2012-486");
        a2.setCarrera(c2);

        personaRepository.save(a1);
        personaRepository.save(a2);


        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado();

        e1.setNombre("Omar");
        e1.setApellido("Alvarado");
        e1.setDireccion("8-77 8avenida zona 18");
        e1.setTelefono("24685845");
        e1.setEmail("oalvarado@gmail.com");
        e1.setFechaNacimiento("10/07/1971");
        e1.setDpi("41250252-1");
        e1.setPuesto(p1);

        e2.setNombre("Pedro");
        e2.setApellido("Herrarte");
        e2.setDireccion("2-88 24 calle zona 1");
        e2.setTelefono("43168513");
        e2.setEmail("pherrarte@gmail.com");
        e2.setFechaNacimiento("10/07/1965");
        e2.setDpi("65157862-1");
        e2.setPuesto(p2);

        personaRepository.save(e1);
        personaRepository.save(e2);

        String response = "Bienvenido al sistema EDU";
        return response;
    }
}