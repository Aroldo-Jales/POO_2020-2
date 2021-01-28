package ATV_07;

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
            if (indice >= contas.length) {
                throw new AplicacaoException("Número máximo de contas atingido (50).");
            }
            contas[indice] = c;
            indice+=1;
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
            
            if (c == null) {
                throw new AplicacaoException("Conta inexistente!");
            }
            return c;
        }
        
        private int consultarIndice(String numero){
            int posicao = -1;
            
                for (int i=0; i<indice ; i++) {
                    if (contas[i].getNumero().equals(numero)) {
                            posicao = i;
                            break;
                    }
                }
                
            if (posicao == -1){
                throw new AplicacaoException("Conta inexistente!");
            }
            return posicao;
        }
        
        public void debitar(String numero, double valor) {
            Conta c;
            c = consultar(numero);
            c.sacar(valor);
	}
        
        public void creditar(String numero, double valor) {
            Conta c;
            c = consultar(numero);
            c.depositar(valor);
        }
        
        public void transferir(String nOrigem, String nDestino, double valor) {
            Conta contaDebitar = consultar(nOrigem);
            Conta contaCreditar = consultar(nDestino);
            contaCreditar.transferir(contaDebitar, valor);
        }
        
        public int quantidadeContas() {
		return indice;
	}
}