package abstracts;

import interfaces.SiteParser;

public abstract class AbstractSiteParser {
    public void startParsing(){
        SiteParser siteParser = createParser();
        siteParser.parse();
    }

    protected abstract SiteParser createParser();


}
