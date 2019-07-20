package com.mattdog.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mattdog.swoosh.Model.Player
import com.mattdog.swoosh.Utilities.EXTRA_LEAGUE
import com.mattdog.swoosh.R
import com.mattdog.swoosh.Utilities.EXTRA_PLAYER
import com.mattdog.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    lateinit var player : Player
    //'lateinit var' allows you to initialize a variable with no values yet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        //league = intent.getStringExtra(EXTRA_LEAGUE)
        //'getStringExtra' allows the class to receive data being passed on

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }


    fun onBallerClick(view: View){
            beginnerSkillBtn.isChecked = false
            player.skill = "baller"
    }

    fun onBeginnerClick(view: View){
            ballerSkillBtn.isChecked = false
            player.skill = "beginner"
    }

    fun onSkillFinishClicked(view: View){
        if (player.skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }
}
