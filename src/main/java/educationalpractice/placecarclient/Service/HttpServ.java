package educationalpractice.placecarclient.Service;

import okhttp3.*;

import java.io.IOException;

public class HttpServ {

    private static OkHttpClient client = new OkHttpClient();
    private final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    ErrorAlertServ alertService = new ErrorAlertServ();
    public String get(String url) {
        String result = "";
        Request request = new Request
                .Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            System.out.println(response);
            if (!response.isSuccessful()) {
                throw new IOException("Зaпpoc к cepвepy не был успешен: " +
                        response.code() + " " + response.message());
            }
            result = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }

    public String post(String url, String data){
        String result = "";
        RequestBody body = RequestBody.create(data, JSON);
        Request.Builder requestBuilder = new Request.Builder().url(url).post(body);
        Request request = requestBuilder.build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Запрос к серверу не был успешен: " + response.code() + " " + response.message());
            }
            result = response.body().string();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            return result;
        }
    }

    public String put(String url, String data){
        String result = "";
        RequestBody body = RequestBody.create(data, JSON);
        Request.Builder requestBuilder = new Request.Builder().url(url).put(body);
        Request request = requestBuilder.build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Запрос к серверу не был успешен: " + response.code() + " " + response.message());
            }
            result = response.body().string();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            return result;
        }
    }
    public String delete(String url, Long id){
        String result = "";
        Request.Builder requestBuild = new Request.Builder().url(url + id).delete();
        Request request = requestBuild.build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Запрос к серверу не был успешен: " + response.code() + " " + response.message());
            }
            result = response.body().string();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            return  result;
        }
    }
}