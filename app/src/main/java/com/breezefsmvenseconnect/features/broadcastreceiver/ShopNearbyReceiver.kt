package com.breezefsmvenseconnect.features.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

import com.breezefsmvenseconnect.R
import com.breezefsmvenseconnect.app.AppDatabase
import com.breezefsmvenseconnect.app.utils.AppUtils
import com.breezefsmvenseconnect.app.utils.NotificationUtils

/**
 * Created by Kinsuk on 14-11-2017.
 */

class ShopNearbyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // assumes WordService is a registered service
        //        Intent intent = new Intent(context, WordService.class);
        //        context.startService(intent);
//        XLog.d("onReceive : ShopNearbyReceiver")
        val extras = intent.extras
        if (extras != null) {

            val shopname = extras.getString("shopName")
            val shopId = extras.getString("shopId")
            val localShopId = extras.getString("localShopId")

            if (shoulIBotherToNotify(shopId!!))
                return


            if (shopname != null) {

//                XLog.d("onReceive : CreateNotification")
                val notification = NotificationUtils(context.getString(R.string.app_name), shopname, shopId!!, localShopId!!)
                notification.CreateNotification(context)
            }
        }
    }

    fun shoulIBotherToNotify(shopId: String): Boolean {
        var shouldUpdate = AppDatabase.getDBInstance()!!.shopActivityDao().getIsVisitedOfShop(shopId, AppUtils.getCurrentDateForShopActi())
        return shouldUpdate
    }


}
