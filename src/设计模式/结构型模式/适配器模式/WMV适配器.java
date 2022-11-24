package 设计模式.结构型模式.适配器模式;

public class WMV适配器 extends WMV播放器 implements 音频媒体 {

    @Override
    public String 播放音乐(String 名称) {
        return 播放视频(名称);
    }
}
