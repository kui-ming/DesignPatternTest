package 设计模式.原型模式.原型管理器;

import 设计模式.原型模式.Sheep;

import java.util.HashMap;

public class PrototypeManager {

    private HashMap<String, Animal> prototypeMap = new HashMap<>();

    public PrototypeManager(){
        put("cat", new Cat("Tom", "black", 7));
        put("dog", new Dog("福贵", "黑白相间", 23));
        put("sheep", new Sheep("Dolly","white", 5));
    }

    public void put(String key, Animal value){
        prototypeMap.put(key, value);
    }

    public Animal get(String key){
        Animal animal = prototypeMap.get(key);
        if (animal != null){
            return animal.clone();
        }
        return null;
    }
}
