package com.example.newproject

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newproject.databinding.ActivityMainBinding
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var result = StringBuilder()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupChipGroup()

        findViewById<Button>(R.id.button).setOnClickListener{

            result.clear()

            result.append("Zainteresowania:")

            if (binding.chip1.isChecked)
            {
                result.append("\n- Sport")
            }
            if (binding.chip2.isChecked)
            {
                result.append("\n- Gry")
            }
            if (binding.chip3.isChecked)
            {
                result.append("\n- Muzyka")
            }
            if (binding.chip4.isChecked)
            {
                result.append("\n- Programowanie")
            }

            result.append("\nOcena: ")

            if (binding.chip5.isChecked)
            {
                result.append("\nWcale")
            }
            else if (binding.chip6.isChecked)
            {
                result.append("\nMało")
            }
            else if (binding.chip7.isChecked)
            {
                result.append("\nŚrednio")
            }
            else if (binding.chip8.isChecked)
            {
                result.append("\nBardzo")
            }

            result.append(" mi się to podoba")

            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupChipGroup() {
        binding.chip1.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast
                .makeText(this, "Removed 1st Chip", Toast.LENGTH_SHORT)
                .show()
        }

        binding.chip2.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast
                .makeText(this, "Removed 2nd Chip", Toast.LENGTH_SHORT)
                .show()
        }
        binding.chip3.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast
                .makeText(this, "Removed 3rd Chip", Toast.LENGTH_SHORT)
                .show()
        }
        binding.chip4.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast
                .makeText(this, "Removed 4th Chip", Toast.LENGTH_SHORT)
                .show()
        }
        binding.chip5.setOnCloseIconClickListener {
            binding.chipGroup2.removeView(it)
            Toast
                .makeText(this, "Removed 5st Chip", Toast.LENGTH_SHORT)
                .show()
        }
        binding.chip6.setOnCloseIconClickListener {
            binding.chipGroup2.removeView(it)
            Toast
                .makeText(this, "Removed 6th Chip", Toast.LENGTH_SHORT)
                .show()
        }
        binding.chip7.setOnCloseIconClickListener {
            binding.chipGroup2.removeView(it)
            Toast
                .makeText(this, "Removed 7th Chip", Toast.LENGTH_SHORT)
                .show()
        }
        binding.chip8.setOnCloseIconClickListener {
            binding.chipGroup2.removeView(it)
            Toast
                .makeText(this, "Removed 8th Chip", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
