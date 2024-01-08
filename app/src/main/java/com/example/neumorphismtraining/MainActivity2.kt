package com.example.neumorphismtraining

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.neumorphismtraining.databinding.ActivityMain2Binding
import soup.neumorphism.NeumorphImageView
import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {
    lateinit var binding2: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding2.root)
        neuButtonFunctions()

    }

    @SuppressLint("RestrictedApi")
    private fun neuButtonFunctions() {
        binding2.btnBattery.setOnClickListener {
            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {
                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
            }
            binding2.btnCondition.setShapeType(ShapeType.FLAT)
            binding2.btnProgram.setShapeType(ShapeType.FLAT)
            binding2.btnRange.setShapeType(ShapeType.FLAT)
            binding2.btnRange.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )
            binding2.btnProgram.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )
            binding2.btnCondition.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )


        }
        binding2.btnCondition.setOnClickListener {
            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {
                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
            }
            binding2.btnBattery.setShapeType(ShapeType.FLAT)
            binding2.btnProgram.setShapeType(ShapeType.FLAT)
            binding2.btnRange.setShapeType(ShapeType.FLAT)
            binding2.btnRange.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )
            binding2.btnProgram.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )
            binding2.btnBattery.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )


        }
        binding2.btnRange.setOnClickListener {
            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {
                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
            }
            binding2.btnBattery.setShapeType(ShapeType.FLAT)
            binding2.btnProgram.setShapeType(ShapeType.FLAT)
            binding2.btnCondition.setShapeType(ShapeType.FLAT)
            binding2.btnCondition.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )
            binding2.btnProgram.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )
            binding2.btnBattery.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )


        }
        binding2.btnProgram.setOnClickListener {
            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {
                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
            }
            binding2.btnBattery.setShapeType(ShapeType.FLAT)
            binding2.btnCondition.setShapeType(ShapeType.FLAT)
            binding2.btnRange.setShapeType(ShapeType.FLAT)
            binding2.btnCondition.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )
            binding2.btnRange.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )
            binding2.btnBattery.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.icon_default_color
                )
            )


        }


    }
}