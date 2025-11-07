package com.faizal.aplikasiuntukuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactButton: Button = findViewById(R.id.btn_contact)

        contactButton.setOnClickListener {

            val dialog = AlertDialog.Builder(this)
                .setTitle("Kontak Saya 📞")
                .setMessage(
                    "Halo, ini kontak saya!\n\n" +
                            "📧 Email: mfaizalalfriandy@gmail.com\n" +
                            "📱 Telepon: +62 812-3456-789\n" +
                            "📸 Instagram: @alfriqndy\n\n" +
                            "Jangan ragu untuk menghubungi saya jika ada yang ingin didiskusikan!"
                )
                .setPositiveButton("Tutup") { dialog, _ ->
                    dialog.dismiss()
                }
                .create()

            dialog.show()
        }
    }
}
