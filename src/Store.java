public class Store extends Colleague {

    public Store(int stock, ConcreteMediator mediator){
        this.stock = stock;
        this.mediator = mediator;
    }

    public void notifyToMed(int stock){
        mediator.updateStore(stock);
    }

    public void updateStock(int sold) {
        this.stock -= sold;
        if (this.stock < 0){
            this.stock += sold;
            System.out.println(("Impossibile vendere, non ci sono abbastanza articoli nel negozio!"));
            return;
        }
        System.out.println("Il negozio ha " + stock + " articoli");
        this.notifyToMed(this.stock);
    }

    public void refillStock(int art){
        this.stock += art;
        System.out.println("Rifornimento effettuato, il negozio possiede " + this.stock + " articoli");
    }
}
