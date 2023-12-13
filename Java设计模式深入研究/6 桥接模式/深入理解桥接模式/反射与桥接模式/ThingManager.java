public class ThingManager {     // 事物管理类

    AbstractThing thing;

    AbstractThing createThing(String thingName) throws Exception{
        // 使用反射机制加载事物类对象
        thing = (AbstractThing)Class.forName(thingName).newInstance();
        return thing;
    }
    
}
