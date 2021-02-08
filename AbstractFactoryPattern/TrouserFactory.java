package AbstractFactoryPattern;

public class TrouserFactory implements ClothesMaterialFactory {

    @Override
    public Cotton createCotton() {
        // TODO Auto-generated method stub
        System.out.println("Trouser Made of Cotton");
        return new Cotton();
    }

    @Override
    public Polyester createPolyester() {
        // TODO Auto-generated method stub
        System.out.println("Trouser Made of Polyester");
        return new Polyester();
    }

}