package id.ac.unimed.mobileunimed;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import id.ac.unimed.mobileunimed.posts.PostsResult;
import id.ac.unimed.mobileunimed.posts.Title;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ListView listPost;
    private ApiInterface api;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listPost = (ListView) findViewById(R.id.listPost);
        api = ApiClient.getClient().create(ApiInterface.class);
        getData();
    }

    private void getData(){
        Call<List<PostsResult>> call = api.getPosts();
        mProgressDialog = new ProgressDialog(MainActivity.this);
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setMessage("loading...");
        mProgressDialog.show();
        call.enqueue(new Callback<List<PostsResult>>() {
            @Override
            public void onResponse(Call<List<PostsResult>> call,
                                   Response<List<PostsResult>> response) {
                if (mProgressDialog.isShowing()) {
                    mProgressDialog.dismiss();
                }
                final List<PostsResult> result = response.body();
                if(result != null){
                    List<String> titles = new ArrayList<>();
                    for(PostsResult post :  result){
                        Title title = post.getTitle();
                        titles.add(title.getRendered());
                    }
                    ArrayAdapter<String> adapter =
                            new ArrayAdapter<String>(MainActivity.this,
                            R.layout.row_posts,
                            R.id.judul,
                            titles.toArray(new String[titles.size()]));
                    listPost.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<PostsResult>> call, Throwable t) {

            }
        });
    }

}
