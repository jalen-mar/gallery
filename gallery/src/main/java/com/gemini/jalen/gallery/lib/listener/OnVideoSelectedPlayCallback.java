package com.gemini.jalen.gallery.lib.listener;

import com.gemini.jalen.gallery.lib.entity.LocalMedia;

/**
 * @author：luck
 * @date：2020-01-15 14:38
 * @describe：自定义视频播放回调
 */
public interface OnVideoSelectedPlayCallback {
    /**
     * 播放视频
     *
     * @param media
     */
    void startPlayVideo(LocalMedia media);
}
