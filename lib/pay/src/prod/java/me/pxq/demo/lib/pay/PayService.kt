package me.pxq.demo.lib.pay

import android.util.Log

/**
 * Description: 正式环境支付服务
 * Author : pxq
 * Date : 2020/7/20 7:57 PM
 */
class PayService : IPayService {
    override fun pay(userId: String, price: Float) {
        Log.d("PayService", "pay: 正式环境支付...版本：1.0.1 $userId,$price")
    }
}