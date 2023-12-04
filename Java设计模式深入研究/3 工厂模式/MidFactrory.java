public class MidFactrory extends AbstractFactory {

    @Override
    public ICar create() {
        return new MidCar();
    }
    
}
