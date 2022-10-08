public class ConcreteMediator implements Mediator {
    private Repository repository;
    private Store store;
    private Factory factory;
    private Strategy strategy;

    public void addStore(Store store){
        this.store = store;
    }

    public void addRepository(Repository repository){
        this.repository = repository;
    }

    public void addFactory(Factory factory){
           this.factory = factory;
    }

    public void updateStore(int stock){
        if(stock < 10) {
            repository.updateStock(15 - stock);
            store.refillStock(15 - stock);
        }
    }

    public void updateRepository(int stock){
        strategy = setStrategy(stock);
        strategy.stockUp();
    }

    public void updateFactory(int stock){
        repository.refillRepository(stock);
    }

    public Strategy setStrategy(int stock){
        if (stock < 6)
            return strategy = new StrategyA(this, stock);
        else if(stock < 15)
            return strategy = new StrategyB(this, stock);
        else
            return strategy = new StrategyC(this, stock);
    }

    public void askForProduction(int art){
        factory.produce(art);
    }
}
