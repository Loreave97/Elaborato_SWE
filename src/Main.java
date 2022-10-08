public class Main {
    public static void main(String[] args){
        ConcreteMediator mediator = new ConcreteMediator();
        Store store = new Store(20, mediator);
        Repository repository = new Repository(20, mediator);
        Factory factory = new Factory(mediator);
        mediator.addStore(store);
        mediator.addRepository(repository);
        mediator.addFactory(factory);

        store.updateStock(4);
        store.updateStock(14);
        store.updateStock(6);
        store.updateStock(2);
        store.updateStock(12);
    }
}
