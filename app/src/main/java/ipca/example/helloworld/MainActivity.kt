package ipca.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        var textView = TextView(this)
        textView.text="Olá Mundo!"
        textView.textSize = 32f

        var count = 0

        var button = Button(this)
        button.setText("button")


        var linearLayout = LinearLayout(this)

        linearLayout.addView(textView)
        linearLayout.addView(button)

        setContentView(linearLayout)

        button.setOnClickListener(View.OnClickListener {

            textView.text="Hello World " + count
            count += 1
        })

    }
}
