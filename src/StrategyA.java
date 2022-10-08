public class StrategyA implements Strategy {
    private ConcreteMediator mediator;
    private int art;

    public StrategyA(ConcreteMediator mediator, int art){
        this.mediator = mediator;
        this.art = art;
    }
    public void stockUp(){
        mediator.askForProduction(30);
    }
}
