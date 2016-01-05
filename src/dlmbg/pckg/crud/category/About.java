package dlmbg.pckg.crud.category;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/*

 * Just Simple Android CRUD App with Parent Child Content
 */

public class About extends Activity {

    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.about);

 		TextView txt_nama = (TextView) findViewById(R.id.txt_nama_about);
 		TextView txt_npm = (TextView) findViewById(R.id.txt_nim_about);
 		TextView txt_jurusan = (TextView) findViewById(R.id.txt_jurusan_about);
 		TextView txt_kampus = (TextView) findViewById(R.id.txt_kampus_about);

 		txt_nama.setText("Rizqy Arrijal Mutakin");
 		txt_npm.setText("1137050197");
 		txt_jurusan.setText("Teknik Informatika");
 		txt_kampus.setText("http://uinsgd.ac.id");

    }
}
