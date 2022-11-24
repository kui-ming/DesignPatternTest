package 设计模式.建造者模式.链式调用;

public class Computer {

    private String cpu;
    private String videoCard;
    private String memory;
    private String storageSpaces;

    private Computer(Builder builder){
            cpu = builder.cpu;
            videoCard = builder.videoCard;
            memory = builder.memory;
            storageSpaces = builder.storageSpaces;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", videoCard='" + videoCard + '\'' +
                ", memory='" + memory + '\'' +
                ", storageSpaces='" + storageSpaces + '\'' +
                '}';
    }

    public static class Builder{
        private String cpu;
        private String videoCard;
        private String memory;
        private String storageSpaces;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setVideoCard(String videoCard) {
            this.videoCard = videoCard;
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder setStorageSpaces(String storageSpaces) {
            this.storageSpaces = storageSpaces;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
