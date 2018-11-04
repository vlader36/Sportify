package pro.papaya.canyo.sportify.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import pro.papaya.canyo.myapplication.R
import pro.papaya.canyo.sportify.network.ApiClient
import java.util.*

class LoginActivity : AppCompatActivity(), View.OnClickListener {
  override fun onClick(v: View?) {
    when (v!!.id) {
      R.id.login_login -> {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        return
      }

      R.id.login_register -> {
        val intent = Intent(this, RegisterActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        return
      }
    }
  }

  private lateinit var username: EditText
  private lateinit var password: EditText
  private lateinit var login: Button
  private lateinit var register: Button

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)
    supportActionBar?.hide()

    username = findViewById(R.id.login_username)
    password = findViewById(R.id.login_password)
    login = findViewById(R.id.login_login)
    login.setOnClickListener(this)
    register = findViewById(R.id.login_register)
    register.setOnClickListener(this)

    ApiClient.initApi()
  }
}
