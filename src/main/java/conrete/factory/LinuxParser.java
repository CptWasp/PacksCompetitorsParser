package conrete.factory;

import abstracts.AbstractSiteParser;
import conrete.parser.KomusSiteParser;
import interfaces.SiteParser;

public class LinuxParser extends AbstractSiteParser {
    @Override
    protected SiteParser createParser() {
        return new KomusSiteParser();
    }
}
