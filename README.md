# OSAI 生鲜识别 SDK 7.4.0

Android 通过本仓库的 Git tag / JitPack 接入；完整发布说明与独立下载见 [7.4.0 Release](https://github.com/OSAILab/Middleware/releases/tag/7.4.0)。

在工程仓库配置中加入：

```groovy
maven { url 'https://jitpack.io' }
```

应用依赖二选一：

```groovy
implementation 'com.github.OSAILab:Middleware:7.4.0'
// Android HTTP 服务形式：
// implementation 'com.github.OSAILab:Middleware:7.4.0_http'
```

不要在同一应用同时加入两种形式。更新完整依赖并重新构建宿主 APK。JitPack 的构建与下载状态以[版本页](https://jitpack.io/#OSAILab/Middleware)为准；Git tag 或 GitHub Release 存在不等于 JitPack 构件已可下载。

默认客户支持包包含 Windows x86 SDK、一份中英文离线文档、ReleaseNote 和 Android 获取入口，不内置 AAR。Windows x64 HTTPS 单独下载。先完整解压支持包，打开根目录 index.html，按安装及对应语言快速开始接入；需要 Android HTTP 能力时还须按文档启动 HttpService。

7.4.0 在三个既有 HTTP 路由中显式开启匹配样本、预览和校验删除能力。默认 20 条特征、5 张图时，无图特征仍可查询删除；旧参数与默认响应保持兼容。身份元数据补齐不因本功能强制重建 HNSW。

本次发布构件的来源和 SHA256SUMS 见 Release。Windows 主机检查通过，真实 Win7 运行验收仍为 NOT_VERIFIED；Android 实机业务与完整模型/相机验收范围另行确认。
