package 设计模式.结构型模式.适配器模式;

public class MP3播放器 implements 音频媒体 {

    @Override
    public String 播放音乐(String 名称) {
        return "准备播放MP3格式的音乐：" + 名称;
    }
}
