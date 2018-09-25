package atec.pt.passingobjects;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import atec.pt.passingobjects.model.Gaja;

public class MainActivity extends AppCompatActivity {
    EditText mNome,
        mIdade,
        mTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mNome       = findViewById(R.id.edNome);
        mIdade      = findViewById(R.id.edIdade);
        mTelefone   = findViewById(R.id.edTelefone);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gaja g = new Gaja(mNome.getText().toString(), mIdade.getText().toString(), mTelefone.getText().toString());

                AppObjects ap = (AppObjects) getApplication();
                ap.setG(g);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_list) {
            // todo: Mudar para nova activity
            Intent it = new Intent(getApplicationContext(), VisualizarGaja.class);
            startActivity(it);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
