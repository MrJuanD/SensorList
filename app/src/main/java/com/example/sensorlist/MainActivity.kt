package com.example.sensorlist

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    private lateinit var sensorManager: SensorManager
    private lateinit var deviceSensors: List<Sensor>

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        deviceSensors = sensorManager.getSensorList(Sensor.TYPE_ALL)
        var sensorListString = ""
        for (sensor in deviceSensors)
        {
            sensorListString += sensor.name + "\n"
        }
        sensorListTextView.text = sensorListString
    }
}
