package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Web {
    public static String btcpriceUSD() {
        // Declare and Initialise the url

        String url = "https://coinmarketcap.com/currencies/bitcoin/";

        // Try/Catch statement

        try {
            // Initialise document to retrieve url
            Document document = Jsoup.connect(url).get();

            // Select specific html element (btcPrice)
            Elements element = document.select("div.priceValue");

            // Convert html element to a String
            String btcPrice = element.text();
            return btcPrice;
        }

        // Display error if try block fails to execute properly
        catch (Exception ex) {
            System.out.println("Error has occurred");
            ex.printStackTrace();
        }
        return null;
    }

    public static String btcpriceGBP() {

        // Declare and Initialise the url

        String url = "https://bitcourier.co.uk/c/bitcoin";

        // Try/Catch statement

        try {
            // Initialise document to retrieve url
            Document document = Jsoup.connect(url).get();

            // Select specific html element (btcPrice)
            Element element = document.getElementsByClass("text-4xl").first();

            // Convert html element to a String
            String btcPriceGBP = element.text();
            return btcPriceGBP;
        }

        // Display error if try block fails to execute properly
        catch (Exception ex) {
            System.out.println("Error has occurred");
            ex.printStackTrace();
        }
        return null;


    }


}
