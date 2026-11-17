package _13_Heranca_Polimorfismo.exFixacao.entities;

public class ImportedProduct extends Product{
    private Double customsFee;


    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    @Override
    public String priceTag(){
        return super.getName()
                + String.format(" $ %.2f (Customs fee: $ %.2f)",totalPrice(), getCustomsFee());
    }

    public Double totalPrice(){
        return super.getPrice() + getCustomsFee();
    }
}
