# Dependencies
本项目用于集中管理Android SDK 依赖库,方便客户使用单一依赖,不需要关注SDK使用的依赖变动  
  
使用
---------

```
//工程根目录build.gradle:
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
        ...
        }
}

//app build.gradle:
dependencies {
    implementation 'com.github.OSAILab:Dependencies:latest'
}
```java
