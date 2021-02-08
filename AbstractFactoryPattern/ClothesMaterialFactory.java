package AbstractFactoryPattern;

public interface ClothesMaterialFactory {
    public Cotton createCotton();

    public Polyester createPolyester();
}