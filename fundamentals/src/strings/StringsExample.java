package strings;

public class StringsExample {
    public static void main(String[] args) {
        String texto = "  Olá, Mundo!  ";
        String texto2 = "olá, mundo!";
        String texto3 = "Java é incrível!";
        String vazio = "";
        String numeros = "12345";

        // length(): retorna o tamanho da string
        System.out.println("Tamanho: " + texto.length());

        // charAt(): retorna o caractere no índice especificado
        System.out.println("charAt(1): " + texto.charAt(1));

        // substring(): retorna uma parte da string
        System.out.println("substring(3, 8): " + texto.substring(3, 8));

        // equals(): compara se duas strings são iguais
        System.out.println("equals: " + texto.equals(texto2));

        // equalsIgnoreCase(): compara ignorando maiúsculas/minúsculas
        System.out.println("equalsIgnoreCase: " + texto.equalsIgnoreCase(texto2));

        // compareTo(): compara lexicograficamente
        System.out.println("compareTo: " + texto.compareTo(texto2));

        // contains(): verifica se contém uma sequência
        System.out.println("contains 'Mundo': " + texto.contains("Mundo"));

        // startsWith(): verifica se começa com
        System.out.println("startsWith 'Olá': " + texto.trim().startsWith("Olá"));

        // endsWith(): verifica se termina com
        System.out.println("endsWith '!': " + texto.trim().endsWith("!"));

        // toLowerCase(): converte para minúsculas
        System.out.println("toLowerCase: " + texto.toLowerCase());

        // toUpperCase(): converte para maiúsculas
        System.out.println("toUpperCase: " + texto.toUpperCase());

        // indexOf(): retorna o índice da primeira ocorrência
        System.out.println("indexOf 'M': " + texto.indexOf('M'));

        // lastIndexOf(): índice da última ocorrência
        System.out.println("lastIndexOf 'o': " + texto.lastIndexOf('o'));

        // isEmpty(): verifica se está vazia
        System.out.println("isEmpty: " + vazio.isEmpty());

        // isBlank(): verifica se é vazia ou só espaços (Java 11+)
        System.out.println("isBlank: " + texto.isBlank());

        // replace(): substitui caracteres
        System.out.println("replace 'Mundo' por 'Java': " + texto.replace("Mundo", "Java"));

        // replaceAll(): substitui com regex
        System.out.println("replaceAll \\s por '_': " + texto.replaceAll("\\s", "_"));

        // matches(): verifica se bate com regex
        System.out.println("matches só números: " + numeros.matches("\\d+"));

        // split(): divide a string
        String[] palavras = texto3.split(" ");
        System.out.println("split:");
        for (String palavra : palavras) {
            System.out.println("- " + palavra);
        }

        // trim(): remove espaços no início e fim
        System.out.println("trim: '" + texto.trim() + "'");

        // join(): junta strings com separador
        String joined = String.join(" - ", "Java", "Python", "Go");
        System.out.println("join: " + joined);

        // repeat(): repete a string (Java 11+)
        System.out.println("repeat 3x: " + "ha".repeat(3));

        // strip(), stripLeading(), stripTrailing() (Java 11+)
        System.out.println("strip: '" + texto.strip() + "'");
        System.out.println("stripLeading: '" + texto.stripLeading() + "'");
        System.out.println("stripTrailing: '" + texto.stripTrailing() + "'");
    }
}
