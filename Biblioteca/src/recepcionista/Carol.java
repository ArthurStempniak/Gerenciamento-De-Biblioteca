package recepcionista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import livros.Livro;

public class Carol {

    public static void main(String[] args) {
        
        List<Livro> biblioteca = new ArrayList<>();
        
        biblioteca.add(new Livro("Jackson", "Academia", "A!!!!CADEMIA", 1859));
        biblioteca.add(new Livro("Ricardão","Suspeito","É ESSA PEÇA QUE VOCÊ QUERIA??????????????",1860));
        
        Scanner scan = new Scanner(System.in);
        
    	System.out.println("1)Entrar como Administrador");
    	System.out.println("2)Entrar como Usuário");
    	
    	int opcaoentrada = scan.nextInt();
    	scan.nextLine();
		String usuario1 = "Patrick";
		String senha1 = "Patrick123";
		String usuario = "";
		String senha = "";
		if(opcaoentrada == 1) {
		
		System.out.println("Insira o Usuario");
		System.out.println("Insira a senha");
		usuario = scan.next();
		senha = scan.next();
		
		
	}
        while (true) {
        	

        	
        	if( opcaoentrada==1 ){
        		

        		if (usuario1.equals(usuario)  & senha1.equals(senha)){
                    System.out.println("Escolha uma das opções");
                    System.out.println("1) Ver Biblioteca");
                    System.out.println("2) Adicionar Livro");
                    System.out.println("3) Buscar Livro");
                    System.out.println("4) Excluir Livro");
                    System.out.println("5) Sair");
                    
                    int opcao = scan.nextInt();
                    scan.nextLine();
                    
                    if (opcao == 1) {
                    if (biblioteca.isEmpty()) {
                    System.out.println("A biblioteca está vazia.");
                    } 
                    else {
                    for (Livro livro : biblioteca) {
                    System.out.println(livro.toString());
                    }
                    }
                    
        }

                    else if (opcao == 2) {
                        System.out.println("Informe o autor do livro:");
                        String autor = scan.nextLine();
                        
                        System.out.println("Informe o tema do livro:");
                        String tema = scan.nextLine();
                        
                        System.out.println("Informe o título do livro:");
                        String titulo = scan.nextLine();
                        
                        System.out.println("Informe o ano do livro:");
                        Integer ano = scan.nextInt();
                        
                        Livro novoLivro = new Livro(autor, tema, titulo, ano);
                        biblioteca.add(novoLivro);
                        System.out.println("Livro adicionado com sucesso.");
                        
                    }
                    if (opcao == 3) {
                    	
                        System.out.println("Insira o titulo do livro que quer procurar.");
                    	String titulo = scan.nextLine();
                    	 for(Livro livro : biblioteca) 
                            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                            System.out.println(livro);
                            break;
                            }
                    }
                        
                    else if (opcao == 4) {
                        System.out.println("Informe o título do livro a ser excluído:");
                        String titulo = scan.nextLine();
                        
                        Livro livroParaExcluir = null;
                        for (Livro livro : biblioteca) 
                        {
                        
                        	if (livro.getTitulo().equalsIgnoreCase(titulo)) 
                        {
                        		livroParaExcluir = livro;
                        break;
                        
                        }
                        }
                        
                        if (livroParaExcluir != null) 
                        {
                            biblioteca.remove(livroParaExcluir);
                            System.out.println("Livro excluído com sucesso.");
                        } 
                        
                        else 
                        {
                            System.out.println("Livro não encontrado.");
                        }
                        
                    } 
                    
                    else if (opcao == 5) 
                    {
                        System.out.println("Saindo...");
                        break;
                    } 
                    
                    else 
                    {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
                }
        		else if (!usuario1.equals(usuario) && (!senha1.equals(senha))) {
        			
        			System.out.println("TÁ TUDO ERRADO!!!");
        			break;
        		}
        		else if (!usuario1.equals(usuario)) {
        			System.out.println("USUARIO INCORRETO!!!");
        			break;
        		}
        		else if  (!senha1.equals(senha)){
        			System.out.println("SENHA INCORRETA!!!");
        			break;
        		}
                
            }
        	else if (opcaoentrada == 2) {
                System.out.println("Escolha uma das opções");
                System.out.println("1) Ver Biblioteca");
                System.out.println("2) Buscar Livro");
                System.out.println("3) Sair");
        		
                int opcao = scan.nextInt();
                scan.nextLine();
                
                if (opcao == 1) {
                if (biblioteca.isEmpty()) {
                System.out.println("A biblioteca está vazia.");
                } 
                else {
                for (Livro livro : biblioteca) {
                System.out.println(livro.toString());
                }
                }
                
    }
                if (opcao == 2) {
                	
                    System.out.println("Insira o titulo do livro que quer procurar.");
                	String titulo = scan.nextLine();
                	 for(Livro livro : biblioteca) 
                        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                        System.out.println(livro);
                        break;
                        }
                }
                else if (opcao == 3) 
                {
                    System.out.println("Saindo...");
                    break;
                } 
        	}
        }
}	
        	
}


