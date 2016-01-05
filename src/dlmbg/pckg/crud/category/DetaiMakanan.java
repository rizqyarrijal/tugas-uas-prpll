package dlmbg.pckg.crud.category;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/*

 * Just Simple Android CRUD App with Parent Child Content
 */

public class DetaiMakanan extends Activity{

	private TextView nama_makanan_et, harga_et, keterangan_et;
	private ImageView gambar_iv;
	
	String nama_makanan,harga,keterangan,gambar;

	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);

		setContentView(R.layout.detail);

		nama_makanan_et = (TextView) findViewById(R.id.nama_makanan_detail);
		harga_et = (TextView) findViewById(R.id.kelahiran_detail);
		keterangan_et = (TextView) findViewById(R.id.keterangan_detail);
		gambar_iv = (ImageView) findViewById(R.id.gambar_detail);
		
		Bundle extras = getIntent().getExtras();
		nama_makanan = extras.getString("nama_penemu");
		harga = extras.getString("kelahiran");
		keterangan = extras.getString("keterangan");
		gambar = extras.getString("gambar");

		nama_makanan_et.setText(nama_makanan);
		harga_et.setText(harga);
		keterangan_et.setText(keterangan);
		
		Bitmap bmImg = BitmapFactory.decodeFile(gambar);
		gambar_iv.setImageBitmap(bmImg);
		
		String imageInSD = gambar;      
		Bitmap bitmap = BitmapFactory.decodeFile(imageInSD);
		gambar_iv.setImageBitmap(bitmap);
		

	}

}
