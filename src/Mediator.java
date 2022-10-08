public interface Mediator{
    public void addStore(Store store);
    public void addRepository(Repository repository);
    public void addFactory(Factory factory);
    public void updateRepository(int stock);
    public void updateStore(int stock);
    public void updateFactory(int stock);
}
