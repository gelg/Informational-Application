package academy.learnprogramming.informationalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button mountainBtn;
    private Button lakeBtn;
    private Button treeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mountainBtn = findViewById(R.id.btnMountain);
        lakeBtn = findViewById(R.id.btnLake);
        treeBtn = findViewById(R.id.btnTree);


        mountainBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goToMountain();
            }
        });

        lakeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goToLake();
            }
        });

        treeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goToTree();
            }
        });
    }

    private void goToMountain()
    {
        Intent goToM = new Intent(MainActivity.this, activityMountain.class);
        startActivity(goToM);
    }

    private void goToLake()
    {
        Intent goToL = new Intent(MainActivity.this, activityLake.class);
        startActivity(goToL);
    }

    private void goToTree()
    {
        Intent goToT = new Intent(MainActivity.this, activityTree.class);
        startActivity(goToT);
    }
}
