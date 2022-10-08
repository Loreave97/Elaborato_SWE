public class StrategyC implements Strategy {
    private ConcreteMediator mediator;
    private int art;

    public StrategyC(ConcreteMediator mediator, int art){
        this.mediator = mediator;
        this.art = art;
    }
    public void stockUp(){
    }
}
