package org.example.arrayList;

public class CardCustomer extends Customer{

    private String cardNumber;

    public String getCardNumber() {

        if (cardNumber.length()==16){
            return cardNumber;
        }
        else {
            return cardNumber="0000000000000000";
        }

    }

    public CardCustomer(int purchaseCount, String name, String cardNumber) {
        super(purchaseCount, name);
        this.cardNumber = cardNumber;
    }

    @Override
    public int getPurchaseCount() {
        return super.getPurchaseCount();
    }

    @Override
    public void setPurchaseCount(int purchaseCount) {
        super.setPurchaseCount(purchaseCount);
    }

    @Override
    public double getDiscountSize() {
        return super.getDiscountSize();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void customerInfo() {
        System.out.printf("Customer %s (card: %s) has a discount %.0f%% \n",getName(),getCardNumber(),getDiscountSize()*100);
    }
}
