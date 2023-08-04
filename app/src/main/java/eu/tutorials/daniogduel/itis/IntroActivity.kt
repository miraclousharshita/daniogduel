package eu.tutorials.daniogduel.itis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import eu.tutorials.daniogduel.R
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

         //window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
           // WindowManager.LayoutParams.FLAG_FULLSCREEN)
        btn_sign_in.setOnClickListener{

            startActivity(Intent(this, SigninActivity::class.java))
        }

        btn_signup.setOnClickListener{
            startActivity(Intent(this, SignupActivity::class.java ))
        }
    }
}