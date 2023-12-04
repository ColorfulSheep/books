public class TopFactory extends AbstractFactory {

    @Override
    public  ICar create() {
        return new TopCar();
    }
    
}
