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
    implementation 'com.github.OSAILab:Middleware:{latest}'
}
```

使用
---------

```
1.初始化SDK
MiddlewareEventCallback callback = new MiddlewareEventCallback(){
                                                                 
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
 }

Middleware.MiddlewareConfigBuilder configBuilder = new Middleware.MiddlewareConfigBuilder()
                                                    .setContext(Context)
                                                    .setVid("厂家ID")
                                                    .setCallback(callback)
                                                    .setOpenCamera(true)
                                                    .build();
Middleware.initialize(configBuilder);

2.获取过期时间并激活识别功能
Middleware.getInstance().getDeviceExpireTime();

3.激活设备,如果已激活忽略
Middleware.getInstance().activationDevice(code);

4.识别商品
//识别SDK正在使用的摄像头画面
String[] results = Middleware.getInstance().recognize();
//识别Bitmap
String[] results = Middleware.getInstance().recognizeBitmap(Bitmap);
//识别文件
String[] results = Middleware.getInstance().recognizeFile(String);


5.学习商品
Middleware.getInstance().update(sku);
```
