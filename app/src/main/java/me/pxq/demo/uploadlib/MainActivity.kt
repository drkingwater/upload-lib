package me.pxq.demo.uploadlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.pxq.demo.lib.pay.PayService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //测试不同环境下支付
        PayService().pay("123", 10f)
    }
}