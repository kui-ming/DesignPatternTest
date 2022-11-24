package 设计模式.建造者模式.链式调用;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder().setCpu("CORE i7-9750")
                .setMemory("16GB")
                .setVideoCard("GTX1660 Ti 6G")
                .setStorageSpaces("1TB SSD + 1TB HDD")
                .build();
        System.out.println(computer);
    }
}