package ch.heigvd.iict.daa.template

import android.content.res.Configuration
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_linear)

        // Get a reference to the LinearLayout
        val mainLayout = findViewById<LinearLayout>(R.id.main_layout)

        // Check the current orientation
        val orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Set LinearLayout to horizontal in landscape mode
            mainLayout.orientation = LinearLayout.HORIZONTAL
        } else {
            // Set LinearLayout to vertical in portrait mode
            mainLayout.orientation = LinearLayout.VERTICAL
        }
    }
}