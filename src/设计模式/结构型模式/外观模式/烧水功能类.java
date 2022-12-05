package 设计模式.结构型模式.外观模式;

public class 烧水功能类 {
    public void 开始(){
        System.out.println("开始烧水……水还有一阵子才开，先去干其他事吧！");

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000); // 等待一秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("水开了！");
            }
        }).start();
    }
}
