import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriçao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Fernando" + devFernando.getConteudosInscritos());
        devFernando.progredir();
        devFernando.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Fernando" + devFernando.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Fernando" + devFernando.getConteudosConcluidos());
        System.out.println("XP: " + devFernando.calcularTotalXp());

        System.out.println("----------");

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos José" + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos José" + devJose.getConteudosInscritos());
        System.out.println("Conteudos Concluidos José" + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devJose.calcularTotalXp());

    }
}
