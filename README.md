# Android Retrofit Example [![platform](https://img.shields.io/badge/platform-android-brightgreen.svg)](https://developer.android.com/index.html) <a target="_blank" href="https://android-arsenal.com/api?level=21"><img src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"></a>  [![license](https://img.shields.io/badge/license-Apache%202-green.svg)](https://github.com/duanhong169/Camera/blob/master/LICENSE) [![Build status](https://build.appcenter.ms/v0.1/apps/09612c7d-00b4-4b16-86b5-054c45d749f8/branches/master/badge)](https://appcenter.ms)

Retrofit Example App implements the Retrofit2 dependency in Android to make API calls GET requests. Retrofit2 makes the whole task of calling APIs and parsing responses super easy with almost everything at your disposal.
This demo app uses a public Book Description API to demonstrate the usage.


### Activites

* Splash
* MainActivity with recycler view to fetch and display data from the API
* BookDetails activity to display all the information w.r.t a selected book

### Retrofit Helper

```   
public class RetrofitHelper {

        private static RetrofitHelper instance = null;
        private final ServiceInterface serviceInterface;

        private RetrofitHelper() {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(ServiceInterface.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            serviceInterface = retrofit.create(ServiceInterface.class);
        }

        public static synchronized RetrofitHelper getInstance() {
            if (instance == null) {
                instance = new RetrofitHelper();
            }
            return instance;
        }

        public ServiceInterface getServiceInterface() {
            return serviceInterface;
        }
    }
```

### Network Service Interface
```
public interface ServiceInterface {

    String BASE_URL = "https://run.mocky.io/v3/";

    @GET("a0528e65-80c9-4172-9231-876a622f25ef")
    Call<DataModel> getBooksList();
}
```

## API
Try out the api from the website like provided below

https://designer.mocky.io/

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
