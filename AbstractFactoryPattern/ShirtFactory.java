package AbstractFactoryPattern;

public class ShirtFactory implements ClothesMaterialFactory {

    @Override
    public Cotton createCotton() {
        // TODO Auto-generated method stub
        System.out.println("Shirt Made of Cotton");
        return new Cotton();
    }

    @Override
    public Polyester createPolyester() {
        // TODO Auto-generated method stub
        System.out.println("Shirt Made of Polyester");
        return new Polyester();
    }

}