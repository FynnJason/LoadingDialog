# LoadingDialog
仿ios loading

https://github.com/FynnJason/LoadingDialog

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
	        compile 'com.github.gittjy:LoadingDialog:1.0.2'
	}
```
3、在代码中使用

```
LoadingDailog.Builder loadBuilder=new LoadingDailog.Builder(this)
                .setMessage("加载中...")
                .setCancelable(true)
                .setCancelOutside(true);
        LoadingDailog dialog=loadBuilder.create();
        dialog.show();
```