package com.moin.profileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<CardView>(R.id.supportCard).setOnClickListener {
            Toast.makeText(this, "Support", Toast.LENGTH_SHORT).show()
        }

        findViewById<ImageView>(R.id.editProfileIcon).setOnClickListener {
            Toast.makeText(this, "Edit Profile", Toast.LENGTH_SHORT).show()
        }

        findViewById<CardView>(R.id.credGarageCard).setOnClickListener {
            Toast.makeText(this, "CRED Garage", Toast.LENGTH_SHORT).show()
        }

        findViewById<LinearLayout>(R.id.creditScoreRow).setOnClickListener {
            Toast.makeText(this, "Credit Score", Toast.LENGTH_SHORT).show()
        }

        findViewById<LinearLayout>(R.id.lifetimeCashbackRow).setOnClickListener {
            Toast.makeText(this, "Lifetime Cashback", Toast.LENGTH_SHORT).show()
        }

        findViewById<LinearLayout>(R.id.bankBalanceRow).setOnClickListener {
            Toast.makeText(this, "Bank Balance", Toast.LENGTH_SHORT).show()
        }

        findViewById<LinearLayout>(R.id.cashbackBalanceItem).setOnClickListener {
            Toast.makeText(this, "Cashback Balance", Toast.LENGTH_SHORT).show()
        }

        findViewById<LinearLayout>(R.id.coinsItem).setOnClickListener {
            Toast.makeText(this, "Coins", Toast.LENGTH_SHORT).show()
        }

        findViewById<LinearLayout>(R.id.allTransactionsItem).setOnClickListener {
            Toast.makeText(this, "All Transactions", Toast.LENGTH_SHORT).show()
        }
    }
}