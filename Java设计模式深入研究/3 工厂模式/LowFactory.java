public class LowFactory extends AbstractFactory {

    @Override
    public ICar create() {
        return new LowCar();
    }
    
}
