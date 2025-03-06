package br.com.moreiracruz.java.basico;

public class StringDemo {

    // Concatena duas strings
    public String concatenar(String str1, String str2) {
        return str1.concat(str2);
    }

    // Verifica se uma string contém outra
    public boolean contem(String str, String subStr) {
        return str.contains(subStr);
    }

    // Converte a string para maiúsculas
    public String paraMaiusculas(String str) {
        return str.toUpperCase();
    }

    // Converte a string para minúsculas
    public String paraMinusculas(String str) {
        return str.toLowerCase();
    }

    // Retorna o comprimento da string
    public int comprimento(String str) {
        return str.length();
    }

    // Substitui todas as ocorrências de uma substring por outra
    public String substituir(String str, String antiga, String nova) {
        return str.replace(antiga, nova);
    }

    // Divide a string em um array de strings com base em um delimitador
    public String[] dividir(String str, String delimitador) {
        return str.split(delimitador);
    }

    // Remove espaços em branco no início e no final da string
    public String trim(String str) {
        return str.trim();
    }

    // Verifica se a string começa com uma determinada substring
    public boolean comecaCom(String str, String prefixo) {
        return str.startsWith(prefixo);
    }

    // Verifica se a string termina com uma determinada substring
    public boolean terminaCom(String str, String sufixo) {
        return str.endsWith(sufixo);
    }

    // Retorna o caractere em uma posição específica
    public char caractereEm(String str, int indice) {
        return str.charAt(indice);
    }

    // Retorna o índice da primeira ocorrência de uma substring
    public int indiceDe(String str, String subStr) {
        return str.indexOf(subStr);
    }

    // Retorna o índice da última ocorrência de uma substring
    public int ultimoIndiceDe(String str, String subStr) {
        return str.lastIndexOf(subStr);
    }

    // Verifica se a string está vazia
    public boolean estaVazia(String str) {
        return str.isEmpty();
    }

    // Compara duas strings ignorando maiúsculas e minúsculas
    public boolean equalsIgnoreCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    // Compara duas strings lexicograficamente
    public int comparar(String str1, String str2) {
        return str1.compareTo(str2);
    }

    // Retorna uma substring a partir do índice especificado
    public String substring(String str, int beginIndex) {
        return str.substring(beginIndex);
    }

    // Retorna uma substring entre os índices especificados
    public String substring(String str, int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);
    }

    // Formata uma string usando o formato especificado
    public String formatar(String format, Object... args) {
        return String.format(format, args);
    }

    // Junta elementos com um delimitador
    public String juntar(String delimitador, String... elementos) {
        return String.join(delimitador, elementos);
    }

    // Verifica se a string corresponde a uma expressão regular
    public boolean corresponde(String str, String regex) {
        return str.matches(regex);
    }

    // Converte a string em um array de caracteres
    public char[] paraArrayDeCaracteres(String str) {
        return str.toCharArray();
    }

    // Repete a string o número de vezes especificado
    public String repetir(String str, int count) {
        return str.repeat(count);
    }

}
