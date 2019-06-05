package com.example.simpleappwithmvp.activities

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.example.simpleappwithmvp.R
import com.example.simpleappwithmvp.data.vos.InputNameVO
import com.example.simpleappwithmvp.mvp.presenter.HomePresenter
import com.example.simpleappwithmvp.mvp.view.HomeView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : BaseActivity(), HomeView {

    lateinit var mHomePresenter: HomePresenter
    var inputName: String?= null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        inputName = etInputName.text.toString()

        Log.d("Name", "InputName$inputName")

        mHomePresenter = HomePresenter(this)
        mHomePresenter.onUIReady(inputName.toString())
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }





    override fun showNameOnScreen(inputNameVO: InputNameVO) {
        etInputName.setText(inputNameVO.inputName)
    }

}
