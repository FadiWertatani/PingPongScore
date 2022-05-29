package com.example.pingpongscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pingpongscore.databinding.ActivityMainBinding
import java.net.ServerSocket

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var P1 = 0 //Score Player1
        var P2 = 0 //Score Player2
        var serve = true //serve on true means the serve is for Player1
        var s = 0 //counter for serve times
        var H1 = 0 //number of half wins for Player1
        var H2 = 0 //number of half wins for player2


        binding.Plus1.setOnClickListener {
            P1++
            binding.Score1.text = "$P1"
            s++
            //change the player who serve
            if (s==5 || s==10 || s==15 || s==20){
                serve = !serve
            }
            if (serve){
                binding.serve.text = "The serve is for Player 1"
            }else if (!serve){
                binding.serve.text = "The serve is for Player 2"
            }
            if (P1 == 11){
                H1++
                binding.Half1.text = "$H1"
                P1 = 0
                P2 = 0
            }
            if (P2 == 11){
                H2++
                binding.Half2.text = "$H2"
                P2 = 0
                P1 = 0
            }
            if (H1 == 2){
                binding.Winner.text = "The winner is $P1"
            }
            if (H2 == 2){
                binding.Winner.text = "The winner is $P2"
            }
            //restart
            binding.restart.setOnClickListener {
                P1 = 0
                P2 = 0
                H1 = 0
                H2 = 0
                s = 0
                serve = true
                binding.Score1.text = "$P1"
                binding.Score2.text = "$P2"
                binding.Half1.text = "$P1"
                binding.Half2.text = "$P2"
            }
        }
        binding.Minus1.setOnClickListener {
            P1--
            binding.Score1.text = "$P1"
            s--
            //change the player who serve
            if (s==5 || s==10 || s==15 || s==20){
                serve = !serve
            }
            if (serve){
                binding.serve.text = "The serve is for Player 1"
            }else if (!serve){
                binding.serve.text = "The serve is for Player 2"
            }
            if (P1 == 11){
                H1++
                binding.Half1.text = "$H1"
                P1 = 0
                P2 = 0
            }
            if (P2 == 11){
                H2++
                binding.Half2.text = "$H2"
                P2 = 0
                P1 = 0
            }
            if (H1 == 2){
                binding.Winner.text = "The winner is $P1"
            }
            if (H2 == 2){
                binding.Winner.text = "The winner is $P2"
            }
            //restart
            binding.restart.setOnClickListener {
                P1 = 0
                P2 = 0
                H1 = 0
                H2 = 0
                s = 0
                serve = true
                binding.Score1.text = "$P1"
                binding.Score2.text = "$P2"
                binding.Half1.text = "$P1"
                binding.Half2.text = "$P2"
            }
        }
        binding.Plus2.setOnClickListener {
            P2++
            binding.Score2.text = "$P2"
            s++
            //change the player who serve
            if (s==5 || s==10 || s==15 || s==20){
                serve = !serve
            }
            if (serve){
                binding.serve.text = "The serve is for Player 1"
            }else if (!serve){
                binding.serve.text = "The serve is for Player 2"
            }
            if (P1 == 11){
                H1++
                binding.Half1.text = "$H1"
                P1 = 0
                P2 = 0
            }
            if (P2 == 11){
                H2++
                binding.Half2.text = "$H2"
                P2 = 0
                P1 = 0
            }
            if (H1 == 2){
                binding.Winner.text = "The winner is $P1"
            }
            if (H2 == 2){
                binding.Winner.text = "The winner is $P2"
            }
            //restart
            binding.restart.setOnClickListener {
                P1 = 0
                P2 = 0
                H1 = 0
                H2 = 0
                s = 0
                serve = true
                binding.Score1.text = "$P1"
                binding.Score2.text = "$P2"
                binding.Half1.text = "$P1"
                binding.Half2.text = "$P2"
            }
        }
        binding.Minus2.setOnClickListener {
            P2--
            binding.Score2.text = "$P2"
            s--
            //change the player who serve
            if (s==5 || s==10 || s==15 || s==20){
                serve = !serve
            }
            if (serve){
                binding.serve.text = "The serve is for Player 1"
            }else if (!serve){
                binding.serve.text = "The serve is for Player 2"
            }
            if (P1 == 11){
                H1++
                binding.Half1.text = "$H1"
                P1 = 0
                P2 = 0
            }
            if (P2 == 11){
                H2++
                binding.Half2.text = "$H2"
                P2 = 0
                P1 = 0
            }
            if (H1 == 2){
                binding.Winner.text = "The winner is $P1"
            }
            if (H2 == 2){
                binding.Winner.text = "The winner is $P2"
            }
            //restart
            binding.restart.setOnClickListener {
                P1 = 0
                P2 = 0
                H1 = 0
                H2 = 0
                s = 0
                serve = true
                binding.Score1.text = "$P1"
                binding.Score2.text = "$P2"
                binding.Half1.text = "$P1"
                binding.Half2.text = "$P2"
            }
        }

    }
}