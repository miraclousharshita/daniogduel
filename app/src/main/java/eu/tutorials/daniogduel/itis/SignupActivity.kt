package eu.tutorials.daniogduel.itis

import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import eu.tutorials.daniogduel.R
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : baseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        setupActionBar()
    }


     private fun setupActionBar(){
         setSupportActionBar(toolbar_sign_up_activity)

         val actionBar =supportActionBar
         if(actionBar != null){
             actionBar.setDisplayHomeAsUpEnabled(true)
             actionBar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
         }
                toolbar_sign_up_activity.setNavigationOnClickListener{onBackPressed()}

            btn_sign_up.setOnClickListener{
                registerUSer()
            }
     }


    private fun registerUSer(){
        val name: String = et_name.text.toString().trim{ it <= ' '}
        val email: String = et_email.text.toString().trim { it <= ' '}
        val password: String = et_password.text.toString().trim { it <= ' '}

        if(ValidateForm(name,email,password)){
            Toast.makeText(this@SignupActivity,
            "now we can register a new user",
            Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun ValidateForm(name: String,email: String,password: String) : Boolean{
        return when{
            TextUtils.isEmpty(name)->{
                showErrorSnackBar("Naam daal be")
                false
            }
            TextUtils.isEmpty(email)->{
                showErrorSnackBar("email daal be")
                false
            }
            TextUtils.isEmpty(password)->{
                showErrorSnackBar("password daal be")
                false
            }else -> {
                true
            }
        }

    }

}