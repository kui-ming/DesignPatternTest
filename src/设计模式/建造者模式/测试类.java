package 设计模式.建造者模式;

import 设计模式.建造者模式.优化.指挥者类;

public class 测试类 {
    public static void main(String[] args) {
        /*套餐类 套餐 = new 建造者类().构造小霸王套餐();
        套餐.展示套餐();
        System.out.println();
        套餐 = new 建造者类().构造大霸王套餐();
        套餐.展示套餐();*/

        套餐类 套餐 = new 指挥者类().构造小霸王套餐();
        套餐.展示套餐();
        System.out.println();
        套餐 = new 指挥者类().构造大霸王套餐();
        套餐.展示套餐();
        System.out.println();
        套餐 = new 指挥者类().构造至尊大霸王套餐();
        套餐.展示套餐();
    }
}
