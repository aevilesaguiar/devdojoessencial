package br.com.devdojo.awesome.endpoint;


import br.com.devdojo.awesome.model.Student;

import br.com.devdojo.awesome.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

//endpoint será o ponto final onde os nossos usuarios vai acessar nosso api
//Basicamente endpoint quando estamos falando em aplicações web, é basicamente a URL onde um serviço pode ser acessado por uma aplicação cliente.
//http:\\meusite.com\api\v1\fotos\lista

@RestController//Essa anotação é usada no nível da classe e permite que a classe trate as solicitações feitas pelo cliente.
@RequestMapping("student")//endpoint
@Component
@Service
@Repository

public class StudentEndPoint {

    @Autowired
    private DateUtil dateUtil;

@RequestMapping(method = RequestMethod.GET,path = "/list")
    public List<Student> listAll(){

    System.out.println("Data e hora Atual: "+dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return Arrays.asList(new Student("Ana"),new Student("Flávio"),new Student("Inez"));

    }


}
