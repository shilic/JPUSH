package slc.urora_jpush.myReceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import cn.jpush.android.service.JPushMessageReceiver


/*注 :SDK回调方式说明.  现 5.6.0
SDK版本：3.0.7<= x < 5.2.0 和 5.4.0及以上 使用 receiver 方式
SDK版本：5.2.0<= x <=5.3.1 使用 service 方式*/
class MyReceiver : JPushMessageReceiver() {

//    override fun onReceive(context: Context, intent: Intent) {
//        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
//        TODO("MyReceiver.onReceive() is not implemented")
//    }


}