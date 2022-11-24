package 设计模式.结构型模式.适配器模式;

public class WMV播放器 implements 视频媒体 {
    @Override
    public String 播放视频(String 名称) {
        return "现在开始播放WMV格式的视频："+名称;
    }
}
