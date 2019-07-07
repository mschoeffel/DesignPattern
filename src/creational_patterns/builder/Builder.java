package creational_patterns.builder;

public class Builder {

    private String attributeOne;
    private String attributeTwo;

    public Builder(){
        //Set default values:
        attributeOne = null;
        attributeTwo = null;
    }

    public Builder attributeOne(String attributeOne){
        this.attributeOne = attributeOne;
        return this;
    }

    public Builder attributeTwo(String attributeTwo){
        this.attributeTwo = attributeTwo;
        return this;
    }

    public Product buildPiece(){
        Product product = new Product();
        product.setAttributeOne(attributeOne);
        product.setAttributeTwo(attributeTwo);
        return product;
    }
}
