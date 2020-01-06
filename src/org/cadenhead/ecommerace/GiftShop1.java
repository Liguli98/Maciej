package org.cadenhead.ecommerace;

public class GiftShop1{
    public static void main(String[] arguments){
        Storefront1 store=new Storefront1();
        store.addItem("CO1", "Kubel","9.99", "150","TAK");
        store.addItem("CO2","Duży Kubek" , "12.99", "82","DUPA");
        store.addItem("CO3", "Podkładka", "10.49", "800","TAK");
        store.addItem("DO1", "Koszulka", "16.99", "90","NIE");
        store.sort();
        
        for(int i=0;i<store.getSize();i++){
         Item1 show=(Item1)store.getItem(i);
         System.out.println("\nIdentyfikator elementu:"+show.getId()+""
                 + "\nNazwa: "+show.getName()+
                 "\nCena detaliczna "+show.getRetail()+"zł"+
                 "\nCena: "+show.getPrice()+"zł"+
                 "\nSztuk "+show.getQuantity()+
                 "\nPo cenie detalicznej: "+show.getInfo());
                 
        }
}
}