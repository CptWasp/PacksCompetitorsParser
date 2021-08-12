import abstracts.AbstractSiteParser;
import conrete.factory.LinuxParser;

public class main {
    private static AbstractSiteParser anyDesktopParser;


    public static void main(String[] args){

        configure();
        runParsing();

    }

    static void configure(){
        anyDesktopParser = new LinuxParser();
    }



    static void runParsing(){
        anyDesktopParser.startParsing();
    }


}
