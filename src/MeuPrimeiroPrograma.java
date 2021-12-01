
//              Escopo de código - 1
   // public static void main(String[] args) {
   //     System.out.println("Olá Mundo, eu sou o primeiro programa do Orleans.");
   //    System.out.println(2+2);
  //      System.out.println(10+3);
  //      System.out.println(10/3);
 ///////////////////////////////////////////////////////////////////////////////////////////////////////

//              Escopo de código - 2
//Variaveis são espaços de memórias alocados (Representados por Tipo)
//variaveis -> tipo: Textos (Strings)
//variaveis -> tipo: Numeros (Int)
//variaveis -> tipo: Numeros Fracionados (Double)
//variaveis -> tipo: booleanas (verdadeiro | falso)

 //       public static void main(String[] args) {
 //           var login = "Olá";
 //           var passaword = "mundo";
 //           System.out.println(login);
 //           System.out.println(passaword);
//
            // TIPOS DE DADOS
        // tipo - nomeDaReferencia = conteudoDaReferencia
  //         String hello = "Olá"; //Representação de Texto (tabela   ASCII)
 //          int numero = 10;      //Representação de números inteiros
//           double percent = 24.30; //Representação de números fracionados
//           boolean isDriver = true; //Representação booleana (estado verdadeiro, falso)
//          System.out.println(hello);
//            System.out.println(numero);
//            System.out.println(percent);
//            System.out.println(isDriver);

//            int number; //Declarando variavel
//            number = 55;
//            System.out.println(number + 10);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//                    Escopo de código - 3

//                   2 Tipos de Erros
//                  Erro de Compilação -> quando a erro na escrita.
//                  Erro de Execução (Exception) -> quando a erro na regra de execução.

//    public static void main(String [] args){
//        String text = "Ola Mundo";
//        System.out.println(text);

//        int x = 10;
//        int y = 2; // regra, não é possivel dividir 0 por qualquer número.
//        System.out.println(x / y);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//                        Escopo de código - 4

//static void -> Declaração padrão.
//sum -> Nome da função, geralmente usamos verbos para definir o que é a função.
//() -> Parenteses, usamos para definir o que chegará nauqela função (tipo e nomeDaVariavel).
//{} -> Chaves, bloco de cógidos que será executado.


// Exemplo 1
//    public static void main(String [] args){
//        sum(10, 15); // São argumentos da função o que estão dentro dos parenteses.
//        sum(11, 5); // São argumentos da função o que estão dentro dos parenteses.
//        sum(12, 3); // São argumentos da função o que estão dentro dos parenteses.
//        sum(13, 5); // São argumentos da  função o que estão dentro dos parenteses.

//    static void sum(int x, int y){
//        System.out.println(x + y);

// Exemplo 2

//    public static void main(String[] args) {
//        calc(10, 5); // São argumentos da função o que estão dentro dos parenteses.

//    static void calc(int x, int y) {
//        System.out.println(x + y);
//        System.out.println(x - y);
//        System.out.println(x / y);
//        System.out.println(x * y);


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//                        Escopo de código - 5


public class MeuPrimeiroPrograma {

    public static void main(String [] args){
        System.out.println(args[0]);
        System.out.println(args[1]);



    }

}

