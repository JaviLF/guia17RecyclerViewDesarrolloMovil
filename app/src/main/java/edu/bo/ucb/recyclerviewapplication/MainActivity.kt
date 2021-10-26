package edu.bo.ucb.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = arrayListOf<Usuario>()
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        lista.add(Usuario("Roberto Carlos Callisaya Mamani", "calyr.software@gmail.com"))
        lista.add(Usuario("Gabriela Orosco Montaño", "gabriela_ocsoro@gmail.com"))
        val userListAdapter = UserListAdapter(lista, this)
        recyclerView.adapter = userListAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = linearLayoutManager
    }
}