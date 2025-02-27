import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import static java.lang.System.exit;


class View {
	private static View INSTANCE;
	private View() {}
	
	public static View getInstance() {
		if (INSTANCE == null)
			INSTANCE = new View();
		return INSTANCE;
	}
	
	//printar mensagens diversas
    public void print(String s) {
		System.out.println(s);
    }
	
	public void printStartMenu() {
		System.out.println("Escolha uma opção:\n");
        System.out.println("(1) Entrar (Eleitor)");
        System.out.println("(2) Entrar (TSE)");
        System.out.println("(0) Fechar aplicação");
	}
	
	public void printSeparator() {
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");
	}
	
	public void printReadError() {
		System.out.println("\nErro na leitura de entrada, digite novamente");
	}
	
	public void printInvalidCommand() {
		System.out.println("Comando invalido");
	}
	
	public void printUnexpectedError() {
		System.out.println("Erro inesperado");
	}
	
	public void printVoterNotFound() {
		System.out.println("Eleitor não encontrado, por favor confirme se a entrada está correta e tente novamente");
	}
	
	public void printInvalidInput() {
		System.out.println("Entrada invalida, tente novamente");
	}
	
	public void printConfirmationPrompt() {
		System.out.println("(1) Sim\n(2) Não");
	}
	
	public void printMenuRedirection() {
		System.out.println("Ok, você será redirecionado para o menu inicial");
	}

	public void printBlankVote() {
		System.out.println("Você está votando branco");
	}
	
	public void printNullVote() {
		System.out.println("Você está votando nulo");
	}

	public void printCandidateNotFound() {
		System.out.println("Nenhum candidato encontrado com este número, tente novamente");
	}
	
	public void printInvalidPassword() {
		System.out.println("Senha inválida, tente novamente");
	}

	public void printVoteConfirmationPrompt() {
		System.out.println("(1) Confirmar\n(2) Mudar voto");
	}
	
	public void printModelNotStarted() {
		System.out.println("A eleição ainda não foi inicializada, verifique com um funcionário do TSE");
	}
	
	public void printTSEEmployeeNotFound() {
		System.out.println("Funcionário do TSE não encontrado, por favor confirme se a entrada está correta e tente novamente");
	}

	public void printWrongNumber() {
		System.out.println("O número do candidato precisa ter 2 dígitos");
	}	
	
	public void printWrongDeputyNumber() {
		System.out.println("O número do candidato precisa ter 5 dígitos");
	}

	public void printCandidateNotRecorded() {
		System.out.println("Candidato não foi cadastrado");
	}
	
	
	public void printCandidateRemoved() {
		System.out.println("Candidato removido com sucesso");
	}
	
	public void printCandidateNotRemoved() {
		System.out.println("O candidato não foi removido.");
	}
	
	public void printTSEMenu1() {
		System.out.println("Escolha uma opção:");
		System.out.println("(1) Cadastrar candidato");
		System.out.println("(2) Remover candidato");
		System.out.println("(0) Sair");
	}
	
	public void printTSEMenu2() {
		System.out.println("(1) Iniciar sessão");
		System.out.println("(2) Finalizar sessão");
		System.out.println("(3) Mostrar resultados");
		System.out.println("(0) Sair");
	}
	
	public void printExit() {
		System.out.println("(ext) Desistir");
		
	}
	
	public void printStartMessage() {
		System.out.println("Vamos começar!\n");
	}
	
	public void printSuccessfulVote() {
		System.out.println("Voto para presidente registrado com sucesso");
	}
	
	public void printOfficeNotFound() {
		System.out.println("Não foi encontrado o cargo a ser disputado.");
	}

	public void printCannotAddCandidate() {
		System.out.println("Você não pode adicionar candidatos, pois a eleição já começou.");
	}

	public void printStartedSession() {
		System.out.println("Sessão inicializada");
	}

	public void printTerminatedSession() {
		System.out.println("Sessão finalizada com sucesso");
	}
	
	public void printRemovePresidentialCandidate(String name, int number, String party) {
		System.out.println("/Remover o candidato a presidente " + name + " Nº " + number + " do " + party
        + "?");
	}

	public void printRemoveFederalDeputyCandidate(String name, int number, String party, String state) {
		System.out.println("/Remover o candidato a deputado federal " + name + " Nº " + number + " do "
            + party + "(" + state + ")?");
	}
	
	public void printDataError() {
		System.out.println("Erro na inicialização dos dados");
	} 
	//--------------------------------
	
	//perguntas ao usuário
	public void askVoterNumber() {
		System.out.println("Insira seu título de eleitor");
	}
	
	public void askVoterInfo(String name, String state) {
		System.out.println("Olá, você é " + name + " de " + state + "?");
	}
	
	public void askPresident() {
		System.out.println("Digite o número do candidato escolhido por você para presidente");
	}
	
	public void askPassword() {
		System.out.println("Insira sua senha");
	}
	
	public void askCandidateType() {
		System.out.println("");
		System.out.println("Qual o cargo do candidato?\n");
		System.out.println("(1) Presidente");
		System.out.println("(2) Deputado Federal");
		System.out.println("(0) Voltar ao menu anterior");

	}
	
	public void askCandidateNumber() {
		System.out.println("Qual o numero do candidato");
	}

	public void askUser() {
		System.out.println("Insira seu usuário:");
	}
	
	public void askBallotPassword() {
		System.out.println("Insira a senha da urna");
	}

	public void askCandidateName() {
		System.out.println("Qual o nome do candidato?");
	}
	
	public void askCandidateParty() {
		System.out.println("Qual o partido do candidato?");
	}
	
	public void askCandidateState() {
		System.out.println("Qual o estado do candidato?");
	}

	public void askDeputyCandidateNumber() {
		System.out.println("Qual o numero do candidato? (Digite um número de 5 digitos)");
	}
	
	public void askDeputyCandidateNumber(int counter) {
		System.out.println("Digite o número do " + counter + "º candidato escolhido por você para deputado federal:\n");
	}
	
	public void askPresidentInfo(String name, int number, String party) {
		System.out.println("\nCadastrar o candidato a presidente " + name + " Nº " + number + " do " + party + "?");
	}
	
	public void askFederalDeputyInfo(String name, int number, String party, String state) {
		System.out.println("\nCadastrar o candidato deputado federal " + name + " Nº " + number + " do " + party + "(" + state + ")?");
	}
	//--------------------------------
}
