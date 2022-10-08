public class Factory extends Colleague {

    public Factory(ConcreteMediator mediator){
        this.mediator = mediator;
    }

    public void notifyToMed(int stock){
        mediator.updateFactory(stock);

    }
    public void produce(int stock){
        System.out.println("Inizia la produzione di " + stock + " articoli");
        this.notifyToMed(stock);

    }

}
