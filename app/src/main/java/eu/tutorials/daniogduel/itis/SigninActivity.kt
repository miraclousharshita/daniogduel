package eu.tutorials.daniogduel.itis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eu.tutorials.daniogduel.R
import kotlinx.android.synthetic.main.activity_signin.*
import kotlinx.android.synthetic.main.activity_signup.*

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        setupActionBar()

    }
        private fun setupActionBar() {
            setSupportActionBar(toolbar_sign_in_activity)

            val actionBar = supportActionBar
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true)
                actionBar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
            }
            toolbar_sign_up_activity.setNavigationOnClickListener { onBackPressed() }


    }
}