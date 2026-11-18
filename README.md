# OSAI 生鲜识别 SDK Android 7.4.1

本仓库提供普通版与 HTTP 版 Android SDK，按项目选择一个依赖。

```groovy
repositories { maven { url 'https://jitpack.io' } }
// 普通版
implementation 'com.github.OSAILab:Middleware:7.4.1'
// 或 HTTP 版，二选一
implementation 'com.github.OSAILab:Middleware:7.4.1_http'
```

[GitHub Release 7.4.1](https://github.com/OSAILab/Middleware/releases/tag/7.4.1) 提供两份完整 AAR、发布说明和 SHA256SUMS。两版均含 armeabi-v7a、arm64-v8a，最低 Android API 18。使用离线 AAR 时替换完整依赖并重新构建宿主 APK。

本版在精选和普通多选中启用模型最低原始相似度；默认 min_conf 为 0.5，模型内显式参数仍优先，精选预学习保留既有 0.4 特例。全部候选不合格时返回空 rank，上层应提供未知商品或手动选择入口。

GitHub 标签存在不等于 JitPack 构件已可下载；在线接入前应实际解析对应 POM/AAR。识别效果需结合目标设备、模型和客户样本验收。

Windows SDK 和客户支持包保持本地交付；客户支持包仅含 Windows x86、一份双语文档、ReleaseNote 和 Android 获取入口，不包含 Android AAR。
