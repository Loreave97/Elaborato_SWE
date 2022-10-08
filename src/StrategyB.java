public class StrategyB implements Strategy {
    private ConcreteMediator mediator;
    private int art;

    public StrategyB(ConcreteMediator mediator, int art){
        this.mediator = mediator;
        this.art = art;
    }
    public void stockUp(){
        mediator.askForProduction(15);
    }
}
