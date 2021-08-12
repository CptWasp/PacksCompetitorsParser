package by.blrmyfc.interfaces;

public interface FileReader {
    // отдаем ссылку на файл
    void setLink(String link);

    // получаем ссылку на файл
    String getLink();

    // читаем файл
    void reading();


}
