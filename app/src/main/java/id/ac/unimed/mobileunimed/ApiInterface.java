package id.ac.unimed.mobileunimed;

import java.util.List;

import id.ac.unimed.mobileunimed.categories.CategoriesResult;
import id.ac.unimed.mobileunimed.posts.PostsResult;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("posts")
    Call<List<PostsResult>> getPosts();

    @GET("categories")
    Call<List<CategoriesResult>> getCategories();
}
