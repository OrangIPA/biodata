package id.sch.smktelkommlg.siswa.Biodata

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var nama: EditText
    private lateinit var TTL: EditText
    private lateinit var alamat: EditText
    private lateinit var kelas: EditText
    private lateinit var hobi: EditText
    private lateinit var btn_hasil: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nama = findViewById(R.id.nama)
        TTL = findViewById(R.id.TTL)
        alamat = findViewById(R.id.Alamat)
        kelas = findViewById(R.id.kelas)
        hobi = findViewById(R.id.hobi)
        btn_hasil = findViewById(R.id.btn_hasil)
        result = findViewById(R.id.result)

        btn_hasil.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?){
        if(v?.id == R.id.btn_hasil){
            var inputNama: String = nama.text.toString().trim()
            var inputTTL: String = TTL.text.toString().trim()
            var inputAlamat: String = alamat.text.toString().trim()
            var inputKelas: String = kelas.text.toString().trim()
            var inputHobi: String = hobi.text.toString().trim()

            var isEmptyField = false
            if(TextUtils.isEmpty(inputNama)){
                isEmptyField = true
                nama.error = "Field Ini Tidak Boleh Kosong"
            }
            if(TextUtils.isEmpty(inputTTL)){
                isEmptyField = true
                TTL.error = "Field Ini Tidak Boleh Kosong"
            }
            if(TextUtils.isEmpty(inputAlamat)){
                isEmptyField = true
                alamat.error = "Field Ini Tidak Boleh Kosong"
            }
            if(TextUtils.isEmpty(inputKelas)){
                isEmptyField = true
                kelas.error = "Field Ini Tidak Boleh Kosong"
            }
            if(TextUtils.isEmpty(inputHobi)){
                isEmptyField = true
                hobi.error = "Field Ini Tidak Boleh Kosong"
            }

            if(!isEmptyField){
                result.text = "Nama\t\t: " + inputNama + "\nTempat, Tanggal Lahir\t:" + inputTTL +
                        "\nAlamat\t\t:" + inputAlamat + "\nKelas\t\t:" + inputKelas + "\nHobi\t\t:" +
                        inputHobi
            }
        }
    }
}