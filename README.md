## cordova-plugin-activity

使用Intent方式打开手机已安装的外部应用，例如调用百度地图客户端，访问所需要的路径规划。

----

### 安装使用

```
$ cordova plugin add https://github.com/MaxTan/cordova-plugin-activity.git
```    


```js
let url = `intent://map/direction?origin=latlng:34.264642646862,108.95108518068|name:我家&destination=大雁塔&mode=driving®ion=西安&referer=Autohome|GasStation#Intent;scheme=bdapp;package=com.baidu.BaiduMap;end`;
cordova.plugins.activity.run(url, function () {
    //success
}, function (error) {
    //error
});

```

----

**仅支持android**