# OSAI 生鲜识别 SDK Android 7.4.2

普通版适用于 Java 接入。需要在 Android 设备上提供 HTTP 服务时，请选择 HTTP 版。两版均包含 armeabi-v7a 和 arm64-v8a。

```groovy
repositories { maven { url 'https://jitpack.io' } }
// 普通版
implementation 'com.github.OSAILab:Middleware:7.4.2'
// 或 HTTP 版
implementation 'com.github.OSAILab:Middleware:7.4.2_http'
```

使用固定 VID 初始化时，SDK 可联网找回同机无 VID 设备号的已有正式授权。设备号和可用的 MAC 可在本地读取，有效的本地永久授权支持离线使用。

使用离线 AAR 时请选择一种完整依赖，替换后重新编译宿主 APK。两份 AAR、发布说明和 SHA256 校验文件见 [GitHub Release 7.4.2](https://github.com/OSAILab/Middleware/releases/tag/7.4.2)。