package mx.mimir.holatoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private short conteo = 0;
    private TextView viewConteo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewConteo = (TextView) findViewById(R.id.txtConteo);
    }

    public void mostrarToast(View view) {
        Toast toast = Toast.makeText(this, R.string.tstMessage ,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void contar(View view) {
        conteo++;
        if(viewConteo != null)
            viewConteo.setText(Short.toString(conteo));
    }
}