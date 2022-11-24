package 设计模式.结构型模式.适配器模式;

public class 视频适配器 implements 音频媒体 {

    视频媒体 视频;

    视频适配器(视频媒体 视频){
        this.视频 = 视频;
    }

    @Override
    public String 播放音乐(String 名称) {
        // 实现音频媒体的接口，与视频媒体进行对接
        return 视频.播放视频(名称);
    }
}
