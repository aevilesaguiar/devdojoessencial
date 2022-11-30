package br.com.devdojo.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//DevdojoessencialApplication será a classe responsável por iniciar/startar o spring boot
//diferente de projetos web aonde você tem que startar um servidor, aqui vai startar o sprig boot
//e ele vai se encarregar de startar o tomcat , o servlet container que ele ele estiver utilizando para você
@SpringBootApplication
@ComponentScan
public class DevdojoessencialApplication {

    public static void main(String[] args) {

        //SpringApplication é usada para inicializar e iniciar um aplicativo Spring a partir de um método principal Java .
        // Essa classe cria automaticamente o ApplicationContext a partir do caminho de classe, verifica as classes de configuração e ativa o aplicativo.
        //O  ApplicationContext  é a interface central em um aplicativo Spring para fornecer informações de configuração ao aplicativo.
        SpringApplication.run(DevdojoessencialApplication.class, args);


    }

}
