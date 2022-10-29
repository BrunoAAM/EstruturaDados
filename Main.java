import java.util.Scanner;

public class Main {
    private static int[] arr = new int[50];

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        ListaDupla ld = new ListaDupla();


        int count = 0;
        int inteiro;
        int posiçao;
        boolean rodando = true;
        boolean rodandoLista = true;
        boolean rodandoVetor = true;
        while (rodando) { // Sistema de interação com o usuário

                menu.imprimirMenu();

                Scanner texto = new Scanner(System.in);
                String Comanda;
                Comanda = texto.nextLine();



                switch (Comanda) {

                    case "1": {
                        while (rodandoVetor){
                        menu.menuVertor();
                        String ComandaVetor;
                        ComandaVetor = texto.next();

                        switch (ComandaVetor) {

                            case "1": {
                                System.out.println("Digite o número a ser inserido");
                                count++;
                                int n = texto.nextInt();
                                arr[count - 1] = n;
                                break;

                            }
                            case "2":{
                                System.out.println("selecione o indice:");
                                int indice = texto.nextInt();
                                System.out.println("informe o valor:");
                                int num = texto.nextInt();
                                arr[indice - 1] = num;
                                break;
                            }
                            case "3":{
                                System.out.println("Digite um numero para procurar no array");
                                int numsearch = texto.nextInt();
                                for (int i = 0; i < count; i++) {
                                    if (arr[i] == numsearch) {
                                        System.out.println("O numero pertence ao array e se encontra na posicao: " + (i+1) + " do vetor");
                                    } else {
                                        System.out.println("Numero nao encontrado no vetor");
                                    }
                                }break;
                            }
                            case "4":{
                                for (int i = 0; i < count; i++) {
                                    System.out.print(arr[i] + " ");
                                }break;
                            }
                            case "5": {rodandoVetor = false;

                                break;

                            }
                        }


                    } break;}
                    case "2": {

                        while (rodandoLista){
                        menu.menuLista();
                        String ComandaLista;
                        ComandaLista = texto.next();
                        switch (ComandaLista) {

                            case "1": {
                                System.out.println("Digite o inteiro a ser inserido");
                                 inteiro = texto.nextInt();
                                 ld.inserir(inteiro);
//                                 lista.inserir(inteiro);
                                break;
                            }
                            case "2":{
                                System.out.println("Digite a posição do número a ser alterado");
                                posiçao = texto.nextInt();
                                System.out.println("Digite o inteiro a ser inserido");
                                inteiro = texto.nextInt();
                                ld.removeIndex(posiçao);
                                ld.inserirPosiçao(inteiro, posiçao);

//                                lista.inserirPosiçao(posiçao,inteiro);
                                break;
                            }
                            case "3":{
                                System.out.println("Digite a posição a ser excluida na lista");
                                posiçao = texto.nextInt();
                                ld.removeIndex(posiçao);
                                break;
                            }
                            case "4":{
                                System.out.println("Digite o número a ser procurado");
                                inteiro = texto.nextInt();
                                System.out.println(ld.index(inteiro));
                                break;
                            }

                            case "5": {
                                System.out.println(ld.toString());
                                break;
                            }
                            case "6": {rodandoLista = false;
                                break;

                            }


                        }}break;
                        }
                    case "3":{
                        rodando = false;
                        break;
                    }
                }



        }
    }
}


