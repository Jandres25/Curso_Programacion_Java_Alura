package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.excepcion.ErrorDeConversionException;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
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
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (true) {
            System.out.println("Escriba el nombre de la película: ");
            var busqueda = teclado.nextLine();

            if (busqueda.equalsIgnoreCase("salir")) {
                break;
            }

            String URL = "http://www.omdbapi.com/?t=" + busqueda.replace(" ", "+") + "&apikey=436005ba";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();

                System.out.println(json);

                TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(tituloOmdb);

                Titulo titulo = new Titulo(tituloOmdb);
                System.out.println(titulo);

                titulos.add(titulo);

            } catch (NumberFormatException e) {
                System.out.println("Ocurrió un error:");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Revise la URL");
                System.out.println(e.getMessage());
            } catch (ErrorDeConversionException e) {
                System.out.println(e.getMessage());
            }

            FileWriter escritura = new FileWriter("titulos.json");
            escritura.write(gson.toJson(titulos));
            escritura.close();
            System.out.println("Se cerró el programa");
        }
    }
}
