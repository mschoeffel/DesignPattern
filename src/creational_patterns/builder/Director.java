package creational_patterns.builder;

public class Director {

    public Product constructDefaultProduct(){
        Builder builder = new Builder();
        return builder.attributeOne("myAttributeOne").attributeTwo("myAttributeTwo").buildPiece();
    }
}
