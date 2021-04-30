package ac.id.coffeshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }

        btn_regis.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
            finish()
        }
    }
}