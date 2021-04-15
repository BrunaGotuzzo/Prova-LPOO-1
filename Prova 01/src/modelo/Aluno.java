package modelo;
import java.util.Objects;

public class Aluno {
	     private   int  id;
	     private   int  cpf;
	     private String nome;
	     private String sobrenome;
	     private String email;

   public Aluno() {  
			}
	   
		public Aluno(int  id, int  cpf, String nome, String sobrenome, String email) {
			super();
			this.id = id;
			this.cpf = cpf;
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.email = email;

		}

	//GET & SETTERS	 
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		//hashCode
	    @Override
	    public int hashCode() {  return   Objects.hash(id);   }


		@Override
		public String toString() {
			return "Aluno ["
					+ "id=" + id + "\n"
					+ "cpf=" + cpf +  "\n"
					+ "nome=" + nome + "\n"
					+ "sobrenome=" + sobrenome + "\n"
					+ "email=" + "\n"
					+ email + "]" + "\n"  + "\n";
		}
	 	
}
