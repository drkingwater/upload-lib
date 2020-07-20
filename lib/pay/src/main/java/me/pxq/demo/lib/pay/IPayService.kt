package me.pxq.demo.lib.pay

/**
 * Description: 支付接口
 * Author : pxq
 * Date : 2020/7/20 7:53 PM
 */
interface IPayService {

    fun pay(userId : String, price : Float)

}