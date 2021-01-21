package ATV_05;

public class Banco {
	private Conta[] contas;
	private int indice = 0;

	public Banco() {
		contas = new Conta[50];
	}

	public Banco(int tamanho) {
		contas = new Conta[tamanho];
	}
        
        public void inserir(Conta c){
            if (indice<contas.length) { 
                contas[indice] = c;
                indice+=1;
            }
            else {
                System.out.println("Número máximo de contas atingido (50).");
            }
        }
        
        public void alterar(Conta c) {
            int indice = consultarIndice(c.getNumero());
            if (indice != -1) {
		contas[this.indice] = c;
            }
	}
        
        public void excluir(String numero) {
            int posicao = consultarIndice(numero);
            if (posicao != -1) {
		for (int i=posicao; i<indice; i++) {
                    contas[i] = contas[i+1];
		}
            indice-=1;
            }
	}
        
        public Conta consultar(String numero) {
            Conta c = null;
            for(int i=0 ; i<indice ; i++) {
                if(contas[i].getNumero().equals(numero)){
                    c = contas[i];
                    break;
                }
            }
            return c;
        }
        
        private int consultarIndice(String numero){
            int posicao = 0;
            for (int i=0; i<indice; i++) {
                if (contas[i].getNumero().equals(numero)) {
        		posicao = i-1;
			break;
		}
            }
            return posicao;
        }
        
        public void debitar(String numero, double valor) {
            Conta c;
            c = consultar(numero);
            if (c != null) {
                c.sacar(valor);
            }
            else {
                System.out.println("A conta informada não existe.");
            }
	}
        
        public void creditar(String numero, double valor) {
            Conta c;
            c = consultar(numero);
            if (c != null) {
                c.depositar(valor);
            }
            else {
                System.out.println("A conta informada não existe.");
            }
        }
        
        public void transferir(String nOrigem, String nDestino, double valor) {
            Conta contaDebitar = consultar(nOrigem);
            Conta contaCreditar = consultar(nDestino);
            
            if(contaDebitar != null && contaCreditar != null) {
                contaCreditar.transferir(contaDebitar, valor);
            }
            else if (contaDebitar == null) {
                System.out.println("A conta a ser debitada não existe.");
            }
            else {
                System.out.println("A conta a ser creditada não existe.");
            }
        }       
}
