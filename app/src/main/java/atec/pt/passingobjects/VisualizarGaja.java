package atec.pt.passingobjects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import atec.pt.passingobjects.model.Gaja;

public class VisualizarGaja extends AppCompatActivity {
    TextView tvNome,
        tvIdade,
        tvTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_gaja);

        tvNome      = findViewById(R.id.tvNome);
        tvIdade     = findViewById(R.id.tvIdade);
        tvTelefone  = findViewById(R.id.tvTelefone);

        Gaja g = ((AppObjects) getApplication()).getG();

        tvNome.setText(g.getNome());
        tvIdade.setText(g.getIdade());
        tvTelefone.setText(g.getTelefone());
    }
}
