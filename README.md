效果图
![](https://github.com/FynnJason/LoadingDialog/blob/master/GIF.gif)

使用说明
--
1、项目下的build.gradle添加

```
allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
```
2、模块下的build.gradle添加依赖

```
dependencies {
	        implementation 'com.github.FynnJason:LoadingDialog:1.0.1'
	}
```
3、在代码中使用(建议大家直接封装到一个类里，避免对象多次创建)

```
LoadingDailog.Builder loadBuilder=new LoadingDailog.Builder(this)
                .setCancelable(true)
                .setCancelOutside(true);
        LoadingDailog dialog=loadBuilder.create();
        dialog.show();
```
