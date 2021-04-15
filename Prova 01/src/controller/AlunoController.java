package controller;
 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
  
import modelo.Aluno;

public class AlunoController {
	
	public static void main(String[] args) {
		//QUESTÂO 1
		
//Parte 1: Criar 6 instancias entre padrão e parametrizado //
		
		    Aluno aluno1= new Aluno(1, 234422, "João", "Silva", "joao_Silva@hotmail.com");
		    Aluno aluno2= new Aluno(2, 335522, "Maria", "Rodrigues", "maria_rodri@hotmail.com");
		    Aluno aluno3= new Aluno(3, 664322, "Rodrigo", "Carvalho", "rod_carvalho@hotmail.com");
		    Aluno aluno4= new Aluno(4, 366770, "Ana", "Silva", "ana_silva@hotmail.com");
		    Aluno aluno5= new Aluno();
		    Aluno aluno6= new Aluno();

	//Imprimir
	        System.out.println("\nAlunos:\n");
	        System.out.println(aluno1 + "\n" + aluno2 + "\n" + aluno3 + "\n" + aluno4 + "\n" + aluno5 + "\n" + aluno6 + "\n");

//Parte 2: Adicionar Alunos 5 & 6 //	        
 
   //Aluno 5
	   aluno5.setId(5);
	   aluno5.setCpf(663721);
	   aluno5.setNome("Juliana");
	   aluno5.setSobrenome("Machado");
	   aluno5.setEmail("juMachado@gmail.com");
	       
   //Aluno 6
	   aluno6.setId(6);
	   aluno6.setCpf(6789663);
	   aluno6.setNome("Daniela");
	   aluno6.setSobrenome("Oliveira");
	   aluno6.setEmail("DaniVeira@gmail.com");

   System.out.println("Alunos 5 & 6\n");
   System.out.println("Aluno:\n" + "Id: " + aluno5.getId() + "  " +"Cpf: " + aluno5.getCpf() + "  " +"Nome: " + aluno5.getNome() + "  " +"Sobrenome: " + aluno5.getSobrenome()+"  " + "Email: " + aluno5.getEmail() + "\n");  
   System.out.println("Aluno:\n" + "Id: " + aluno6.getId() + "  " +"Cpf: " + aluno6.getCpf() + "  " +"Nome: " + aluno6.getNome() + "  " +"Sobrenome: " + aluno6.getSobrenome()+"  " + "Email: " + aluno6.getEmail() + "\n");  

		//QUESTÂO 2
   
//LIST & MAP

//List
List<Aluno>alunos= new ArrayList<>();
alunos.add(aluno1);
alunos.add(aluno2);
alunos.add(aluno3);
alunos.add(aluno4);
alunos.add(aluno5);
alunos.add(aluno6);


System.out.println("--------- Lista Ordenada ---------\n");
alunos.sort(Comparator.comparing(Aluno::getId));
System.out.println(alunos);


//Map
Map  mapAluno = new HashMap();
mapAluno.put(aluno1.hashCode(),aluno1);
mapAluno.put(aluno2.hashCode(),aluno2);
mapAluno.put(aluno3.hashCode(),aluno3);
mapAluno.put(aluno4.hashCode(),aluno4);
mapAluno.put(aluno5.hashCode(),aluno5);
mapAluno.put(aluno6.hashCode(),aluno6);

System.out.println("\nMap:\n");
System.out.println(mapAluno);


//Imprimir o objeto de id=5
System.out.println("\nObjeto de id=5 \n");

alunos.forEach(p -> {
	    if(p.getId() == 5) 
	        System.out.println(p);
 }
);


//Ordenar os objetos em ordem decrescente
alunos.sort(Comparator.comparingInt(Aluno::getId).reversed());
System.out.println("Listar em Ordem Decrescente:\n\n" +  alunos + "\n");
 
}
}

