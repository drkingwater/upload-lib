package me.pxq.demo.lib.pay

import android.util.Log

/**
 * Description: 测试环境支付服务
 * Author : pxq
 * Date : 2020/7/20 7:54 PM
 */
class PayService : IPayService {

    override fun pay(userId: String, price: Float) {
        Log.d("PayService", "pay: 测试环境支付...版本：1.0.2 $userId,$price")
    }
}