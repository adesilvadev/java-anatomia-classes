public class MinhaClasse2 {

    public static void main(String[] args) {

        String primeiroNome = "Ademilton";
        String segundoNome = "da Silva.";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Eu me chamo " + primeiroNome + " " + segundoNome;

    }
}
