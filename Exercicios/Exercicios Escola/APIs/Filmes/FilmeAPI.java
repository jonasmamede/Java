import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilmeAPI {

    public static void main(String[] args) {

        try {

            String apiKey = "20ddd849";
            String filme = "Superman";

            String endereco = "https://www.omdbapi.com/?t="
                    + filme
                    + "&apikey="
                    + apiKey;

            URL url = new URL(endereco);

            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            conexao.setRequestMethod("GET");

            BufferedReader leitor = new BufferedReader(
                    new InputStreamReader(conexao.getInputStream()));

            String linha;
            StringBuilder resposta = new StringBuilder();

            while ((linha = leitor.readLine()) != null) {
                resposta.append(linha);
            }

            leitor.close();

                String json = resposta.toString();

                // Mostrando informações (parsing simples sem dependências externas)
                System.out.println("Título: " + findJsonValue(json, "Title"));
                System.out.println("Ano: " + findJsonValue(json, "Year"));
                System.out.println("Gênero: " + findJsonValue(json, "Genre"));
                System.out.println("Diretor: " + findJsonValue(json, "Director"));
                System.out.println("IMDb: " + findJsonValue(json, "imdbRating"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String findJsonValue(String json, String key) {
        String patternString = "\"" + Pattern.quote(key) + "\"\\s*:\\s*\"(.*?)\"";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(json);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
}