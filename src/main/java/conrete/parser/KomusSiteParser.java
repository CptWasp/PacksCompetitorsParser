package conrete.parser;

import interfaces.SiteParser;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;


public class KomusSiteParser implements SiteParser {

    private String siteUrl = "https://www.komus.ru/katalog/c/0/";

// ##########   По категориям:  #########
//    https://www.komus.ru/katalog/c/0/
// ######################################


    public void parse() {

        Document doc = null;
        try {
            doc = Jsoup.connect(siteUrl).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Element a : doc.getElementsByClass("b-account__item")){
            System.out.println("\ntitle: " + a.getElementsByClass("b-account__item--label").text());
            System.out.println("url: " + a.getElementsByClass("b-account__item--label").attr("href") + "\n");


            System.out.println("--------------------------------------------------------------------------------------------");
            for (Element sub : a.getElementsByClass("b-ul__li")) {
                System.out.println("text: " + sub.text());
                System.out.println("url: " + sub.getElementsByClass("b-info__link--category").attr("href"));
                System.out.println();
            }
            System.out.println("--------------------------------------------------------------------------------------------");


            System.out.println("\n");
        }



    }
}
