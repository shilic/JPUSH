package slc.urora_jpush

import android.app.Application
import cn.jiguang.api.utils.JCollectionAuth
import cn.jpush.android.api.JPushInterface


class ExampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        JPushInterface.setDebugMode(true)

        // 调整点一：初始化代码前增加setAuth调用 TODO("暂时默认用户同意了")
//        var isPrivacyReady= false // app根据是否已弹窗获取隐私授权来赋值
//        if (!isPrivacyReady) {
//            JCollectionAuth.setAuth(this, false) // 后续的初始化与启用推送服务过程将被拦截，即不会开启推送业务
//        }
        // 必须要同意了隐私政策并确定开启JPush推送服务后，才可以调用该接口。
        JPushInterface.init(this)

        // 调整点二：App用户同意了隐私政策授权，并且开发者确定要开启推送服务后调用 TODO("暂时默认用户同意了")
        JCollectionAuth.setAuth(this, true); //如初始化被拦截过，将重试初始化过程
        /*验证推送结果
        集成完成后，如果输出以下日志则代表您已经集成成功。
        [JPushInterface] action:init
        .......
        [ConnectingHelper] Login succeed
        * */
    }
}