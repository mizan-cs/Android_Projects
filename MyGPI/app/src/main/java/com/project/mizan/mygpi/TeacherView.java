package com.project.mizan.mygpi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class TeacherView extends AppCompatActivity {
    TextView teacherName, teacherEducation, teacherDesignation, teacherJob, teacherMobile, teacherEmail;
    ImageView teacherImage;
    Button call;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_view);
        teacherName = (TextView) findViewById(R.id.ID_ViewTeacherName);
        teacherEducation = (TextView) findViewById(R.id.ID_ShowTeacherEducation);
        teacherDesignation = (TextView) findViewById(R.id.ID_ViewTeacherDesignation);
        teacherJob = (TextView) findViewById(R.id.ID_ViewTeacherJob);
        teacherMobile = (TextView) findViewById(R.id.ID_ViewTeacherMobile);
        teacherEmail = (TextView) findViewById(R.id.ID_ViewTeacherEmail);
        teacherImage = (ImageView) findViewById(R.id.ID_ViewTeacherImage);
        /*call = (Button) findViewById(R.id.ID_ViewTeacherCall);*/

        String name = getIntent().getStringExtra("teacher-name");
        int image = getIntent().getIntExtra("teacher-image", 0);
        String edu = getIntent().getStringExtra("teacher-education");
        String deg = getIntent().getStringExtra("teacher-designation");
        String job = getIntent().getStringExtra("teacher-job");
        String mobile = getIntent().getStringExtra("teacher-mobile");
        String email = getIntent().getStringExtra("teacher-email");

        teacherName.setText(name);
        teacherImage.setImageResource(image);
        teacherEducation.setText(edu);
        teacherDesignation.setText(deg);
        teacherJob.setText(job);
        teacherMobile.setText(mobile);
        teacherEmail.setText(email);

        /*call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_SHORT).show();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0377778888"));
            }
        });*/
        Bitmap bm = BitmapFactory.decodeResource(getResources(), image);
        teacherImage.setImageBitmap(getCircleBitmap(bm));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.ID_ViewTeacherCall);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private Bitmap getCircleBitmap(Bitmap bitmap) {
        final Bitmap output = Bitmap.createBitmap(bitmap.getWidth(),
                bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(output);

        final int color = Color.RED;
        final Paint paint = new Paint();
        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        final RectF rectF = new RectF(rect);

        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(color);
        canvas.drawOval(rectF, paint);

        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);

        bitmap.recycle();

        return output;
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("TeacherView Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
