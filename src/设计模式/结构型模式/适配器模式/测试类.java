package 设计模式.结构型模式.适配器模式;

public class 测试类 {
    public static void main(String[] args) {
        媒体播放器 播放器 = new 媒体播放器();
        MP3播放器 mp3 = new MP3播放器();
        播放器.播放(mp3, "小苹果.mp3");
        视频适配器 适配器 = new 视频适配器(new MP4播放器());
        播放器.播放(new MP4适配器(), "勇敢的心.mp4");
        播放器.播放(new WMV适配器(), "疯狂动物城.wmv");
    }
}
