package com.company;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {

    public static void main( String[] args ) throws IOException{

        // Declare and Initialise the url

        String url = "https://coinmarketcap.com/currencies/bitcoin/";

        // Try/Catch statement

        try{
            // Initialise document to retrieve url
            Document document = Jsoup.connect(url).get();

            // Select specific html element (btcPrice)
            Elements element = document.select("div.priceValue");

            // Convert html element to a String
            String btcPrice = element.text();

            // Print btcPrice in console
            System.out.println("Bitcoin's Current Price: " + btcPrice);
        }

        // Display error if try block fails to execute properly
        catch(Exception ex){
            System.out.println("Error has occurred");
            ex.printStackTrace();
        }



    }
}
