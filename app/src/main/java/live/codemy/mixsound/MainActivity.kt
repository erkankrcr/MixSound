package live.codemy.mixsound

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import live.codemy.mixsoundlib.MixSound

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val record = findViewById<ImageView>(R.id.Record)
       val sound1 = findViewById<ImageView>(R.id.Sound1)
       val sound2 = findViewById<ImageView>(R.id.Sound2)
       val sound3 = findViewById<ImageView>(R.id.Sound3)
       val sound4 = findViewById<ImageView>(R.id.Sound4)
       val layoutA = findViewById<LinearLayout>(R.id.Sound12)
       val layoutB = findViewById<LinearLayout>(R.id.Sound34)

        var mixSound = MixSound.getInstance(this)

        layoutA.visibility = View.VISIBLE
        layoutB.visibility = View.VISIBLE

        record.setOnClickListener {
            mixSound.recordSound()
        }

    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)

    }
}