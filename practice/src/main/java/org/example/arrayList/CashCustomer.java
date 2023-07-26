package org.example.arrayList;

public class CashCustomer extends Customer {

    private String documentNumber;



    public CashCustomer(String name, String documentNumber, int purchaseCount) {
        super(purchaseCount, name);
        this.documentNumber = documentNumber;
    }

    public String getDocumentNumber() {
        if ((documentNumber == null) || (documentNumber.length() == 0)) {
            this.documentNumber = "0000 000000";
        }
        return documentNumber;
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
        System.out.printf("Customer %s (passport: %s) has a discount %.0f%% \n",getName(),getDocumentNumber(),getDiscountSize()*100);
    }
}
