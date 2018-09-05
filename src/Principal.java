
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Declara a lista encadeada
        LinkedList<No> listaEncadeada = new LinkedList<>();

        //Menu para controle da lista
        int opcao = -1;
        while (opcao != 9) {
            //Monta o menu de opcoes
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t### LinkedList com Collection ###\n"
                    + "1 - Inserir Início\n"
                    + "2 - Inserir K\n"
                    + "3 - Inserir Fim\n"
                    + "4 - Remover Início\n"
                    + "5 - Remover K\n"
                    + "6 - Remover Fim\n"
                    + "7 - Pesquisar\n"
                    + "8 - Listar\n"
                    + "9 - Sair"));
            switch (opcao) {
                case 1: {
                    int dado = Integer.parseInt(JOptionPane.showInputDialog("Digite o dado a ser inserido no início:"));
                    No novo = new No(dado);
                    listaEncadeada.addFirst(novo);
                    break;
                }
                case 2: {
                    int dado = Integer.parseInt(JOptionPane.showInputDialog("Digite o dado a ser inserido na posição k:"));
                    int k = Integer.parseInt(JOptionPane.showInputDialog("Digite posição K a ser inserida:"));
                    No novo = new No(dado);
                    listaEncadeada.add(k, novo);
                    break;
                }
                case 3: {
                    int dado = Integer.parseInt(JOptionPane.showInputDialog("Digite o dado a ser inserido no fim:"));
                    No novo = new No(dado);
                    listaEncadeada.addLast(novo);
                    break;
                }
                case 4: {
                    No dado = listaEncadeada.removeFirst();
                    if (dado != null) {
                        JOptionPane.showMessageDialog(null, "O nó" + dado.getDado() + " foi removido do início com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O nó do início não foi removido");
                    }                    
                    break;
                }
                case 5: {
                    int k = Integer.parseInt(JOptionPane.showInputDialog("Digite posição k a ser removida:"));
                    No dado = listaEncadeada.remove(k);
                    if (dado != null) {
                        JOptionPane.showMessageDialog(null, "O nó" + dado.getDado() + " foi removido da posição k com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O nó da posição k não foi removido");
                    }
                    
                    break;
                }
                case 6:                    
                     No dado = listaEncadeada.removeLast();
                    if (dado != null) {
                        JOptionPane.showMessageDialog(null, "O nó" + dado.getDado() + " foi removido do fim com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O nó do fim não foi removido");
                    }     
                    break;
                case 7: {
                    int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o dado a ser consultada:"));
                    No procurar = null;
                    for (No c : listaEncadeada) {
                        if (c.getDado() == chave) {
                            procurar = c;
                        }
                    }
                    if (listaEncadeada.contains(procurar) == true) {
                        JOptionPane.showMessageDialog(null, "Achei o nó");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não Achei o nó");
                    }
                    break;
                }
                case 8: {
                    String saida = "Dados da Lista Encadeada:\n";
                    for (No c : listaEncadeada) {
                        saida = saida + c.getDado() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, saida);
                    break;
                }
                default:
                    break;
            }
        }//Fim While
    }
}
