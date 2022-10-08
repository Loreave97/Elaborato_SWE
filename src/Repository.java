public class Repository extends Colleague {

    public Repository(int stock, ConcreteMediator mediator){
        this.stock = stock;
        this.mediator = mediator;
    }

    public void notifyToMed(int stock){
        mediator.updateRepository(stock);
    }

    public void updateStock(int stock){
        this.stock -= stock;
        if (this.stock < 0){
            this.stock += stock;
            System.out.println(("Impossibile rifornire il negozio!"));
            return;
        }
        System.out.println("Invio di " + stock + " articoli mancanti al negozio, il magazzino adesso possiede " + this.stock + " articoli");
        notifyToMed(this.stock);
    }

    public void refillRepository(int stock){
        this.stock += stock;
        System.out.println("Il magazzino è stato rifornito dalla fabbrica di " + stock + " articoli, adesso possiede " + this.stock + " articoli");

    }
}
