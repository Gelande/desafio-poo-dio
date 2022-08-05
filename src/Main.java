import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso java", "Descrição do curso java", 8);

        Curso curso2 = new Curso("Curso js", "Descrição do curso js", 4);

        Mentoria mentoria = new Mentoria("Mentoria java", "Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("...");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-----------------------------------------------------------------------------------------");

        Dev devAlex = new Dev("Alex");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Alex: " + devAlex.getConteudosInscritos());
        System.out.println("...");
        devAlex.progredir();
        devAlex.progredir();
        devAlex.progredir();
        System.out.println("Conteúdos inscritos Alex: " + devAlex.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Alex: " + devAlex.getConteudosConcluidos());
        System.out.println("XP: " + devAlex.calcularTotalXp());
    }
}
