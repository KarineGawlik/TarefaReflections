package br.com.karineg;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtém a classe Cliente. "class.forName" para carregar a classe cliente
            Class<?> clienteClass = Class.forName("br.com.karineg.Cliente");

            // Verifica se a classe tem a anotação @Tabela, usa o "isAnnotationPresent" para verificar se a @Tabela está presente na classe cliente
            if (clienteClass.isAnnotationPresent(Tabela.class)) {
                // Através do "getAnnotation" obtém a instancia da anotação @Tabela
                Tabela tabelaAnnotation = clienteClass.getAnnotation(Tabela.class);

                // Obtém o valor da anotação e imprime no console
                String[] tabelaValues = tabelaAnnotation.value();
                for (String tabelaValue : tabelaValues) {
                    System.out.println("Nome da tabela: " + tabelaValue);
                }
            } else {
                System.out.println("A classe Cliente não possui a anotação Tabela.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
