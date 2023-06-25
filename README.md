# AndroidMiddleware
本项目用于集中管理Android SDK 依赖库,方便客户使用单一依赖,不需要关注SDK使用的依赖变动  
  
Android Studio导入
---------

```
//project build.gradle:
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
        ...
        }
}

//app build.gradle:
dependencies {
    implementation 'com.github.OSAILab:AndroidMiddleware:1.0'
}
```

使用
---------

```
1.初始化SDK
Middleware.initialize(getApplicationContext(),"厂家ID",null,new MiddlewareEventCallback(){

          /**
           * 初始化回调
           * @method {@link Middleware#getDeviceExpireTime()}
           * @param exceptionCode 成功{@link ExceptionCode#Exception_Not}
           *                      设备过期{@link ExceptionCode#Exception_Expire}
           *                      不支持该设备{@link ExceptionCode#Exception_Not_Support}
           *                      无效激活码{@link ExceptionCode#Exception_InvalidCode}
           *                      其他异常{@link ExceptionCode#Exception_Expire}
           */
            @Override
            public void onInit(int exceptionCode) {
                //初始化回调
            }
        });

2.获取过期时间并激活识别功能
Middleware.getInstance().getDeviceExpireTime();

3.激活设备,如果已激活忽略
Middleware.getInstance().activationDevice(code);

4.识别商品
String[] results = Middleware.getInstance().recognize(config);

5.学习商品
Middleware.getInstance().update(selectProduct);
```
