package com.textile.mrm;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Contact_us extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        ListView listView=(ListView)findViewById(R.id.list);
        String[] image={"Facebook","Call","Whatsapp","Instagram"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.listitem,image);
        listView.setAdapter(arrayAdapter);
        image.setOnClickListener(new View.OnClickListener(){
            if ("Facebook"==

            {
                TextView textView = (TextView) findViewById(R.id.img);
                @Override
                public void onClick (View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mrmtextile/"));
                startActivity(intent);
            }
            }
            } else if ("button2".equals(image)) {
                ImageView imageView = (ImageView) findViewById(R.id.img);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mrmtextile/"));
                        startActivity(intent);
                    }
                });
            } else if ("button3".equals(image)) {
                ImageView imageView = (ImageView) findViewById(R.id.img);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mrmtextile/"));
                        startActivity(intent);
                    }

        });


            });
        }
        return true;
    }

});












                        }
                    });
                    img1.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {
                             Intent intent1=new Intent(Intent.ACTION_DIAL, Uri.parse("916379528919"));
                             startActivity(intent1);

                         }
                     });

               img2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Intent intent3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/916379528919"));
                       startActivity(intent3);

                   }
               });

                       img3.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               Intent intent4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mrmsilks/"));
                               startActivity(intent4);


                           }
                       });

                }

            }


