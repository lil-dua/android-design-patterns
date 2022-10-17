package tech.demoproject.android_design_patterns.creational_patterns.singleton_pattern;

/** Đây là một ví dụ về dùng Singleton với Retrofit
 *
 * Trong một ứng dụng Android, bạn sẽ cần instance của đối tượng Retrofit để các phần khác của
 * ứng dụng như Activity hay Presenter có thể sử dụng nó để thực thi một request API mà không
 * cần phải tạo một instance mới mỗi lần chúng ta cần nó. Việc tạo nhiều instance sẽ là dư thừa,
 * lãng phí tài nguyên bộ nhớ.
 * */

/* import retrofit2.Retrofit;
 import retrofit2.converter.gson.GsonConverterFactory;
 public class RetrofitClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

 }

 */
