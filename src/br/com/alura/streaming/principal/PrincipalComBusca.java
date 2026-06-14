package br.com.alura.streaming.principal;
import br.com.alura.streaming.exceptions.ErroDeConversaoException;
import br.com.alura.streaming.modelos.Filme;
import br.com.alura.streaming.modelos.Titulo;
import br.com.alura.streaming.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        while(!busca.equalsIgnoreCase("sair")) {

            try {
                System.out.println("Qual filme você procura? ");
                busca = leitura.nextLine();

                if (busca.equalsIgnoreCase("sair")) {
                    break;
                }

                String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=245ec16b";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb= gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println(meuTitulo);


                titulos.add(meuTitulo);
                //tratando casos de excecao
            } catch (NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (IllegalAccessError e) {
                System.out.println("Erro de argumento: " + e.getMessage());
            } catch (ErroDeConversaoException e) {
                System.out.println("Ano fora de formatação: " + e.getMessage());
            }

        }



        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println(titulos);
    }
}
